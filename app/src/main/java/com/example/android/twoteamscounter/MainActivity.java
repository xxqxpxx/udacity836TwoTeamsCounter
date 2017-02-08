package com.example.android.twoteamscounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int goals1 = 0 , goals2 = 0 , fouls1 = 0 , fouls2 = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goal1(View v)
    {
        ++goals1;
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(goals1));
    }

    public void goal2(View v)
    {
        ++goals2;
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(goals2));
    }

    public void foul1(View v)
    {
        ++fouls1;
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(fouls1));
    }

    public void foul2(View v)
    {
        ++fouls2;
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(fouls2));
    }

    public void resetScore(View v) {
        int goals1 = 0 , goals2 = 0 , fouls1 = 0 , fouls2 = 0;

        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(goals1));

        scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(goals2));

        scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(fouls1));

        scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(fouls2));

    }

}
