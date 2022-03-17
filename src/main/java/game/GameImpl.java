package game;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissor;

import java.util.Random;
import java.util.Scanner;

public class GameImpl implements GameService {

    public void run(){
        compareHands(selectPlayersHand(), selectComputersHand());

    }

    private GameObject[] objects = {new Rock(), new Paper(), new Scissor()};


    public GameObject selectPlayersHand() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Make your move: ");
        int playersInput = scanner.nextInt();
        GameObject playersChoice = null;
        playersChoice = objects[playersInput];
        scanner.close();
        return playersChoice;
    }

    public GameObject selectComputersHand() {

        Random random = new Random();
        GameObject computersChoice = objects[random.nextInt(objects.length)];

        return computersChoice;
    }

    public void compareHands(GameObject playersChoice, GameObject computersChoice) {

        String[] result = {"lose", "draw", "win"};
        try {
            System.out.println("Result: " + result[computersChoice.compareTo(playersChoice) + 1]);
        } catch (
                ArrayIndexOutOfBoundsException e) {
            System.out.println("The cause of the exception is: " + e.getMessage());
            System.out.println("Please select a number between 0-2.");
        }
    }


    public String toString(GameObject playersChoice, GameObject computersChoice) {
        return "Your choice: " + playersChoice + "\nComputers choice: " + computersChoice;

    }


}
