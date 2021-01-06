package com.example.myapplication.characterscreen;

import com.example.myapplication.utils.CustomButton;

import java.util.List;

public class Character {
    private String name;
    private int[] abilityScore;
    private boolean jackOfAllTrades;
    private int proficiencyBonus;
    private List<SavingThrow> savingThrowProficiencies;
    private List<Skill> skillsProficiencies;
    private List<CustomButton> customButtons;

    public Character(String name, int[] abilityScore, boolean jackOfAllTrades, int proficiencyBonus, List<SavingThrow> savingThrowProficiencies, List<Skill> skillsProficiencies, List<CustomButton> customButtons) {
        this.name = name;
        this.abilityScore = abilityScore;
        this.jackOfAllTrades = jackOfAllTrades;
        this.proficiencyBonus = proficiencyBonus;
        this.savingThrowProficiencies = savingThrowProficiencies;
        this.skillsProficiencies = skillsProficiencies;
        this.customButtons = customButtons;
    }

    public String getName() {
        return name;
    }

    public int[] getAbilityScore() {
        return abilityScore;
    }

    public boolean isJackOfAllTrades() {
        return jackOfAllTrades;
    }

    public int getProficiencyBonus() {
        return proficiencyBonus;
    }

    public List<SavingThrow> getSavingThrowProficiencies() {
        return savingThrowProficiencies;
    }

    public List<Skill> getSkillsProficiencies() {
        return skillsProficiencies;
    }

    public List<CustomButton> getCustomButtons() {
        return customButtons;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAbilityScore(int[] abilityScore) {
        this.abilityScore = abilityScore;
    }

    public void setJackOfAllTrades(boolean jackOfAllTrades) {
        this.jackOfAllTrades = jackOfAllTrades;
    }

    public void setProficiencyBonus(int proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }

    public void setSavingThrowProficiencies(List<SavingThrow> savingThrowProficiencies) {
        this.savingThrowProficiencies = savingThrowProficiencies;
    }

    public void setSkillsProficiencies(List<Skill> skillsProficiencies) {
        this.skillsProficiencies = skillsProficiencies;
    }

    public void setCustomButtons(List<CustomButton> customButtons) {
        this.customButtons = customButtons;
    }
}
