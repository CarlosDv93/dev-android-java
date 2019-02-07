package com.example.adivinha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button btEscolherFrase;
    private TextView txtFrase;
    private String[] frases = {
        "Teste Frase 1",
        "Teste Frase 2",
        "Teste Frase 3"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btEscolherFrase = (Button) findViewById(R.id.btEscolherFrase);
        txtFrase = findViewById(R.id.fraseTV);

        btEscolherFrase.setOnClickListener( new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Random randomico = new Random();
                int numeroAleatorio = randomico.nextInt(frases.length);

                txtFrase.setText(frases[numeroAleatorio]);
            }
        });

    }
}
