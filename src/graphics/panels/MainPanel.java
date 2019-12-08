package graphics.panels;

import javax.swing.*;
import java.awt.*;

public class MainPanel implements Cloneable{
    private JLabel label;
    private JTextField textField;
    private JPanel contentPanel;
    private String input;

    public MainPanel(){
        //init();
        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        label = new JLabel("label");
        textField = new JTextField(30);

        textField.addActionListener(event -> {
            input = textField.getText();
            label.setText(input);
            textField.setText("");
        });
        contentPanel.add(label, BorderLayout.CENTER);
        contentPanel.add(textField, BorderLayout.SOUTH);
    }

    private void init(){
        label = new JLabel("label is here");
        textField = new JTextField();
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
}
