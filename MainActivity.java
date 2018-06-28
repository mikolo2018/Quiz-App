package com.example.android.quizapp1;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Button option1, option2, option3, option4;

    TextView score, question;

    private Questions mQuestions = new Questions();

    private String mAnswers;
    private int mScore = 0;
    private int mQuestionsLength = mQuestions.mQuestions.length;

    Random r;




    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        r = new Random();


        option1 = (Button) findViewById(R.id.option1);
        option2 = (Button) findViewById(R.id.option2);
        option3 = (Button) findViewById(R.id.option3);
        option4 = (Button) findViewById(R.id.option4);

        score = (TextView) findViewById(R.id.score);
        question = (TextView) findViewById(R.id.question);

        score.setText(" Score: " + mScore);

        updateQuestion(r.nextInt(mQuestionsLength));

        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(option1.getText() == mAnswers) {
                    mScore++;
                    score.setText(" Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    quizOver();
                }

            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(option2.getText() == mAnswers) {
                    mScore++;
                    score.setText(" Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    quizOver();
                }

            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(option3.getText() == mAnswers) {
                    mScore++;
                    score.setText(" Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    quizOver();
                }

            }
        });

        option4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(option4.getText() == mAnswers) {
                    mScore++;
                    score.setText(" Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    quizOver();
                }
            }
        });

    }
    private void updateQuestion(int num) {
        question.setText(mQuestions.getQuestion(num));
        option1.setText(mQuestions.getChoices1(num));
        option2.setText(mQuestions.getChoices2(num));
        option3.setText(mQuestions.getChoices3(num));
        option4.setText(mQuestions.getChoices4(num));

        mAnswers = mQuestions.getCorrectAnswer(num);
    }

    private void quizOver(){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
        alertDialogBuilder
                .setMessage(" Quiz Over " + mScore + " points. ")
                .setCancelable(false)
                .setPositiveButton("NEW QUIZ",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                    startActivity(new Intent(getApplicationContext(), MainActivity.class));
                                    finish();
                            }
                        })
                        .setNegativeButton("EXIT",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                finish();

                            }
                        });
        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();

    }

}
