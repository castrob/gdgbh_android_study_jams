package com.castro.courtcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent WinnerScreen = getIntent();

        TextView team = (TextView) findViewById(R.id.team_text_view);
        TextView result = (TextView) findViewById(R.id.result_text_view);

        String messageResult = WinnerScreen.getStringExtra(MainActivity.EXTRA_RESULT);
        String messageTeam = WinnerScreen.getStringExtra(MainActivity.EXTRA_TEAM);

        if (messageResult.equals("DRAW")){
            result.setText(messageResult);
            team.setText(messageTeam);
            team.setTextSize(36);
        }else{
            result.setText(messageResult);
            team.setText(messageTeam);
            team.setTextSize(50);
        }
    }
}
