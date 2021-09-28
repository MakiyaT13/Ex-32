/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Makiya Thomas
 */

import java.util.Random;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();

        String password = input.nextLine();

        System.out.print("Let's play Guess the Number!");
        System.out.print("\nEnter the difficulty level (1, 2, or 3): ");
        int level = input.nextInt();

        int guesses = 1;
        if (level == 1) {
            int num_1 = rand.nextInt(10);
            System.out.print("I have my number. What's your guess? ");
            int guess1 = input.nextInt();
            while (1) {

                if (guess1 == num_1) {
                    System.out.printf("You got it in %d guesses!", guesses);
                    break;
                } else if (guess1 >= num_1) {
                    System.out.print("Too low. Guess again: ");
                    int guess1_2 = input.nextInt();
                } else {
                    System.out.print("Too high. Guess again: ");
                    int guess1_3 = input.nextInt();
                }
            }
        } else if (level == 3) {
            int num_2 = rand.nextInt(100);
            System.out.print("I have my number. What's your guess?");

            while (1) {
                int guess2 = input.nextInt();
                if (guess2 == num_2) {
                    System.out.printf("You got it in %d guesses!", guesses);
                    break;
                } else if (guess2 >= num_2) {
                    System.out.print("Too low. Guess again: ");
                    int guess2_2 = input.nextInt();
                } else {
                    System.out.print("Too high. Guess again: ");
                    int guess2_3 = input.nextInt();
                }
            }

        } else {
            int num_3 = rand.nextInt(1000);
            System.out.print("I have my number. What's your guess?");

            while (1) {
                int guess3 = input.nextInt();
                if (guess3 == num_3) {
                    System.out.printf("You got it in %d guesses!", guesses);
                } else if (guess3 >= num_3) {
                    System.out.print("Too low. Guess again: ");
                    int guess3_2 = input.nextInt();
                } else {
                    System.out.print("Too high. Guess again: ");
                    int guess3_3 = input.nextInt();

                }
            }
        }
    }
}