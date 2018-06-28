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
