package com.example.lab5rabbitmq;

import org.springframework.stereotype.Component;

import java.io.Serializable;
import java.util.ArrayList;

@Component
public class Word implements Serializable {
    public ArrayList<String> badWords;
    public ArrayList<String> goodWords;

    public Word() {
        this.badWords = new ArrayList<>();
        this.goodWords = new ArrayList<>();
    }
}
