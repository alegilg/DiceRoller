package com.example.myapplication.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.myapplication.R;
import com.example.myapplication.characterscreen.Character;
import com.example.myapplication.characterscreen.SavingThrow;
import com.example.myapplication.characterscreen.Skill;
import com.example.myapplication.utils.Ability;
import com.example.myapplication.utils.SkillName;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}