package com.example.myapplication.characterscreen;

import com.example.myapplication.utils.Ability;
import com.example.myapplication.utils.DieType;

public class Rolling {
    private DieType dieType;
    private int dieQuantity, extraModifier;
    private Ability ability;

    public Rolling(DieType dieType, int dieQuantity, int extraModifier, Ability ability) {
        this.dieType = dieType;
        this.dieQuantity = dieQuantity;
        this.extraModifier = extraModifier;
        this.ability = ability;
    }
}
