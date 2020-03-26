package com.example.fuenlago;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.fuenlago.ayuda;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.SeekBar;
import android.widget.Switch;

public class Settings extends AppCompatActivity {

    private Button ButtonProfile;

    private ImageButton ButtonAjustes;
    private ImageButton ButtonHome;
    private ImageButton ButtonEventos;
    private ImageButton ButtonNoticias;

    private boolean ayudaCheck = false;
    private ImageButton ayudaButton;
    private ConstraintLayout help1;
    private ConstraintLayout help2;
    private ConstraintLayout help3;
    private ConstraintLayout help4;
    private ConstraintLayout help5;
    private ConstraintLayout help6;
    private ayuda ayuda;
    private Button ocultarAyuda;

    private Button restablecer;
    private Switch daltonico;
    private Switch oscuro;

    private RadioButton pequeño;
    private RadioButton mediano;
    private RadioButton grande;
    private SeekBar volumen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ayuda = new ayuda();

        restablecer= findViewById(R.id.restablecer);
        daltonico= findViewById(R.id.switchDaltonico);
        oscuro= findViewById(R.id.switchOscuro);
        pequeño= findViewById(R.id.radioButtonP);
        mediano= findViewById(R.id.radioButtonM);
        grande= findViewById(R.id.radioButtonG);
        volumen= findViewById(R.id.volumen);
        ocultarAyuda= findViewById(R.id.ocultarAyuda);
        help1 = findViewById(R.id.help1);
        help2 = findViewById(R.id.help2);
        help3 = findViewById(R.id.help3);
        help4 = findViewById(R.id.help4);
        help5 = findViewById(R.id.help5);
        help6 = findViewById(R.id.help6);

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

        ayudaButton = findViewById(R.id.ayudaButton);
        if(!ayuda.isShowAyuda()){
            ayudaButton.setVisibility(View.GONE);
        }
        ocultarAyuda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ayuda.isShowAyuda()){
                    ocultarAyuda.setText("Mostrar ayuda");
                    ayudaButton.setVisibility(View.GONE);
                    ayudaCheck = false;
                    help1.setVisibility(View.GONE);
                    help2.setVisibility(View.GONE);
                    help3.setVisibility(View.GONE);
                    help4.setVisibility(View.GONE);
                    help5.setVisibility(View.GONE);
                    help6.setVisibility(View.GONE);
                    ayuda.setShowAyuda(false);
                }else {
                    ocultarAyuda.setText("Ocultar ayuda");
                    ayudaButton.setVisibility(View.VISIBLE);
                    ayuda.setShowAyuda(true);
                }
            }
        });

        ayudaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ayudaCheck) {
                    ayudaCheck = false;
                    help1.setVisibility(View.GONE);
                    help2.setVisibility(View.GONE);
                    help3.setVisibility(View.GONE);
                    help4.setVisibility(View.GONE);
                    help5.setVisibility(View.GONE);
                    help6.setVisibility(View.GONE);
                } else {
                    ayudaCheck = true;
                    help1.setVisibility(View.VISIBLE);
                    help2.setVisibility(View.VISIBLE);
                    help3.setVisibility(View.VISIBLE);
                    help4.setVisibility(View.VISIBLE);
                    help5.setVisibility(View.VISIBLE);
                    help6.setVisibility(View.VISIBLE);
                }
            }
        });
        restablecer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                daltonico.setChecked(false);
                oscuro.setChecked(false);
                pequeño.setChecked(false);
                mediano.setChecked(true);
                grande.setChecked(false);
                volumen.setProgress(3);
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
        Intent intent = new Intent(this,Error.class);
        startActivity(intent);
    }
}
