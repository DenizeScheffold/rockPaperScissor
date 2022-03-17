package game;

import game.objects.GameObject;
import game.objects.Paper;
import game.objects.Rock;
import game.objects.Scissor;

public interface GameService {

    GameObject[] objects = {new Rock(), new Paper(), new Scissor()};
    GameObject selectPlayersHand();
    GameObject selectComputersHand();
    void compareHands(GameObject playersChoice, GameObject computersChoice);


}

