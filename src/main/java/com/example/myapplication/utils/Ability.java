package com.example.myapplication.utils;

public enum Ability {


    Strength("STR"),
    Dexterity("DEX"),
    Constitution("CON"),
    Intelligence("INT"),
    Wisdom("WIS"),
    Charisma("CHR");

    private String abbreviation;

    Ability(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation() {
        return abbreviation;
    }
}
