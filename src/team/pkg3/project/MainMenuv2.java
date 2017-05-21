/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.pkg3.project;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


/**
 *
 * @author wbm5061
 */
public class MainMenuv2 extends JFrame{
    
    NavigationCtrl realNavCtrl = null;
    
    public MainMenuv2(NavigationCtrl navCtrl)
    {
        
        realNavCtrl = navCtrl;
        this.setSize(600,400);
        this.setTitle("Main Menu");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        // a panel for ui components
        JPanel thePanel = new JPanel();
        thePanel.setLayout(new GridLayout(3,3));
        
        //create cell numbers for the gridlayout
        JPanel[] cellNumbers = new JPanel[9];
        for(int c = 0; c < 9; c++)
        {
            JPanel nextPanel = new JPanel();
            cellNumbers[c] = nextPanel;
            thePanel.add(nextPanel);
        }
        
        //Create some buttons
        JButton exitButton = new JButton("Exit App");
        JButton taskListButton = new JButton("View Task List");
        
        
        //a label
        JLabel mainMenuLabel = new JLabel("Welcome to navigation!");
        
        // Button Stuff
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
        taskListButton.addActionListener(new ActionListener() {
           public void actionPerformed(ActionEvent e)
           {
               realNavCtrl.requestTaskList();
               exitFrame();
           }
        });
        
        

        
        //Assembly
        cellNumbers[4].add(mainMenuLabel);
        cellNumbers[6].add(taskListButton);
        cellNumbers[8].add(exitButton);
        
        //show all that stuff
        this.add(thePanel);
        
        
    }
    
    
    private void exitFrame()
    {
        super.dispose();
    }
    
}
