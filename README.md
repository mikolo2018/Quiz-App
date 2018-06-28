# Quiz App
# Quiz App
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

package com.example.android.quizapp1;

public class Questions {
    /**
     * @param for Questions
     */
    public String mQuestions[]= {
            "The difference between one-half of a number and one-fifth of it is 561. The number is:",
            "What percent of 36 is 27?",
            "Deborah decided to mow lawns to earn the $280 she needs for a school orchestra trip. If she earns $18 per lawn, what is the minimum number of lawns she needs to mow to earn the money for the trip?",
            "The cost to rent a construction crane is $750 per day plus $250 per hour of use. What is the maximum number of hours the crane can be used each day if the rental cost is not to exceed $2500 per day?",
            "What does a probability of 30%  that it will be raining tomorrow mean?",
            "How long is a Boxapede when it is 10 years old?",
            "Scientists are studying how Boxapedes grow.  One of the Boxapedes is 16 cubes long.  How old is this Boxapede?",
            "Another Boxapede that the scientist is studying has 20 legs.  How old is this Boxapede?",
            "When Boxapede was 7 years old he had an accident.  As a result of the accident, he lost 4 of his cubes.  How long was he after his accident?",
            "Which part of the plant holds it in the soil?",
            "This part of the plant absorbs energy from the sun.",
            "This part of the plant attracts bees, butterflies and humingbirds",
            "The __________ holds the plant upright",
            "Which polygon has more of the featured properties?",
            "Which attribute(s) is/are not shared by both the square and the rhombus?",

    };
    /**
     * @param for multiple choices for Questions
     */
    private String mChoices[][]={
            {"168", "280", "1870",  "5610"},
            {"36%", "50%", "66¾%",  "75%"},
            {"15", "16", "18",  "20"},
            {"2.5", "3.7", "7.0",  "13.0"},
            {"30% of 12 hours is about 3½ hours, so we will have 3½  hours of rain tomorrow", "30% is less than ½, so we will have rain tomorrow for less than half the day", "30% is less than 50% so more likely than not we will have a dry day tomorrow",  "You cannot tell because the weather forecast is often wrong"},
            {"10", "18", "31",  "80"},
            {"4", "5", "8",  "16"},
            {"2", "3", "4",  "5"},
            {"3", "11", "18",  "28"},
            {"Roots", "Sterm", "Flower", "Nut"},
            {"Fruit", "Leaves", "Seeds", "Stem"},
            {"Bark", "Flower", "Roots","Seed"},
            {"Flower", "Leaves", "Sterm","Bark"},
            {"Rectangle", "Quadrilateral", "Square","Triangle"},
            {"Equilateral", "Equiangular", "4-sides","Decagon"},
    };
    /**
     * @param for correct multiple choices
     */
    private String mCorrectAnswers[] = {"168", "75%", "16", "7.0", "30% is less than 50% so more likely than not we will have a dry day tomorrow.", "31", "5", "3", "18","Roots", "Leaves", "Flowers", "Sterm", "Square", "Equiangular"};

    /**
     *  all this method return the Choices of questions and correct answer
     * @param a
     * @return
     * This method called for the Question by each
     */
    public String getQuestion(int a) {
        String question = mQuestions[a];
        return question;
    }

    /**
     *
     * @param a
     * @return
     * This return choices for each of the question
     */

    public String getChoices1(int a) {
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoices2(int a) {
        String choice = mChoices[a][1];
        return choice;
    }

    public String getChoices3(int a) {
        String choice = mChoices[a][2];
        return choice;
    }

    public String getChoices4(int a) {
        String choice = mChoices[a][3];
        return choice;
    }

    /**
     * This method return correct answer among the choices
     * @param a
     * @return
     */

    public String getCorrectAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}


