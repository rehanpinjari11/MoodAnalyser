package com.moodanalyser;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Sad mood.");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        assertEquals("SAD" , result);
    }

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Happy mood.");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        assertEquals("HAPPY" , result);
    }

    @Test
    public void givenMessage_WhenNull_ShouldReturn() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("null");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        assertEquals("NULL", result);
    }

}