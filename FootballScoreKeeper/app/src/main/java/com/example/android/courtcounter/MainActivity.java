package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    starting scores for both sides
    int scoreTeamA = 0;
    int scoreTeamB = 0;
//    methods for TEAM A
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addSixToTeamA(android.view.View view){
        scoreTeamA = scoreTeamA+6;
        displayForTeamA(scoreTeamA);
    }
    public void addThreeToTeamA(android.view.View view){
        scoreTeamA = scoreTeamA+3;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoToTeamA(android.view.View view){
        scoreTeamA= scoreTeamA+2;
        displayForTeamA(scoreTeamA);
    }
// Methods For TEAM B
    public void addSixToTeamB(android.view.View view){
        scoreTeamB = scoreTeamB+6;
        displayForTeamB(scoreTeamB);
    }
    public void addThreeToTeamB(android.view.View view){
        scoreTeamB = scoreTeamB+3;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoToTeamB(android.view.View view){
        scoreTeamB= scoreTeamB+2;
        displayForTeamB(scoreTeamB);
    }



//    displays the score for teamA for various point changes
    public void displayForTeamA(int scoreA) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(""+scoreA));
    }
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(""+scoreB));
    }
//    reset button
    public void reset(android.view.View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}