package com.example.myapplication.characterscreen;

import com.example.myapplication.utils.Ability;
import com.example.myapplication.utils.SkillName;

public class Skill {
    private SkillName name;
    private Ability ability;
    private boolean isProficient, isExpert;
    private int extraValue;

    public Skill(SkillName name, Ability ability, boolean isProficient, boolean isExpert, int extraValue) {
        this.name = name;
        this.ability = ability;
        this.isProficient = isProficient;
        this.isExpert = isExpert;
        this.extraValue = extraValue;
    }
}
