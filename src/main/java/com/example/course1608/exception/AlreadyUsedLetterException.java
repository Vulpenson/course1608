package com.example.course1608.exception;

public class AlreadyUsedLetterException extends Exception {
    public AlreadyUsedLetterException() {
        super("Letter already used!");
    }
}
