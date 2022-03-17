package gui;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.*;


public class MainFrame extends JFrame {

    public MainFrame(String title) {
        super(title);

        setLayout(new BorderLayout());
        add(new MainPanel(), BorderLayout.CENTER);
        add(new Toolbar(), BorderLayout.NORTH);

        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}
