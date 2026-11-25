
import java.util.Random;
import java.util.Scanner;

public class AdvancedNumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;

        System.out.println("=========================================");
        System.out.println("   WELCOME TO THE ULTIMATE NUMBER GAME   ");
        System.out.println("=========================================");

        while (playAgain) {
            // 1. Difficulty Selection
            System.out.println("\nSelect Difficulty Level:");
            System.out.println("1. Easy (1 - 50, 15 attempts)");
            System.out.println("2. Medium (1 - 100, 10 attempts)");
            System.out.println("3. Hard (1 - 200, 7 attempts)");
            System.out.print("Enter choice (1-3): ");

            int choice = getValidInt(scanner, 1, 3);
            int upperBound = 50;
            int maxAttempts = 15;

            switch (choice) {
                case 1:
                    upperBound = 50;
                    maxAttempts = 15;
                    break;
                case 2:
                    upperBound = 100;
                    maxAttempts = 10;
                    break;
                case 3:
                    upperBound = 200;
                    maxAttempts = 7;
                    break;
            }

            int secretNumber = random.nextInt(upperBound) + 1;
            int attempts = 0;
            boolean hasWon = false;

            System.out.println("\nI have selected a number between 1 and " + upperBound + ".");
            System.out.println("You have " + maxAttempts + " attempts to guess it.");

            // 2. Gameplay Loop with Limited Attempts
            while (attempts < maxAttempts) {
                System.out.print("\nEnter your guess: ");
                int guess = getValidInt(scanner, 1, upperBound);
                attempts++;

                if (guess > secretNumber) {
                    System.out.println("Too High! Attempts left: "
                            + (maxAttempts - attempts));
                } else if (guess < secretNumber) {
                    System.out.println("Too Low! Attempts left: "
                            + (maxAttempts - attempts));
                } else {
                    System.out.println("\n🎉 Correct! You guessed the number in "
                            + attempts + " attempts.");
                    hasWon = true;
                    break;
                }                   
            }

            // 3. Game Over Condition
            if (!hasWon) {
                System.out.println("\n❌ Game Over! You ran out of attempts.");
                System.out.println("The secret number was: " + secretNumber);
            }

            // 4. Play-Again Feature
            System.out.print("\nWould you like to play again? (yes/no): ");
            scanner.nextLine(); // Consume leftover newline
            String response = scanner.nextLine().trim().toLowerCase();

            if (!response.equals("yes") && !response.equals("y")) {
                playAgain = false;
                System.out.println("\nThanks for playing! Goodbye!");
            }
        }

        scanner.close();
    }

    // Helper method for input validation
    private static int getValidInt(Scanner scanner, int min, int max) {
        while (true) {
            if (scanner.hasNextInt()) {
                int value = scanner.nextInt();

                if (value >= min && value <= max) {
                    return value;
                } else {
                    System.out.print("Out of range! Please enter a number between "
                            + min + " and " + max + ": ");
                }
            } else {
                System.out.print("Invalid input! Please enter a valid integer: ");
                scanner.next(); // Discard invalid token
            }
        }
    }
}
