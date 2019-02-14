package com.example.qualserie;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {

    private SeekBar seekBar;
    private ImageView imagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = findViewById(R.id.seekBarId);
        imagem = findViewById(R.id.imagemExibicaoId);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(progress == 1){
                    imagem.setImageResource(R.drawable.pouco);
                } else if(progress == 2){
                    imagem.setImageResource(R.drawable.medio);
                } else if (progress == 3){
                    imagem.setImageResource(R.drawable.muito);
                } else if (progress == 4){
                    imagem.setImageResource(R.drawable.susto);
                } else {
                    imagem.setImageResource(android.R.color.transparent);
                }
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}
