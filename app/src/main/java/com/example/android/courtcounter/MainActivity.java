package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int counter = 0;
    int counter2 = 0 ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void free_Point(View view) {
        counter=counter + 1;
        display_pointsTeamA(counter);

    }

    public void add_2Points(View view) {
        counter=counter + 2;
        display_pointsTeamA(counter);
    }

    public void add_3Points(View view) {

        counter=counter + 3;
        display_pointsTeamA(counter);
    }


    private void display_pointsTeamA(int number){

        TextView teamA=(TextView)findViewById(R.id.team_score);
         teamA.setText("" + number);

    }

   // public void resetScoreA(View view) {
    //    counter = 0;
     //   display_pointsTeamA(counter);
   // }

    public void add_2PointsTeamB(View view) {
         counter2=counter2 + 2;
        displayPointsTeamB(counter2);
    }

    public void add_3PointsTeamB(View view) {
        counter2=counter2 + 3;
        displayPointsTeamB(counter2);
    }

    public void free_PointTeamB(View view) {
        counter2=counter2 + 1;
        displayPointsTeamB(counter2);
    }

  //  public void resetScoreB(View view) {

   //     counter2=0;
     //   displayPointsTeamB(counter2);
   // }

    private  void displayPointsTeamB(int number){

        TextView teamB=(TextView) findViewById(R.id.teamBscore_id);

        teamB.setText("" + number);
    }

    public void resetScore(View view) {
           counter = 0;
           counter2 = 0;
          display_pointsTeamA(counter);
        displayPointsTeamB(counter2);

         }
}
