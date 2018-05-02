/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipractice;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author Christi
 */
public class QuizEvent extends JPanel{
    private JTextField answerField;
    private JButton submitButton;
    private JButton clearButton;
    private JLabel question;
    private String correctAnswer = "nile";
    JLabel correctLabel = new JLabel("");
    
    QuizEvent() {
        EventListener listener = new EventListener();
        
        answerField = new JTextField("", 13);
        question = new JLabel("This river is an anagram of \"line\""); 
        submitButton = new JButton("submit");
        submitButton.addActionListener(listener);
        clearButton = new JButton("clear");
        clearButton.addActionListener(listener);
        clearButton.setVisible(false);
        
        add(answerField);
        add(question);
        add(submitButton);
        add(clearButton);
        add(correctLabel);
        
        setPreferredSize(new Dimension(400, 100));
        setBackground(Color.pink);
    }
    
    private class EventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == submitButton) {
                if(answerField.getText().equals(correctAnswer)) {
                    submitButton.setVisible(false);
                    clearButton.setVisible(false);
                    correctLabel.setText("That's Right!");
                }
                if(!answerField.getText().equals(correctAnswer)) {
                    submitButton.setVisible(false);
                    clearButton.setVisible(true);
                    correctLabel.setText("Not Right!");
                }
            }
            if(e.getSource() == clearButton) {
                submitButton.setVisible(true);
                clearButton.setVisible(false);
                answerField.setText("");
                correctLabel.setText("");
            }
        }
    }
}
