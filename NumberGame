import java.util.Random;
import java.util.Scanner;
public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int low = 1;
        int up = 100;
        int maxAt = 3;
        int score = 0;
        System.out.println("Welcome to the Game!");
        System.out.println("We're thinking of a number between " + low + " and " + up + ".");
        boolean Again = true;
        while (Again) {
            int N1 = random.nextInt(up - low + 1) + low;
            int At = 0;
            boolean Guess = false;
            System.out.println("You have " + maxAt + " chances to guess it.");
            while (At < maxAt) {
                System.out.print("Enter your guess: ");
                int userGuess = scanner.nextInt();
                At++;
                if (userGuess == N1) {
                    Guess = true;
                    System.out.println("Congratulations! You've guessed the correct number: " + N1);
                    break;
                } else if (userGuess < N1) {
                    System.out.println("Your guess is too low. You have " + (maxAt - At) + " tries left.");
                } else {
                    System.out.println("Your guess is too high. You have " + (maxAt - At) + " tries left.");
                }
            }
            if (!Guess) {
                System.out.println("Sorry, you've run out of tries. The correct number was: " + N1);
            }
            score += Guess ? 1 : 0;
            System.out.println("Your current score: " + score);
            System.out.print("Play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                Again = false;
            }
        }
        System.out.println("Thanks for playing! Your final score: " + score);
        scanner.close();
    }
}
