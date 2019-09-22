package com.example.gilhakemi.textreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gilhakemi.textreader.core.Word;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class MainActivity extends AppCompatActivity implements MainView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void getWords() {

    }

    @Override
    public void showWords(List<Word> words) {

    }
}
