package com.assignment5;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter valid year");
        int no = sc.nextInt();
        if ((no % 4 == 0 ) && (no % 100 !=0) || no % 400 ==0 ){
            System.out.println("Is leap Year");
        }
        else {
            System.out.println("Is not leap Year");
        }
    }
}
