package com.example.signos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    public ListView listaDeMeses;
    private String[] meses = {"Jan", "Fev", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Out", "Nov", "Dez"};
    private String[] perfil = {"1 mes", "2 mes", "3 mes", "4 mes", "5 mes", "6 mes", "7 mes", "8 mes", "9 mes", "10 mes", "11 mes", "12 mes"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDeMeses = findViewById(R.id.listViewId);

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(
                getApplicationContext(),
                android.R.layout.simple_list_item_1,
                android.R.id.text1,
                meses
        );

        listaDeMeses.setAdapter( adaptador );

        listaDeMeses.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                int codPosicao = position;
                Toast.makeText(MainActivity.this, perfil[codPosicao], Toast.LENGTH_SHORT).show();
            }
        });
    }
}
