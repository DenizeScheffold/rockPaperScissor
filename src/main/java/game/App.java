package game;

import gui.MainFrame;
import javax.swing.SwingUtilities;

public class App {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> {
            new MainFrame("Test Swing App");
        });


        // GameImpl gameImpl1 = new GameImpl();
        //gameImpl1.run();

    }
}
