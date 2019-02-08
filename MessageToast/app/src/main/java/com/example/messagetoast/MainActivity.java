package com.example.messagetoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button botao;
    private static final int DURATION_EXECUTION = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botao = findViewById(R.id.btClique);

        botao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //PARA BUSCAR O ATRIBUTO DE CIMA É MainActivity.DURATION_EXECUTION
                Toast.makeText(getApplicationContext(), "Você clicou no botão", Toast.LENGTH_LONG).show();

            }
        });
    }
}
