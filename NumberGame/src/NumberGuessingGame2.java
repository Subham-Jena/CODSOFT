import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int score = 0;
        int numRounds = 0;

        while (true) {
            int randomNumber = random.nextInt(100) + 1; // Generate a random number between 1 and 100
            int attempts = 0;
            boolean isCorrect = false;

            System.out.println("\nWelcome to the number guessing game! Try to guess the number between 1 and 100.");
            System.out.println("You have 10 attempts to guess the number. Good luck!");

            while (!isCorrect && attempts < 10) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();

                attempts++;

                if (userGuess == randomNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + randomNumber);
                    isCorrect = true;
                    score++;
                } else if (userGuess > randomNumber) {
                    System.out.println("Your guess is too high. Try again.");
                } else {
                    System.out.println("Your guess is too low. Try again.");
                }
            }

            if (isCorrect) {
                numRounds++;
                System.out.println("Your score is: " + score + "/" + numRounds);
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = scanner.next();
                if (!playAgain.equalsIgnoreCase("yes")) {
                    break;
                }
            } else {
                System.out.println("Sorry, you didn't guess the number. The correct number was: " + randomNumber);
                System.out.println("Your score is: " + score + "/" + numRounds);
                System.out.print("Do you want to play again? (yes/no): ");
                String playAgain = scanner.next();
                if (!playAgain.equalsIgnoreCase("yes")) {
                    break;
                }
                score = 0;
                numRounds = 0;
            }
        }

        scanner.close();
    }
}