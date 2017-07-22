package com.castro.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // proprieties for score of both teams
    private int scoreAteam;
    private int scoreBteam;

    private TextView textscoreAteam;
    private TextView textscoreBteam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textscoreAteam = (TextView) findViewById(R.id.scoreA);
        textscoreBteam = (TextView) findViewById(R.id.scoreB);
    }

    public void scoreThreePointsTeamA (View v){
        scoreAteam = scoreAteam + 3;
        textscoreAteam.setText(String.valueOf(scoreAteam));
    }

    public void scoreThreePointsTeamB (View v){
        scoreBteam = scoreBteam + 3;
        textscoreBteam.setText(String.valueOf(scoreBteam));
    }

    public void scoreTwoPointsTeamA (View v){
        scoreAteam = scoreAteam + 2;
        textscoreAteam.setText(String.valueOf(scoreAteam));
    }

    public void scoreTwoPointsTeamB (View v){
        scoreBteam = scoreBteam + 2;
        textscoreBteam.setText(String.valueOf(scoreBteam));
    }

    public void freeThrowAteam (View v){
        scoreAteam = scoreAteam + 1;
        textscoreAteam.setText(String.valueOf(scoreAteam));
    }

    public void freeThrowBteam (View v){
        scoreBteam = scoreBteam + 1;
        textscoreBteam.setText(String.valueOf(scoreBteam));
    }

    public void resetScore (View v){
        scoreAteam = 0;
        scoreBteam = 0;
        textscoreAteam.setText(String.valueOf(scoreAteam));
        textscoreBteam.setText(String.valueOf(scoreBteam));
    }

}
