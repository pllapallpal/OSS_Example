package graphics;


import graphics.panels.MainPanel;
import kasania.model.SimpleData;

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
    private JPanel buttonPanel;

    private JButton saveButton;
    private JButton readButton;


    public MainFrame(){
        init();

        contentPane.setLayout(new BorderLayout());
        componentPanel.setLayout(new BorderLayout());

        componentPanel.add(mainPanel.getContentPanel());
        buttonPanel.add(saveButton);
        buttonPanel.add(readButton);

        //ActionEvent
        readButton.addActionListener(event -> {

        });
        saveButton.addActionListener(event -> {

        });
        mainPanel.getTextField().addActionListener(event ->{

        });

        //Add
        contentPane.add(buttonPanel, BorderLayout.NORTH);
        contentPane.add(componentPanel, BorderLayout.CENTER);

        //frameSetting
        mainFrame.setSize(SCREEN_WIDTH,SCREEN_HEIGHT);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
    }
    private void init(){
        mainFrame = new JFrame();
        mainPanel = new MainPanel();
        componentPanel = new JPanel();
        buttonPanel = new JPanel();
        saveButton = new JButton("Save");
        readButton = new JButton("Load");
        contentPane = mainFrame.getContentPane();
    }

}
