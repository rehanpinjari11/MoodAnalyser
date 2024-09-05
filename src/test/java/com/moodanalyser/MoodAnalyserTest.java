package com.moodanalyser;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenProper_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am In Happy mood.");
        System.out.println(result);
        assertEquals("Happy", result);

    }
}