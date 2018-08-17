package guessthenumber;

import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theThing;   //number the program will use
    int max = 100;
    Scanner scan = new Scanner(System.in);

    //constructor
    public GuessTheNumber() {
        Random rand = new Random();     //find random number
        theThing = Math.abs(rand.nextInt()) % (max + 1);    //take a positive of the number and make it less than 100
    }

    public void play() {
        while (true) {
            int move = scan.nextInt();
            if (move > theThing) {
                System.out.println("Your guess is too wide! Try a smaller number");
            } else if (move < theThing) {
                System.out.println("Your guess is too narrow! Try a larger number");
            } else {
                System.out.println("That's it, you did it!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        GuessTheNumber guessing = new GuessTheNumber();     //new  instance
        System.out.println("Guess a number between 0 to 100!");
        guessing.play();        //method call
    }
}
