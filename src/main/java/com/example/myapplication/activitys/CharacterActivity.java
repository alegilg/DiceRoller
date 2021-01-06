package com.example.myapplication.activitys;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.example.myapplication.R;
import com.example.myapplication.characterscreen.Character;
import com.example.myapplication.characterscreen.SavingThrow;
import com.example.myapplication.characterscreen.Skill;
import com.example.myapplication.utils.Ability;
import com.example.myapplication.utils.SkillName;


import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CharacterActivity extends AppCompatActivity {
    List<Character> characters;
    List<Button> buttons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.character_activity);

        characters = new ArrayList<>();
        defaultCharacter();
        createCharScrollView();
        //createCharacter();
    }

    private void createCharScrollView() {
        ScrollView characterScroll = (ScrollView)findViewById(R.id.character_scroll);
        LinearLayout linearLayout = new LinearLayout(this);
        for (Character character : characters) {
            Button button = new Button(this);
            button.setText(character.getName());
            button.setWidth(characterScroll.getWidth());
            linearLayout.addView(button);
        }
        characterScroll.addView(linearLayout);
    }

    private void createCharacter() {

    }

    private void defaultCharacter() {
        int[] intArray = new int[6];
        Arrays.fill(intArray, 6);
        ArrayList<SavingThrow> lista = new ArrayList<>();
        lista.add(new SavingThrow("WIS", false, 3));
        ArrayList<Skill> skills = new ArrayList<>();
        skills.add(new Skill(SkillName.Acrobatics, Ability.Charisma, false, false, 3));
        characters.add(new Character("Default", intArray, false, 3, lista, skills, new ArrayList<>()));

    }
}
