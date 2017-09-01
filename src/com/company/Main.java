package com.company;
import java.util.Scanner;
public class Main {
    int n;
    public static void main(String[] args) {
        int n, i;
            {
                System.out.println("Please input a number: ");
                Scanner sc= new Scanner(System.in);
                n = sc.nextInt();
                System.out.println("We will now determine fizz buzz");
                for  (i = 1; i <= n; i++)
                {	if (i % 3 == 0) {
                    System.out.println("fizz");
                }
                    if (i % 5 == 0) {
                        System.out.println ("buzz");
                    }
                    if ( (i % 5 ==0) && (i % 3 == 0) ){
                        System.out.println("fizz buzz");
                    }
                    else System.out.println(i);

                }
                System.out.println();
            }
    }
    }
