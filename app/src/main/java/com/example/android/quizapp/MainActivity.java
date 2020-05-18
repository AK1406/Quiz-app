package com.example.android.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void submitQuiz(View v) {
        Button submitBtn = (Button) findViewById(R.id.submit_btn);
        submitBtn.setVisibility(View.INVISIBLE);
        displayScore(quizScore());
    }

    public void displayScore(int qScore) {
        if (qScore > 16 && qScore <= 20) {
            Toast.makeText(this, "Score :" + qScore + " Grade: A+ Awesome!", Toast.LENGTH_LONG).show();
        } else if (qScore > 11 && qScore <= 15) {
            Toast.makeText(this, "Score :" + qScore + " Grade: A Keep it up!", Toast.LENGTH_LONG).show();
        } else if (qScore >= 6 && qScore <= 10) {
            Toast.makeText(this, "Score :" + qScore + " Grade: B Try again!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "Score:" + qScore + " Grade: Fail Try again!", Toast.LENGTH_LONG).show();
        }


    }

    private int quizScore() {
        question1();
        question2();
        question3();
        question4();
        question5();
        question6();
        question7();
        question8();
        question9();
        question10();
        return score;
    }

    public void question1() {
        RadioButton ans4 = (RadioButton) findViewById(R.id.q1op4);

        if (ans4.isChecked()) {
            score += 2;
        } else {
            score += 0;
        }

    }

    public void question2() {

        RadioButton ans1 = (RadioButton) findViewById(R.id.q2op1);
        if (ans1.isChecked()) {
            score += 2;
        }
    }


    public void question3() {

        RadioButton ans1 = (RadioButton) findViewById(R.id.q3op1);

        if (ans1.isChecked()) {
            score += 2;
        }
    }

    public void question4() {
        RadioButton ans2 = (RadioButton) findViewById(R.id.q4op2);
        if (ans2.isChecked()) {
            score += 2;
        }
    }

    public void question5() {

        CheckBox ans1 = (CheckBox) findViewById(R.id.q5op1);
        CheckBox ans2 = (CheckBox) findViewById(R.id.q5op2);
        CheckBox ans3 = (CheckBox) findViewById(R.id.q5op3);
        CheckBox ans4 = (CheckBox) findViewById(R.id.q5op4);

        if (ans1.isChecked() && ans2.isChecked() && ans3.isChecked() && !ans4.isChecked()) {
            score += 2;
        }
    }

    public void question6() {
        RadioButton ans4 = (RadioButton) findViewById(R.id.q6op4);
        if (ans4.isChecked()) {
            score += 2;
        }
    }

    public void question7() {

        CheckBox ans1 = (CheckBox) findViewById(R.id.q7op1);
        CheckBox ans2 = (CheckBox) findViewById(R.id.q7op2);
        CheckBox ans3 = (CheckBox) findViewById(R.id.q7op3);
        CheckBox ans4 = (CheckBox) findViewById(R.id.q7op4);

        if (ans1.isChecked() && !ans2.isChecked() && ans3.isChecked() && ans4.isChecked()) {
            score += 2;
        }
    }

    public void question8() {

        CheckBox ans1 = (CheckBox) findViewById(R.id.q8op1);
        CheckBox ans2 = (CheckBox) findViewById(R.id.q8op2);
        CheckBox ans3 = (CheckBox) findViewById(R.id.q8op3);
        CheckBox ans4 = (CheckBox) findViewById(R.id.q8op4);

        if (ans1.isChecked() && ans2.isChecked() && !ans3.isChecked() && !ans4.isChecked()) {
            score += 2;
        }
    }

    public void question9() {

        String answer9;
        EditText ans9 = (EditText) findViewById(R.id.q9Ans);
        answer9 = ans9.getText().toString();
        if (answer9.equals("sp")) {
            score += 2;
        }
    }

    public void question10() {
        String answer10;
        EditText ans10 = (EditText) findViewById(R.id.q10Ans);
        answer10 = ans10.getText().toString();
        if (answer10.equals("textSize")) {
            score += 2;
        }
    }

}
