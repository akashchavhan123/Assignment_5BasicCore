package com.assignment5;

import java.util.Random;

public class FlipCoin {
    public static void main(String[] args) {
        int head = 1;
        int tail = 0;
        Random r = new Random();
        int flip = r.nextInt(2);
        System.out.println("Our currunt random value is"+" "+flip);
        if (flip == head){
            System.out.println("Head");
        }
        else {
            System.out.println("Tail");
        }
    }
}
