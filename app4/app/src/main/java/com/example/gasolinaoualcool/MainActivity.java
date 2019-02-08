package com.example.gasolinaoualcool;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText precoAlcool;
    private EditText precoGasolina;
    private TextView resultado;
    private Button verificar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        precoAlcool = findViewById(R.id.alcoolEtxt);
        precoGasolina = findViewById(R.id.gasolinaEtxt);
        verificar = findViewById(R.id.verificarBt);
        resultado = findViewById(R.id.resultadoTxt);

        verificar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtPrecoAlcool = precoAlcool.getText().toString();
                String txtPrecoGasolina = precoGasolina.getText().toString();

                Double valorAlcool = Double.parseDouble(txtPrecoAlcool);
                Double valorGasolina = Double.parseDouble(txtPrecoGasolina);

                //alcool / gasolina
                double resultadoAG = valorAlcool / valorGasolina;

                if(resultadoAG >= 0.7){
                    resultado.setText("É MELHOR UTILIZAR GASOLINA");
                } else {
                    resultado.setText("É MELHOR UTILIZAR ÁLCOOL");
                }
            }
        });

    }
}
