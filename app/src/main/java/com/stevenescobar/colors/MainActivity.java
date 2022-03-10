package com.stevenescobar.colors;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView lblTargetColor = null;
    private TextView lblProposedColor = null;
    private SeekBar sbrRed = null;
    private SeekBar sbrGreen = null;
    private SeekBar sbrBlue = null;
    private TextView lblRedValue = null;
    private TextView lblGreenValue = null;
    private TextView lblBlueValue = null;
    private Button btnGetScore = null;
    private Button btnNewColor = null;

    private ColorsGame colorsGame = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void initViews(){
       lblTargetColor = findViewById(R.id.lblTargetColor);
       lblProposedColor = findViewById(R.id.lblProposedColor);

       sbrRed = findViewById(R.id.sbrRed);
       sbrGreen = findViewById(R.id.sbrGreen);
       sbrBlue = findViewById(R.id.sbrBlue);

       lblRedValue = findViewById(R.id.lblRedValue);
       lblGreenValue = findViewById(R.id.lblGreenValue);
       lblBlueValue = findViewById(R.id.lblBlueValue);

       btnGetScore = findViewById(R.id.btnGetScore);
       btnNewColor = findViewById(R.id.btnNewColor);

    }

    public void  initEvents(){
        SeekBar[] seekBars = {sbrRed, sbrGreen, sbrBlue};

        for(SeekBar seekBar: seekBars){
            seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
                @Override
                public void onProgressChanged(SeekBar seekBar, int i, boolean b) {

                }

                @Override
                public void onStartTrackingTouch(SeekBar seekBar) {

                }

                @Override
                public void onStopTrackingTouch(SeekBar seekBar) {

                }
            });
        }

        //btnGetScore.setOnClickListener(view -> showScore());
        //btnGetScore.setOnClickListener(view -> restartScore());
    }

    public void restartGame(){
        colorsGame.restartGame();
    }

    public void updateValues(){

        int redValue = sbrRed.getProgress();
        int greenValue = sbrRed.getProgress();
        int blueValue = sbrRed.getProgress();
        int newBackColor = Color.rgb(redValue, greenValue, blueValue);

        colorsGame.setProposedBackColor(newBackColor);

    }



}