package com.castro.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_RESULT = "com.castro.courtcounter.RESULT";
    public static final String EXTRA_TEAM = "com.castro.courtcounter.TEAM";
    private TextView textscoreAteam;
    private TextView textscoreBteam;

    Team teamA;
    Team teamB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        teamA = new Team("Warriors");
        teamB = new Team("Lakers");
        textscoreAteam = (TextView) findViewById(R.id.scoreA);
        textscoreBteam = (TextView) findViewById(R.id.scoreB);
        TextView lbl_A = (TextView) findViewById(R.id.labelA);
        TextView lbl_B = (TextView) findViewById(R.id.labelB);
        lbl_A.setText(teamA.getName());
        lbl_B.setText(teamB.getName());
    }
/** /
    public void scoreThreePointsTeamA (View v){
        scoreAteam = scoreAteam + 3;
        textscoreAteam.setText(String.valueOf(scoreAteam));
    }

    public void scoreThreePointsTeamB (View v){
        scoreBteam = scoreBteam + 3;
        textscoreBteam.setText(String.valueOf(scoreBteam));
    }

/**/

    /**
     * This method is called when the +3 Points button is clicked
     * @param v - View
     */

    public void scoreThreePoints (View v){
        if (v.getId() == R.id.btn_threepointsA){
            teamA.addScore(3);
            textscoreAteam.setText(String.valueOf(teamA.getScore()));
        }else {
            teamB.addScore(3);
            textscoreBteam.setText(String.valueOf(teamB.getScore()));
        }
    }

    /**
     * This method is called when +2 Points button is clicked
     * @param v - View
     */

    public void scoreTwoPoints (View v){
        if (v.getId() == R.id.btn_twopointsA){
            teamA.addScore(2);
            textscoreAteam.setText(String.valueOf(teamA.getScore()));
        }else{
            teamB.addScore(2);
            textscoreBteam.setText(String.valueOf(teamB.getScore()));
        }
    }
/** /
    public void scoreTwoPointsTeamA (View v){
        scoreAteam = scoreAteam + 2;
        textscoreAteam.setText(String.valueOf(scoreAteam));
    }

    public void scoreTwoPointsTeamB (View v){
        scoreBteam = scoreBteam + 2;
        textscoreBteam.setText(String.valueOf(scoreBteam));
    }
/**/

    /**
     * This method is called when FreeThrow button is clicked
     * @param v - View
     */

    public void freeThrow (View v) {
        if (v.getId() == R.id.btn_freethrowA) {
            teamA.addScore(1);
            textscoreAteam.setText(String.valueOf(teamA.getScore()));
        } else {
            teamB.addScore(1);
            textscoreBteam.setText(String.valueOf(teamB.getScore()));
        }
    }

/** /
    public void freeThrowAteam (View v){
        scoreAteam = scoreAteam + 1;
        textscoreAteam.setText(String.valueOf(scoreAteam));
    }

    public void freeThrowBteam (View v){
        scoreBteam = scoreBteam + 1;
        textscoreBteam.setText(String.valueOf(scoreBteam));
    }
/**/

    /**
     * this method is called when the Reset button is clicked
     * @param v - View
     */

    public void resetScore (View v){
        teamA.resetScore();
        teamB.resetScore();
        textscoreAteam.setText(String.valueOf(teamA.getScore()));
        textscoreBteam.setText(String.valueOf(teamB.getScore()));
    }

    /**
     * this method is called when the finish match button is clicked
     */

    public void finishMatch (View v){
        Intent winnerScreen = new Intent(this, ResultActivity.class);
        if (teamA.getScore() == teamB.getScore()){
            //empate
            winnerScreen.putExtra(EXTRA_RESULT, "DRAW");
            winnerScreen.putExtra(EXTRA_TEAM, teamA.getName()+ " x " + teamB.getName());
            startActivity(winnerScreen);
        }else if (teamA.getScore() > teamB.getScore()){
            winnerScreen.putExtra(EXTRA_RESULT,"WINNER");
            winnerScreen.putExtra(EXTRA_TEAM,teamA.getName());
            startActivity(winnerScreen);
        }else {
            winnerScreen.putExtra(EXTRA_RESULT,"WINNER");
            winnerScreen.putExtra(EXTRA_TEAM,teamB.getName());
            startActivity(winnerScreen);
        }
    }

}
