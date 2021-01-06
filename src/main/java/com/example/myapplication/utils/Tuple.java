package com.example.myapplication.utils;

public class Tuple {

    private int result;
    private String stringedResult;

    public Tuple(int result, String stringedResult) {
        this.result = result;
        this.stringedResult = stringedResult;
    }

    public int getResult() {
        return result;
    }

    public String getStringedResult() {
        return stringedResult;
    }
}
