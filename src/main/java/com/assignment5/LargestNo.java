package com.assignment5;

import java.util.Scanner;

public class LargestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First no");
        int no = sc.nextInt();
        System.out.println("Enter Two no");
        int no2 = sc.nextInt();
        System.out.println("Enter Third no");
        int no3 = sc.nextInt();
        if (no>no2 && no>no3){
            System.out.println(no+" "+"no is Greater");
        }
        else if (no2>no && no>no3) {
            System.out.println(no2+" "+"no is Greater");
        }
        else {
            System.out.println(no3+" "+"no is Greater");
        }

    }
}
