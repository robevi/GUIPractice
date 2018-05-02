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
public class FirstEvent extends JPanel {
    private JButton redButton;
    private JButton greenButton;
    
    FirstEvent() {
        EventListener listener = new EventListener();
        
        redButton = new JButton("red");
        redButton.addActionListener(listener);
        greenButton = new JButton("green");
        greenButton.addActionListener(listener);
        
        add(redButton);
        add(greenButton);
        
        //set outer panel
        setPreferredSize(new Dimension(200, 200));
        setBackground(Color.blue);
    }
    
    private class EventListener implements ActionListener { //inner class for EventListener
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == redButton) {
                setBackground(Color.red);
            }
            if(e.getSource() == greenButton) {
                setBackground(Color.green);
            }
        }
    }
}
