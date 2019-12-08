package graphics;


import graphics.panels.MainPanel;
import kasania.model.SimpleData;
import logic.FileIO;

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

    private FileIO fileIO;
    private String labelText;
    private String textFieldText;
    public MainFrame(){
        init();

        contentPane.setLayout(new BorderLayout());
        componentPanel.setLayout(new BorderLayout());

        componentPanel.add(mainPanel.getContentPanel());
        buttonPanel.add(saveButton);
        buttonPanel.add(readButton);


        //ActionEvent
        readButton.addActionListener(event -> {
            SimpleData input = fileIO.getData();
            mainPanel.setLabelText(input.getLabelData());
            mainPanel.setTextField(input.getTextFieldData());
        });
        saveButton.addActionListener(event -> {
            labelText = mainPanel.getLabelText();
            textFieldText = mainPanel.getTextFieldText();
            SimpleData simpleData = new SimpleData(labelText, textFieldText);
            fileIO.saveData(simpleData);
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
        fileIO = new FileIO();
    }

}
