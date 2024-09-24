package com.moodanalyser;

public class MoodAnalyzerException extends Exception {

    public enum ExceptionType{
        NULL,EMPTY;
    }
    
    ExceptionType type;
    
    public MoodAnalyzerException(ExceptionType type,String message){
        super(message);
        this.type = type;
    }
}
