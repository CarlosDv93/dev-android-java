package com.example.idadedecachorro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText idadeCachorro;
    private Button btnIdade;
    private TextView resultadoIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        idadeCachorro = findViewById(R.id.txtIdadeCachorro);
        btnIdade = findViewById(R.id.btIdade);
        resultadoIdade = findViewById(R.id.txtIdadeHumana);

        btnIdade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Recuperar o que foi digitado
                String idade = idadeCachorro.getText().toString();

                if(idade.isEmpty()){
                    resultadoIdade.setText("Nenhuma idade digitada");
                } else {
                    int valorDigitado = Integer.parseInt(idade);
                    int resultadoFinal = valorDigitado * 7;
                    resultadoIdade.setText("A idade do seu cachorro em anos humanos é: "+ resultadoFinal);
                }
            }
        });
    }
}
