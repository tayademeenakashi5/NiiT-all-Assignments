package com.jap;

public class QuizDemo {

    //return the school name which has got the highest score in quiz
    //Handle the NumberFormatException
    public String highestScore(String []nameOfSchool , String[] scores ){
        try {
            int maxScore = Integer.MIN_VALUE;
            String schoolName = "";

            for (int i = 0; i < scores.length; i++) {
                int score = Integer.parseInt(scores[i]);
                if (score > maxScore) {
                    maxScore = score;
                    schoolName = nameOfSchool[i];
                }
            }

            return schoolName;
        } catch (NumberFormatException e) {
            return e.toString();
        }
    }
    //convert all the names in uppercase
    //Handle the NullPointerException
    public String[] convertAllNamesToCapital(String name[]){
        try {
            String upperCase[] = new String[name.length];
            for (int i = 0; i < name.length; i++) {
                upperCase[i] = name[i].toUpperCase();
            }
            return upperCase;
        } catch (NullPointerException e) {
            String upperCase[] = new String[0];
            return upperCase;
        }
    }
}






