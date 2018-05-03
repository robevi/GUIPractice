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
public class SherlockPanel extends JPanel{
    private JTextField number;
    private JTextField street;
    private JTextField suburb;
    private JTextField town;
    private JTextField firstName;
    private JTextField secondName;
    private ImageIcon london = new ImageIcon("test/london.jpg"); 
    private ImageIcon john = new ImageIcon("test/nebula.jpg");
    private JLabel imageLabel = new JLabel(london);
    
    private JButton changeButton;
    private JButton showButton;
    private int tenantSelect = 0;
    
    public SherlockPanel() {
        EventListener listener = new EventListener();
        
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel HeaderB = new JLabel("Change Tenant");
        JLabel HeaderT = new JLabel("Show Tenant");
        number = new JTextField("221B", 5);
        street = new JTextField("Baker St", 10);
        suburb = new JTextField("Marylebone", 10);
        town = new JTextField("London", 10);
        firstName = new JTextField("Sherlock", 10);
        secondName = new JTextField("Holmes", 10);
        changeButton = new JButton("Change Tenant");
        changeButton.addActionListener(listener);
        showButton = new JButton("Show Tenant");
        showButton.addActionListener(listener);
        
        HeaderB.setForeground(Color.green);
        HeaderB.setFont(new Font("Times New Roman", Font.ITALIC|Font.BOLD, 40));
        
        
        panel1.setPreferredSize(new Dimension(110, 250));
        panel1.setBackground(Color.red);
        panel2.setPreferredSize(new Dimension(200, 250));
        panel2.setBackground(Color.yellow);
        
        panel1.add(HeaderB);
        panel1.add(changeButton);
        panel1.add(showButton);
        panel2.add(HeaderT);
        panel2.add(firstName);
        panel2.add(secondName);
        panel2.add(number);
        panel2.add(street);
        panel2.add(suburb);
        panel2.add(town);
        panel2.add(imageLabel);
        add(panel1);
        add(panel2);
        
        setBackground(Color.blue);
    }
    
    public void changeTenant() {
        if(tenantSelect == 0) {
            firstName.setText("Sherlock");
            secondName.setText("Holmes");
            imageLabel.setIcon(london);
            tenantSelect = 1;
        }
        else if(tenantSelect == 1) {
            firstName.setText("John");
            secondName.setText("Watson");
            imageLabel.setIcon(john);
            tenantSelect = 0;
        }
    }
    
    public void showData() {
        System.out.print(number.getText() + " ");
        System.out.print(street.getText() + " ");
        System.out.print(suburb.getText() + " ");
        System.out.println(town.getText());
        System.out.println("Firstname: " + firstName.getText());
        System.out.println("Secondname: " + secondName.getText());
        System.out.println("**************************************");
    }
    
    private class EventListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == changeButton) {
                changeTenant();
            }
            if(e.getSource() == showButton) {
                showData();
            }
        }
    }
}
