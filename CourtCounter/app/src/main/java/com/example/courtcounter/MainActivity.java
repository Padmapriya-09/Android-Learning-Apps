package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu)
//    {
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;
//    }
//
//    @Override
//    public boolean onOptionsItemSelected(MenuItem item)
//    {
//        int id = item.getItemId();
//        if(id==R.id.action_settings)
//        {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text_view_score_Team_A);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.text_view_score_Team_B);
        scoreView.setText(String.valueOf(score));
    }
    int scoreTeamA=0,scoreTeamB=0;
    public void threePointsForA(View view)
    {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    public void twoPointsForA(View view)
    {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    public void freeThrowForA(View view)
    {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    public void threePointsForB(View view)
    {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }
    public void twoPointsForB(View view)
    {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }
    public void freeThrowForB(View view)
    {
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    public void resetGame(View view)
    {
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
