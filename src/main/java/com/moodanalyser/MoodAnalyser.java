package com.moodanalyser;

public class MoodAnalyser {

    public static String message;
    //constructor

    public MoodAnalyser(){

    }
    public MoodAnalyser(String message) throws MoodAnalyzerException{
        this.message = message;

    }

    public void analyzeMood(String msg) throws MoodAnalyzerException{
        this.message = message;
        analyseMood();
    }

    // Method to analyze the mood based on the message
    public String analyseMood() throws MoodAnalyzerException
    {
        try {

            if (message.isEmpty()){
                throw new MoodAnalyzerException(MoodAnalyzerException.ExceptionType.EMPTY, "Enter Input");
            }

            if (message.contains("Sad")) {
                return "SAD";
            } else if (message.contains("Happy")) {
                return "HAPPY";
            }
        }
        catch (NullPointerException e){
            System.out.println("Please Enter the Valid Mood.");
        }

        return "HAPPY";
    }
}
