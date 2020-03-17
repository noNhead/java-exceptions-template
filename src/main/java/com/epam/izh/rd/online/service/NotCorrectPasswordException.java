package com.epam.izh.rd.online.service;

public class NotCorrectPasswordException extends Exception {
    public NotCorrectPasswordException(String message) {
        super(message);
    }
}
