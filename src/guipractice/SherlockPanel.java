/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guipractice;

import java.awt.*;
import javax.swing.*;

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
    private JLabel imageLabel = new JLabel(london);
    
    public SherlockPanel() {
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JLabel HeaderB = new JLabel("BUTTONS");
        JLabel HeaderT = new JLabel("TENENT LISTING");
        number = new JTextField("221B", 5);
        street = new JTextField("Baker St", 10);
        suburb = new JTextField("Marylebone", 10);
        town = new JTextField("London", 10);
        firstName = new JTextField("Sherlock", 10);
        secondName = new JTextField("Holmes", 10);
        JButton button1 = new JButton("fist");
        JButton button2 = new JButton("second");
        
        HeaderB.setForeground(Color.green);
        HeaderB.setFont(new Font("Times New Roman", Font.ITALIC|Font.BOLD, 40));
        button1.setForeground(Color.cyan);
        button1.setFont(new Font("Monospaced", Font.PLAIN, 30));
        button2.setBackground(Color.blue);
        button2.setBorderPainted(false);
        button2.setOpaque(true);
        
        
        panel1.setPreferredSize(new Dimension(110, 250));
        panel1.setBackground(Color.red);
        panel2.setPreferredSize(new Dimension(200, 250));
        panel2.setBackground(Color.yellow);
        
        panel1.add(HeaderB);
        panel1.add(button1);
        panel1.add(button2);
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
        driver();
    }
    
    public void driver() {
        showData();
        changeTenant();
        showData();
    }
    
    public void changeTenant() {
        ImageIcon john = new ImageIcon("test/nebula.jpg");
        firstName.setText("John");
        secondName.setText("Watson");
        imageLabel.setIcon(john);
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
}
