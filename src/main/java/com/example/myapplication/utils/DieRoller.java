package com.example.myapplication.utils;

import java.util.Random;

public class DieRoller {

    Random random;

    public int rollDie(DieType dieType){
        return random.nextInt(dieType.getValue())+1;
    }

    public Tuple rollDice(DieType dieType, int quantity){
        int sum = 0;
        StringBuilder stringedSum = new StringBuilder();
        for (int i = 0; i < quantity; i++) {
            int result = rollDie(dieType);
            sum += result;
            stringedSum.append(result + '+');
        }
        return new Tuple(sum, stringedSum.substring(0,stringedSum.length()-1));
    }
}
