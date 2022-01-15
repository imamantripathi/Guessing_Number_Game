import java.util.*;

public class Guessing_Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int attempt = 1;
        int userGuessNumber = 0;
        int secretNumber = (int) (Math.random() * 99 + 1);
        // System.out.println(secretNumber);
        System.out.println("");
        System.out.println(
                "Welcome to the Guessing Number Game \n\n You will asked to guess a number \n You have maximum 5 attemp limit");
        System.out.println("");
        System.out.println("Enter a Guess Number Between 1 to 100\n");
        do {
            if (sc.hasNextInt()) {
                userGuessNumber = sc.nextInt();
                if (userGuessNumber == secretNumber) {
                    System.out.println("Congrats!, Your Number is Correct. You win the Game! ");
                    System.out.println("");
                    break;
                } else if (userGuessNumber < secretNumber) {
                    System.out.println("Your Guess Number is Smaller.");
                } else if (userGuessNumber > secretNumber) {
                    System.out.println("Your Guess Number is Greater.");
                }
                if (attempt == 5) {
                    System.out.println("You have exceededthe maximum attempt. Try Again!");
                    System.out.println("");
                    break;
                }
                attempt++;
            } else {
                System.out.println("Enter a Valid Integer Number");
                System.out.println("");
                break;
            }

        } while (userGuessNumber != secretNumber);
    }
}