package graphics;


import graphics.panels.MainPanel;

import javax.swing.*;
import java.awt.*;

//TODO Change MainPanel name
public class MainFrame {
    static int SCREEN_WIDTH = 1280;
    static int SCREEN_HEIGHT = 720;

    private JFrame mainFrame;
    private MainPanel mainPanel;

    private Container contentPane;
    private JPanel componentPanel;

    private JButton button1;
    private JButton button2;

    public MainFrame(){
        init();

        contentPane = mainFrame.getContentPane();

        contentPane.setLayout(new BorderLayout());
        componentPanel.setLayout(new GridLayout(1,4));

        componentPanel.add(mainPanel.getContentPanel());

        contentPane.add(componentPanel, BorderLayout.CENTER);

        mainFrame.setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
    private void init(){
        mainFrame = new JFrame();
        mainPanel = new MainPanel();
        componentPanel = new JPanel();
    }

}
