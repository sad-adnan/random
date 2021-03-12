package com.sadadnan.randomstringlib;

import java.util.Random;

public class RandomNum {
    public static int getRandomInt(int lowerBound, int upperBound){
        return (int) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
    }
    public static float getRandomFloat(float lowerBound, float upperBound){
        return (float) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
    }
    public static double getRandomDouble(double lowerBound, double upperBound){
        return (double) (Math.random() * (upperBound - lowerBound + 1) + lowerBound);
    }
}
