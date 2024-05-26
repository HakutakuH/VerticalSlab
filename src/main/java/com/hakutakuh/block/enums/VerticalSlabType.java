package com.hakutakuh.block.enums;

import net.minecraft.util.StringIdentifiable;

public enum VerticalSlabType implements StringIdentifiable {
    SINGLE("single"),
    DOUBLE("double");

    private final String name;

    private VerticalSlabType(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    public String asString() {
        return this.name;
    }
}
