package com.company;
import java.util.Scanner;
public class fizzbuzz2 {
    public static void main(String[] args) {
        int n, i;
        {
            System.out.println("Please input a number: ");
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            System.out.println("We will now determine fizz buzz");
            for (i = 1; i <= n; i++)
                {
                if ((i % 3 == 0) && (i % 5 == 0)) {
                    System.out.println("fizzbuzz");
                }
                else if (i % 5 == 0) {
                    System.out.println("buzz");
                }
                else if (i % 3 == 0) {
                    System.out.println("fizz");
                }
                else {
                    System.out.println(i);
                }
            }
        }
    }
}
