package com.example.fuenlago;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Profile extends AppCompatActivity {

    private Button ButtonAjustes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        ButtonAjustes = findViewById(R.id.Ajustes);
        ButtonAjustes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
            }
        });

    }

    public void openSettingsActivity(){
        Intent intent = new Intent(this,Settings.class);
        startActivity(intent);
    }
}
