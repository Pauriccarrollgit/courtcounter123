package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(100);

        /**displayForTeamA is used to define a score straight of the bat
         */
    }

    /** Creating a method Public Void / Method name / Method
     * parameters/ What happens. Remember we need to associate this
     * with a button
     */

    public void addThreeForTeam(View v) {
        displayForTeamA(3);
    }


    public void addTwoForTeam(View v) {
        displayForTeamA(2);
    }

    public void addOneForTeam(View v) {
        displayForTeamA(1);
    }

    /**Displays the given score for Team A. this matches exactly with
     * android:id="@+id/team_a_score"
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
}
