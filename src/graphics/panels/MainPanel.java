package graphics.panels;

import javax.swing.*;
import java.awt.*;

public class MainPanel implements Cloneable{
    private JLabel label;
    private JTextField textField;
    private JButton button;
    private JPanel contentPanel;
    private String input;

    public MainPanel(){
        //init();
        contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(3,1));
        label = new JLabel("label");
        textField = new JTextField(30);
        button = new JButton("testButton");

        button.addActionListener(event -> {
            input = textField.getText();
            label.setText(input);
            textField.setText("");
        });
        textField.addActionListener(event -> {
            input = textField.getText();
            label.setText(input);
            textField.setText("");
        });
        contentPanel.add(label);
        contentPanel.add(textField);
        contentPanel.add(button);
    }

    private void init(){
        label = new JLabel("label is here");
        textField = new JTextField();
        button = new JButton("Click");
        contentPanel = new JPanel();
    }
    public JPanel getContentPanel(){
        return contentPanel;
    }
    public JLabel getLabel(){
        return label;
    }
    public JTextField getTextField(){
        return textField;
    }
    public JButton getButton(){
        return button;
    }
}
