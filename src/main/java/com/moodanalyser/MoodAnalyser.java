package com.moodanalyser;

public class MoodAnalyser {

    // Method to analyze the mood based on the message
    public String analyseMood(String message)
    {
        if (message.contains("Sad")) {
            return "Sad";
        }
        else if (message.contains("Happy")) {
            return "Happy";
        }
        else
            return null;
    }
}
