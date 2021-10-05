package com.example.appcadastro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void botaoCriarContaClick(View view){
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(),TelaCadastro.class);
        startActivity(intent);
    }

    public void textoLoginClick(View view){
        Intent intent = new Intent();
        intent.setClass(getApplicationContext(),TelaLogin.class);
        startActivity(intent);
    }
}