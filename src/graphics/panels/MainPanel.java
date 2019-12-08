package graphics.panels;

import kasania.model.SimpleData;
import logic.FileIO;

import javax.swing.*;
import java.awt.*;

public class MainPanel implements Cloneable{
    private JLabel label;
    private JTextField textField;
    private JPanel contentPanel;
    private FileIO fileIO;
    public MainPanel(){
        fileIO = new FileIO();
        contentPanel = new JPanel();
        contentPanel.setLayout(new BorderLayout());
        label = new JLabel();
        textField = new JTextField(30);

        textField.addActionListener(event -> {
            SimpleData simpleData = new SimpleData(label.getText(), textField.getText());
            fileIO.saveData(simpleData);
        });
        contentPanel.add(label, BorderLayout.CENTER);
        contentPanel.add(textField, BorderLayout.SOUTH);
    }
    public JPanel getContentPanel(){
        return contentPanel;
    }
    public void setLabelText(String text){
        label.setText(text);
    }
    public void setTextField(String text){
        textField.setText(text);
    }
    public String getLabelText(){
        return label.getText();
    }
    public String getTextFieldText(){
        return textField.getText();
    }
}
