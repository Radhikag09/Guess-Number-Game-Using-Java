import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Functionality fun = new Functionality();
        fun.numberGenerator();
    }
}

class Functionality {
    public void numberGenerator() {
        int genNum, guess;
        Scanner scr = new Scanner(System.in);
        Random rand = new Random();
        genNum = rand.nextInt(100) + 1;
        int count = 1;
        do {
            System.out.println("Guess the number between 0 to 100 ");
            guess = scr.nextInt();
            if (guess == genNum) {
                System.out.println("Congratulations! you guessed the number in " + count + " attempts.");
            } else if (guess < genNum) {

                System.out.println("The guess " + guess + " is lower than the number");
                count++;

            } else if (guess > genNum) {

                System.out.println("Your guess " + guess + " is higher than the number");
                count++;
            }
        } while (guess != genNum);
    }
}