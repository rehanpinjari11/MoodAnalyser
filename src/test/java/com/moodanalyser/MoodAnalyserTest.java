package com.moodanalyser;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnHappy(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("I Am In Happy mood.");
        String result = moodAnalyser.analyseMood();
        System.out.println(result);
        assertEquals("HAPPY" , result);
    }

}