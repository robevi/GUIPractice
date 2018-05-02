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
public class BorderPanel extends JPanel{
    BorderPanel() {
        setLayout(new BorderLayout());
        JPanel sideN = new JPanel();//NORTH
        JPanel sideS = new JPanel();//SOUTH
        JPanel goalW = new JPanel();//WEST
        JPanel goalE = new JPanel();//EAST
        JPanel midFieldC = new JPanel();//CENTER
        
        //NORTH
        sideN.setPreferredSize(new Dimension(200,50));
        sideN.setBackground(Color.white);
        
        //SOUTH
        sideS.setPreferredSize(new Dimension(200,50));
        sideS.setBackground(Color.white);
        
        //WEST
        goalW.setPreferredSize(new Dimension(50,100));
        goalW.setBackground(Color.white);
        goalW.setLayout(new BorderLayout());
        
        JPanel leftGoalN = new JPanel();
        JPanel leftGoalS = new JPanel();
        JPanel leftGoalW = new JPanel();
        
        leftGoalN.setPreferredSize(new Dimension(50,40));
        leftGoalN.setBackground(Color.green);
        leftGoalS.setPreferredSize(new Dimension(50,40));
        leftGoalS.setBackground(Color.green);
        leftGoalW.setPreferredSize(new Dimension(10,5));
        leftGoalW.setBackground(Color.black);
        
        goalW.add(leftGoalN, BorderLayout.NORTH);
        goalW.add(leftGoalS, BorderLayout.SOUTH);
        goalW.add(leftGoalW, BorderLayout.WEST);
        
        //EAST
        goalE.setPreferredSize(new Dimension(50,100));
        goalE.setBackground(Color.white);
        goalE.setLayout(new BorderLayout());
        
        JPanel rightGoalN = new JPanel();
        JPanel rightGoalS = new JPanel();
        JPanel rightGoalE = new JPanel();
        
        rightGoalN.setPreferredSize(new Dimension(50,40));
        rightGoalN.setBackground(Color.green);
        rightGoalS.setPreferredSize(new Dimension(50,40));
        rightGoalS.setBackground(Color.green);
        rightGoalE.setPreferredSize(new Dimension(10,5));
        rightGoalE.setBackground(Color.black);
        
        goalE.add(rightGoalN, BorderLayout.NORTH);
        goalE.add(rightGoalS, BorderLayout.SOUTH);
        goalE.add(rightGoalE, BorderLayout.EAST);
        
        //CENTER
        midFieldC.setBackground(Color.cyan);
        
        add(sideN, BorderLayout.NORTH);
        add(sideS, BorderLayout.SOUTH);
        add(goalW, BorderLayout.WEST);
        add(goalE, BorderLayout.EAST);
        add(midFieldC, BorderLayout.CENTER);
    }
}
