import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the User Input Demo!");
        System.out.print("Please enter your name: ");

        String userName = scanner.nextLine();
        System.out.println("Hello, " + userName + "! Nice to meet you.");

        scanner.close();
    }
}
