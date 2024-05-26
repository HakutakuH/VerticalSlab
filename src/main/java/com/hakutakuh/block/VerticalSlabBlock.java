package com.hakutakuh.block;

import com.hakutakuh.block.enums.VerticalSlabType;
import com.mojang.serialization.MapCodec;
import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.fluid.FluidState;
import net.minecraft.fluid.Fluids;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.tag.FluidTags;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.*;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import org.jetbrains.annotations.Nullable;

public class VerticalSlabBlock extends Block implements Waterloggable {
    public static final MapCodec<VerticalSlabBlock> CODEC = createCodec(VerticalSlabBlock::new);
    public static final DirectionProperty FACING;
    public static final EnumProperty<VerticalSlabType> TYPE;
    public static final BooleanProperty WATERLOGGED;
    protected static final VoxelShape NORTH_SHAPE;
    protected static final VoxelShape SOUTH_SHAPE;
    protected static final VoxelShape EAST_SHAPE;
    protected static final VoxelShape WEST_SHAPE;

    public MapCodec<? extends VerticalSlabBlock> getCodec() {
        return CODEC;
    }

    public VerticalSlabBlock(AbstractBlock.Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)this.getDefaultState().with(FACING, Direction.NORTH).with(TYPE, VerticalSlabType.SINGLE)).with(WATERLOGGED, false));
    }

    public boolean hasSidedTransparency(BlockState state) {
        return state.get(TYPE) != VerticalSlabType.DOUBLE;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, TYPE, WATERLOGGED});
    }

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        VerticalSlabType verticalSlabType = (VerticalSlabType)state.get(TYPE);
        Direction direction = (Direction) state.get(FACING) ;
        if (verticalSlabType == VerticalSlabType.DOUBLE){
            return VoxelShapes.fullCube();
        }
        else {
            switch (direction) {
                case NORTH:
                    return NORTH_SHAPE;
                case SOUTH:
                    return SOUTH_SHAPE;
                case EAST:
                    return EAST_SHAPE;
                case WEST:
                    return WEST_SHAPE;
                default:
                    return NORTH_SHAPE;
            }
        }
    }

    @Nullable
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        BlockPos blockPos = ctx.getBlockPos();
        BlockState blockState = ctx.getWorld().getBlockState(blockPos);
        Direction direction = ctx.getHorizontalPlayerFacing().getOpposite();
        if (blockState.isOf(this)) {
            return (BlockState)((BlockState)blockState.with(TYPE, VerticalSlabType.DOUBLE)).with(WATERLOGGED, false);
        } else {
            FluidState fluidState = ctx.getWorld().getFluidState(blockPos);
            return (BlockState)((BlockState)((BlockState)this.getDefaultState().with(FACING, direction)).with(TYPE, VerticalSlabType.SINGLE)).with(WATERLOGGED, fluidState.getFluid() == Fluids.WATER);
        }
    }

    public boolean canReplace(BlockState state, ItemPlacementContext context) {
        ItemStack itemStack = context.getStack();
        VerticalSlabType verticalSlabType = (VerticalSlabType)state.get(TYPE);
        Direction direction1 = (Direction) state.get(FACING);
        if (verticalSlabType != VerticalSlabType.DOUBLE && itemStack.isOf(this.asItem())) {
            if (context.canReplaceExisting()) {
                boolean bl = context.getHitPos().z - (double)context.getBlockPos().getZ() > 0.5;
                boolean bl1 = context.getHitPos().x - (double)context.getBlockPos().getX() > 0.5;
                Direction direction = context.getSide();
                if (direction1 == Direction.NORTH) {
                    return direction == Direction.SOUTH || bl && direction.getAxis().isHorizontal();
                } else if (direction1 == Direction.SOUTH){
                    return direction == Direction.NORTH || !bl && direction.getAxis().isHorizontal();
                } else if (direction1 == Direction.EAST) {
                    return direction == Direction.WEST || bl1 && direction.getAxis().isHorizontal();
                } else {
                    return direction == Direction.EAST || !bl1 && direction.getAxis().isHorizontal();
                }
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public FluidState getFluidState(BlockState state) {
        return (Boolean)state.get(WATERLOGGED) ? Fluids.WATER.getStill(false) : super.getFluidState(state);
    }

    public boolean tryFillWithFluid(WorldAccess world, BlockPos pos, BlockState state, FluidState fluidState) {
        return state.get(TYPE) != VerticalSlabType.DOUBLE ? Waterloggable.super.tryFillWithFluid(world, pos, state, fluidState) : false;
    }

    public boolean canFillWithFluid(PlayerEntity player, BlockView world, BlockPos pos, BlockState state, Fluid fluid) {
        return state.get(TYPE) != VerticalSlabType.DOUBLE ? Waterloggable.super.canFillWithFluid(player, world, pos, state, fluid) : false;
    }

    public BlockState getStateForNeighborUpdate(BlockState state, Direction direction, BlockState neighborState, WorldAccess world, BlockPos pos, BlockPos neighborPos) {
        if ((Boolean)state.get(WATERLOGGED)) {
            world.scheduleFluidTick(pos, Fluids.WATER, Fluids.WATER.getTickRate(world));
        }

        return super.getStateForNeighborUpdate(state, direction, neighborState, world, pos, neighborPos);
    }

    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        switch (type) {
            case LAND:
                return false;
            case WATER:
                return world.getFluidState(pos).isIn(FluidTags.WATER);
            case AIR:
                return false;
            default:
                return false;
        }
    }

    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return (BlockState)state.with(FACING, rotation.rotate((Direction)state.get(FACING)));
    }

    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation((Direction)state.get(FACING)));
    }

    static {
        FACING = HorizontalFacingBlock.FACING;
        TYPE = EnumProperty.of("type", VerticalSlabType.class);
        WATERLOGGED = Properties.WATERLOGGED;
        NORTH_SHAPE = Block.createCuboidShape(0, 0, 8, 16, 16, 16);
        SOUTH_SHAPE = Block.createCuboidShape(0, 0, 0, 16, 16, 8);
        WEST_SHAPE = Block.createCuboidShape(8, 0, 0, 16, 16, 16);
        EAST_SHAPE = Block.createCuboidShape(0, 0, 0, 8, 16, 16);
    }
}
