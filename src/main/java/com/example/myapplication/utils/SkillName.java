package com.example.myapplication.utils;

public enum SkillName {

    Athletics("STR"),
    Acrobatics("DEX"),
    SleightOfHand("DEX"),
    Stealth("DEX"),
    Arcana("INT"),
    History("INT"),
    Investigation("INT"),
    Nature("INT"),
    Religion("INT"),
    AnimalHandling("WIS"),
    Insight("WIS"),
    Medicine("WIS"),
    Perception("WIS"),
    Survival("WIS"),
    Deception("CHR"),
    Intimidation("CHR"),
    Performance("CHR"),
    Persuasion("CHR");

    String ability;

    SkillName(String ability) {
        this.ability = ability;
    }
}
