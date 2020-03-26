package com.example.fuenlago;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Profile extends AppCompatActivity {

    private Button ButtonMasAjustes;

    private ImageButton ButtonAjustes;
    private ImageButton ButtonHome;
    private ImageButton ButtonEventos;
    private ImageButton ButtonNoticias;

    private boolean ayuda = false;
    private ImageButton ayudaButton;
    private ConstraintLayout help1;
    private ConstraintLayout help2;
    private ConstraintLayout help3;
    private ConstraintLayout help4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ButtonMasAjustes = findViewById(R.id.Ajustes);
        ButtonMasAjustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
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

        ayudaButton = findViewById(R.id.ayudaButton);

        if(!Ayuda.isShowAyuda()){
            ayudaButton.setVisibility(View.GONE);
        }

        ayudaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                help1 = findViewById(R.id.help1);
                help2 = findViewById(R.id.help2);
                help3 = findViewById(R.id.help3);
                help4 = findViewById(R.id.help4);

                if (ayuda) {
                    ayuda = false;
                    help1.setVisibility(View.GONE);
                    help2.setVisibility(View.GONE);
                    help3.setVisibility(View.GONE);
                    help4.setVisibility(View.GONE);
                } else {
                    ayuda = true;
                    help1.setVisibility(View.VISIBLE);
                    help2.setVisibility(View.VISIBLE);
                    help3.setVisibility(View.VISIBLE);
                    help4.setVisibility(View.VISIBLE);
                }
            }
        });

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
        Intent intent = new Intent(this,Error.class);
        startActivity(intent);
    }
}
