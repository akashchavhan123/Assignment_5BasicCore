package com.assignment5;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value");
        int no = sc.nextInt();
        if (no % 2 == 0){
            System.out.println(no+" "+"no is Even");
        }
        else {
            System.out.println(no+" "+" no is odd");
        }
    }
}
