package com.example.myapplication.utils;

public enum DieType {

    D4(4),
    D6(6),
    D8(8),
    D10(10),
    D12(12),
    D20(20);

    private int value;
    DieType(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
