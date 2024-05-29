package com.example.greeting.models;


// Extension -Add a Celebration DTO with a single message property

public class Celebration {
    private String message;

    public Celebration() {
    }
    public Celebration(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}


