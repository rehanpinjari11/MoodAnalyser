package com.moodanalyser;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am In Sad mood.");
        System.out.println(result);
        assertEquals("Sad" , result);
    }
    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in a Happy Mood");
        System.out.println(result);
        assertEquals("Happy" , result);
    }

}