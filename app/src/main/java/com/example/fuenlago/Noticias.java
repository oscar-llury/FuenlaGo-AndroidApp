package com.example.fuenlago;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

public class Noticias extends AppCompatActivity {

    private boolean ayuda = false;
    private ImageButton ayudaButton;
    private ConstraintLayout help1;
    private ConstraintLayout help2;
    private ConstraintLayout help3;

    private Button new1;
    private Button new2;
    private Button new3;
    private Button new4;
    private Button new5;
    private Button new6;
    private Button new7;
    private Button new8;

    private ImageButton closeNew1;
    private ImageButton closeNew2;
    private ImageButton closeNew3;
    private ImageButton closeNew4;
    private ImageButton closeNew5;
    private ImageButton closeNew6;
    private ImageButton closeNew7;
    private ImageButton closeNew8;

    private ConstraintLayout theNew1;
    private ConstraintLayout theNew2;
    private ConstraintLayout theNew3;
    private ConstraintLayout theNew4;
    private ConstraintLayout theNew5;
    private ConstraintLayout theNew6;
    private ConstraintLayout theNew7;
    private ConstraintLayout theNew8;


    private ImageButton cora1;
    private ImageButton cora2;
    private ImageButton cora3;
    private ImageButton cora4;
    private ImageButton cora5;
    private ImageButton cora6;
    private ImageButton cora7;
    private ImageButton cora8;

    private ImageButton incora1;
    private ImageButton incora2;
    private ImageButton incora3;
    private ImageButton incora4;
    private ImageButton incora5;
    private ImageButton incora6;
    private ImageButton incora7;
    private ImageButton incora8;

    private TextView numcora1;
    private TextView numcora2;
    private TextView numcora3;
    private TextView numcora4;
    private TextView numcora5;
    private TextView numcora6;
    private TextView numcora7;
    private TextView numcora8;

