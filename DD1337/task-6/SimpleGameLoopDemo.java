import java.util.Scanner;

public class SimpleGameLoopDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final String SECRET_WORD = "JAVA";
        boolean hasGuessedCorrectly = false;

        System.out.println("Welcome to the Word Guessing Game!");
        System.out.println("Try to guess the secret word.");

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            String userGuess = scanner.nextLine().toUpperCase();

            if (userGuess.equals(SECRET_WORD)) {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the secret word.");
            } else {
                System.out.println("Wrong guess! Try again.");
            }
        }

        scanner.close();
    }
}
