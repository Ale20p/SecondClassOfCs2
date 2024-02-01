package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 2D arrays/matrixes
//        int mat1[][] = {{1, 2, 4}, {4, 6, 7}, {4, 6, 7}};
//        int mat2[][] = {{1, 2, 1}, {3, 7, 8}, {6, 7, 9}};



//        int num = 5;
//        for (int i = num; i >= 1; i--) {
//            for (int j = 1; j <= num - i; j++) {
//                System.out.print(" ");
//            }
//            for (int o = 1; o <= 2 * i -1; o++) {
//                System.out.print("A ");
//            }
//            System.out.println("");
//        }

        /*for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }*/

        /*int num = 1;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println("");
        }*/

        /*for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("1 ");
            }
            System.out.println("");
        }*/


        // Find Max Number
        /*int[] arr = {100, -7, 8, 1, 0, 77};
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("The max: " + max);*/


        // Guess the random number problem
        /*int secretNumber = (int) (Math.random() * 100) + 1; //generates a random number
        Scanner scanner = new Scanner(System.in);
        int guess;
        do {
            System.out.println("Enter you guess: ");
            guess = scanner.nextInt();
            if (guess <  secretNumber) {
                System.out.println("too low! try again");
            } else if (guess > secretNumber) {
                System.out.println("too high! try again");
            } else {
                System.out.println("Congrats! You found it");
            }
        } while (guess != secretNumber) {
            scanner.close();
        }*/


        // Number Type Counter
        /*int num = 24613579;
        int evenCount = 0;
        int oddCount = 0;

        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println(evenCount);
        System.out.println(oddCount);*/


        // Factorial Problem
        /*int num = 5;
        int fact = 1;

        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        System.out.println(fact);*/
    }
}
