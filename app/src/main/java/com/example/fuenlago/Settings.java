package com.example.fuenlago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Settings extends AppCompatActivity {

    private Button ButtonProfile;

    private ImageButton ButtonAjustes;
    private ImageButton ButtonHome;
    private ImageButton ButtonEventos;
    private ImageButton ButtonNoticias;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ButtonProfile= findViewById(R.id.Perfil);
        ButtonProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openProfileActivity();
            }
        });

        ButtonNoticias = findViewById(R.id.imageButtonNoticias);
        ButtonNoticias.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNoticiasActivity();
            }
        });
        ButtonAjustes = findViewById(R.id.imageButtonAjustes);
        ButtonAjustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
            }
        });
        ButtonHome = findViewById(R.id.imageButtonHome);
        ButtonHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHomeActivity();
            }
        });
        ButtonEventos = findViewById(R.id.imageButtonEventos);
        ButtonEventos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openEventsActivity();
            }
        });


    }

    public void openProfileActivity(){
        Intent intent = new Intent(this,Profile.class);
        startActivity(intent);
    }
    private void openNoticiasActivity() {
        Intent intent = new Intent(this, Noticias.class);
        startActivity(intent);
    }

    private void openSettingsActivity(){
        Intent intent = new Intent(this,Settings.class);
        startActivity(intent);
    }
    private void openHomeActivity(){
        Intent intent = new Intent(this,MainActivity.class);
        startActivity(intent);
    }
    private void openEventsActivity(){
        //Intent intent = new Intent(this,MainActivity.class);
        //startActivity(intent);
    }
}
