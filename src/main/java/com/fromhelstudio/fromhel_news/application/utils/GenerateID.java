package com.fromhelstudio.fromhel_news.application.utils;

import java.util.Random;

public class GenerateID {
    public static String generate() {
        Random random = new Random();
        int randomNumber = random.nextInt(100000);
        return "FHS-" + String.format("%05d", randomNumber);
    }
}
