import java.util.Random;
import java.util.Scanner;

public class RandomGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int min = 0;
        int max = 100;
        int target = random.nextInt(max - min + 1) + min;

        int number;
        int maxAttempts = 7;
        int attempts = 0;
        System.out.println("Guess a number between " + min + " and " + max + ". You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts) {
            System.out.println("Enter your guess:");
            number = scanner.nextInt();
            attempts++;

            if (number < min || number > max) {
                System.out.println("The guess should be between " + min + " and " + max + ".");
            } else if (number == target) {
                System.out.println("Congratulations! Your guess is right.");
                break;
            } else if (number < target) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }

            if (attempts == maxAttempts) {
                System.out.println("Sorry, you have run out of attempts. The correct number was " + target + ".");
            }
        }

        scanner.close();
    }
}
