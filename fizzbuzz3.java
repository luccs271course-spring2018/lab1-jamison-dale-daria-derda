package com.company;
import java.util.Scanner;
public class fizzbuzz3 {
    public static void main(String[] args) {

        {
            System.out.println("Please input a number: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("We will now determine fizz buzz");
            for (int i = 1; i <= n; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println("fizzbuzz");
                } else if (i % 5 == 0) {
                    System.out.println("buzz");
                } else if (i % 3 == 0) {
                    System.out.println("fizz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }

    public static String[] fizzbuzz(int n) {
        if (n >= 1) {
            String[] list = new String[n];
            for (int i = 1; i <= n; i++) {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    list[i] = "fizz buzz";
                } else if (i % 5 == 0) {
                    list[i] = "buzz";
                } else if (i % 3 == 0) {
                    list[i] = "fizz";
                } else {
                    list[i] = String.valueOf(i);
                }
            }
            return list;
        }
    return null;
    }
}