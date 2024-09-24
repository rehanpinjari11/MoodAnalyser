package com.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() throws MoodAnalyzerException{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Sad mood.");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        assertEquals("SAD" , result);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy() throws MoodAnalyzerException{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Happy mood.");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        assertEquals("HAPPY" , result);
    }

    @Test
    void analyzeNullMood() throws MoodAnalyzerException {
        MoodAnalyser moodAnalyzer3 = new MoodAnalyser(null);

        try {
            moodAnalyzer3.analyzeMood(null);
        } catch (MoodAnalyzerException e) {
            Assertions.assertEquals(MoodAnalyzerException.ExceptionType.NULL,e.type);
        }
    }

    @Test
    void analyzeEmptyMood() throws MoodAnalyzerException {
        MoodAnalyser moodAnalyzer4 = new MoodAnalyser(" ");

        try {
            moodAnalyzer4.analyzeMood(" ");
        } catch (MoodAnalyzerException e) {
            Assertions.assertEquals(MoodAnalyzerException.ExceptionType.EMPTY,e.type);
        }
    }


}