import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        final int SECRET_NUMBER1 = random.nextInt(10) + 1;
        final int SECRET_NUMBER2 = random.nextInt(50) + 1;  
        final int SECRET_NUMBER3 = random.nextInt(100) + 1; ;
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Choose difficulty:");
        System.out.println("Choose level 1, 2 or 3");

        int userChoice = scanner.nextInt();
        if (userChoice < 1 || userChoice > 3) {
            System.out.println("Choose between 1-3");
        }
            if (userChoice == 1) {
                System.out.println("Try to guess the secret number, 1-10");
                int count = 0;

                while (!hasGuessedCorrectly) {
                    System.out.print("Enter your guess: ");
                    int userGuess = scanner.nextInt();
                    count++;
                    if (userGuess == SECRET_NUMBER1) {
                        hasGuessedCorrectly = true;
                        System.out.println("Congratulations! You've guessed the secret number. You guessed a total of "
                                + count + " times");
                    } else if (userGuess < 1 || userGuess > 10) {
                        System.out.println("Invalid input, please guess a number between 1-10");
                    } else if (userGuess < SECRET_NUMBER1) {
                        System.out.println("Wrong guess! Guess higher.");
                    } else if (userGuess > SECRET_NUMBER1) {
                        System.out.println("Wrong guess! Guess lower.");
                    }
                }
            }
            if (userChoice == 2) {
                System.out.println("Try to guess the secret number, 1-50");
                int count = 0;

                while (!hasGuessedCorrectly) {
                    System.out.print("Enter your guess: ");
                    int userGuess = scanner.nextInt();
                    count++;
                    if (userGuess == SECRET_NUMBER2) {
                        hasGuessedCorrectly = true;
                        System.out.println("Congratulations! You've guessed the secret number. You guessed a total of "
                                + count + " times");
                    } else if (userGuess < 1 || userGuess > 50) {
                        System.out.println("Invalid input, please guess a number between 1-50");
                    } else if (userGuess < SECRET_NUMBER2) {
                        System.out.println("Wrong guess! Guess higher.");
                    } else if (userGuess > SECRET_NUMBER2) {
                        System.out.println("Wrong guess! Guess lower.");
                    }
                }
            }
            if (userChoice == 3) {
                System.out.println("Try to guess the secret number, 1-100");
                int count = 0;

                while (!hasGuessedCorrectly) {
                    System.out.print("Enter your guess: ");
                    int userGuess = scanner.nextInt();
                    count++;
                    if (userGuess == SECRET_NUMBER3) {
                        hasGuessedCorrectly = true;
                        System.out.println("Congratulations! You've guessed the secret number. You guessed a total of "
                                + count + " times");
                    } else if (userGuess < 1 || userGuess > 100) {
                        System.out.println("Invalid input, please guess a number between 1-100");
                    } else if (userGuess < SECRET_NUMBER3) {
                        System.out.println("Wrong guess! Guess higher.");
                    } else if (userGuess > SECRET_NUMBER3) {
                        System.out.println("Wrong guess! Guess lower.");
                    }
                }
            }
            scanner.close();
        }
    }