    private TextView numincora1;
    private TextView numincora2;
    private TextView numincora3;
    private TextView numincora4;
    private TextView numincora5;
    private TextView numincora6;
    private TextView numincora7;
    private TextView numincora8;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_noticias);

        //PONER LOS NUMEROS RANDOS A LOS CORAZONES
        numcora1 = (TextView) findViewById(R.id.numcora1);
        setNumCora(numcora1);
        numincora1 = (TextView) findViewById(R.id.numincora1);
        setNumInCora(numincora1);

        numcora2 = (TextView) findViewById(R.id.numcora2);
        setNumCora(numcora2);
        numincora2 = (TextView) findViewById(R.id.numincora2);
        setNumInCora(numincora2);

        numcora3 = (TextView) findViewById(R.id.numcora3);
        setNumCora(numcora3);
        numincora3 = (TextView) findViewById(R.id.numincora3);
        setNumInCora(numincora3);

        numcora4 = (TextView) findViewById(R.id.numcora4);
        setNumCora(numcora4);
        numincora4 = (TextView) findViewById(R.id.numincora4);
        setNumInCora(numincora4);

        numcora5 = (TextView) findViewById(R.id.numcora5);
        setNumCora(numcora5);
        numincora5 = (TextView) findViewById(R.id.numincora5);
        setNumInCora(numincora5);

        numcora6 = (TextView) findViewById(R.id.numcora6);
        setNumCora(numcora6);
        numincora6 = (TextView) findViewById(R.id.numincora6);
        setNumInCora(numincora6);

        numcora7 = (TextView) findViewById(R.id.numcora7);
        setNumCora(numcora7);
        numincora7 = (TextView) findViewById(R.id.numincora7);
        setNumInCora(numincora7);

        numcora8 = (TextView) findViewById(R.id.numcora8);
        setNumCora(numcora8);
        numincora8 = (TextView) findViewById(R.id.numincora8);
        setNumInCora(numincora8);


        //SI LE DAS AL CORAZON SUBE EL MARCADOR
        cora1 = findViewById(R.id.cora1);
        cora1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseNum(numcora1);
            }
        });

        cora2 = findViewById(R.id.cora2);
        cora2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseNum(numcora2);
            }
        });

        cora3 = findViewById(R.id.cora3);
        cora3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseNum(numcora3);
            }
        });

        cora4 = findViewById(R.id.cora4);
        cora4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseNum(numcora4);
            }
        });

        cora5 = findViewById(R.id.cora5);
        cora5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseNum(numcora5);
            }
        });

        cora6 = findViewById(R.id.cora6);
        cora6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseNum(numcora6);
            }
        });

        cora7 = findViewById(R.id.cora7);
        cora7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseNum(numcora7);
            }
        });

        cora8 = findViewById(R.id.cora8);
        cora8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                increaseNum(numcora8);
            }
        });

        //SI LE DAS AL CORAZON ROTO SUBE EL MARCADOR
        incora1 = findViewById(R.id.incora1);
        incora1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseNum(numincora1);
            }
        });

        incora2 = findViewById(R.id.incora2);
        incora2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseNum(numincora2);
            }
        });

        incora3 = findViewById(R.id.incora3);
        incora3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseNum(numincora3);
            }
        });

        incora4 = findViewById(R.id.incora4);
        incora4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseNum(numincora4);
            }
        });

        incora5 = findViewById(R.id.incora5);
        incora5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseNum(numincora5);
            }
        });

        incora6 = findViewById(R.id.incora6);
        incora6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseNum(numincora6);
            }
        });

        incora7 = findViewById(R.id.incora7);
        incora7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseNum(numincora7);
            }
        });

        incora8 = findViewById(R.id.incora8);
        incora8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decreaseNum(numincora8);
            }
        });

        new1 = findViewById(R.id.new1);
        new1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew1 = findViewById(R.id.thenew1);
                theNew1.setVisibility(View.VISIBLE);
            }
        });

        closeNew1 = findViewById(R.id.closenew1);
        closeNew1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew1 = findViewById(R.id.thenew1);
                theNew1.setVisibility(View.GONE);
            }
        });

        new2 = findViewById(R.id.new2);
        new2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew2 = findViewById(R.id.thenew2);
                theNew2.setVisibility(View.VISIBLE);
            }
        });

        closeNew2 = findViewById(R.id.closenew2);
        closeNew2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew2 = findViewById(R.id.thenew2);
                theNew2.setVisibility(View.GONE);
            }
        });

        new3 = findViewById(R.id.new3);
        new3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew3 = findViewById(R.id.thenew3);
                theNew3.setVisibility(View.VISIBLE);
            }
        });

        closeNew3 = findViewById(R.id.closenew3);
        closeNew3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew3 = findViewById(R.id.thenew3);
                theNew3.setVisibility(View.GONE);
            }
        });

        new4 = findViewById(R.id.new4);
        new4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew4 = findViewById(R.id.thenew4);
                theNew4.setVisibility(View.VISIBLE);
            }
        });

        closeNew4 = findViewById(R.id.closenew4);
        closeNew4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew4 = findViewById(R.id.thenew4);
                theNew4.setVisibility(View.GONE);
            }
        });

        new5 = findViewById(R.id.new5);
        new5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew5 = findViewById(R.id.thenew5);
                theNew5.setVisibility(View.VISIBLE);
            }
        });

        closeNew5 = findViewById(R.id.closenew5);
        closeNew5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew5 = findViewById(R.id.thenew5);
                theNew5.setVisibility(View.GONE);
            }
        });

        new6 = findViewById(R.id.new6);
        new6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew6 = findViewById(R.id.thenew6);
                theNew6.setVisibility(View.VISIBLE);
            }
        });

        closeNew6 = findViewById(R.id.closenew6);
        closeNew6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew6 = findViewById(R.id.thenew6);
                theNew6.setVisibility(View.GONE);
            }
        });

        new7 = findViewById(R.id.new7);
        new7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew7 = findViewById(R.id.thenew7);
                theNew7.setVisibility(View.VISIBLE);
            }
        });

        closeNew7 = findViewById(R.id.closenew7);
        closeNew7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew7 = findViewById(R.id.thenew7);
                theNew7.setVisibility(View.GONE);
            }
        });

        new8 = findViewById(R.id.new8);
        new8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew8 = findViewById(R.id.thenew8);
                theNew8.setVisibility(View.VISIBLE);
            }
        });

        closeNew8 = findViewById(R.id.closenew8);
        closeNew8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                theNew8 = findViewById(R.id.thenew8);
                theNew8.setVisibility(View.GONE);
            }
        });

        ayudaButton = findViewById(R.id.ayudaButton);
        ayudaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                help1 = findViewById(R.id.help1);
                help2 = findViewById(R.id.help2);
                help3 = findViewById(R.id.help3);

                if (ayuda) {
                    ayuda = false;
                    help1.setVisibility(View.GONE);
                    help2.setVisibility(View.GONE);
                    help3.setVisibility(View.GONE);
                } else {
                    ayuda = true;
                    help1.setVisibility(View.VISIBLE);
                    help2.setVisibility(View.VISIBLE);
                    help3.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void increaseNum (TextView textView) {
        textView.setText(Integer.toString(Integer.parseInt(textView.getText().toString())+1));
    }

    private void decreaseNum (TextView textView) {
        textView.setText(Integer.toString(Integer.parseInt(textView.getText().toString())-1));
    }

    private void setNumCora (TextView textView) {
        Random r = new Random();
        textView.setText(Integer.toString(r.nextInt(200)));
    }

    private void setNumInCora (TextView textView) {
        Random r = new Random();
        textView.setText(Integer.toString(r.nextInt(75)));
    }


}
