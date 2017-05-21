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
public class LoginUIv2 extends JFrame{
    
    private LoginCtrl parentLoginCtrl = null;
    
    public LoginUIv2(LoginCtrl newParentLoginCtrl)
    {
        parentLoginCtrl = newParentLoginCtrl;
        
        this.setSize(600,400);
        this.setTitle("Login");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        // a panel for ui components
        JPanel thePanel = new JPanel();
        thePanel.setLayout(new GridLayout(4,4));
        
        //create cell numbers for the gridlayout
        JPanel[] cellNumbers = new JPanel[16];
        for(int c = 0; c < 16; c++)
        {
            JPanel nextPanel = new JPanel();
            cellNumbers[c] = nextPanel;
            thePanel.add(nextPanel);
        }
        
        //Construct UI components
        JButton cancelButton = new JButton("Cancel");
        cancelButton.setSize(30,40);
        JButton submitButton = new JButton("Submit");
        submitButton.setSize(30,40);
        
        // Labels
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        
        // Text Fields
        JTextField usernameTextField = new JTextField(10);
        usernameTextField.setText("johnny2");
        JPasswordField passwordField = new JPasswordField(10);
        passwordField.setText("pass");
        
        // Add shortly
        cancelButton.addActionListener(new CancelListener());
        
        // Button stuff
        submitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                
               String username = usernameTextField.getText();
               char[] password = passwordField.getPassword();
               //send it to Some Super Secret Secure Server Somewhere SSSSSSSSSSSSSSSSS
                boolean authenticated = parentLoginCtrl.requestAuthenticate(username, password); //Super important
                if(authenticated == true)
                {
                  //do some stuff since they a truthful guy
                   System.out.println("Aunthenticated");
                  parentLoginCtrl.requestNagivationCtrl();
                }
                else
                {
                 //do other stuff since they a liar
                 System.out.println("Not Aunthenticated");

                }
            }
        });
        
        
        // Assembly
        cellNumbers[5].add(usernameLabel);
        cellNumbers[9].add(passwordLabel);
        cellNumbers[6].add(usernameTextField);
        cellNumbers[10].add(passwordField);
        cellNumbers[13].add(cancelButton);
        cellNumbers[14].add(submitButton);
        
        
        // Finalizes panel layout
        this.add(thePanel);
        
    }
    
    class CancelListener implements ActionListener{
        public void actionPerformed(ActionEvent event)
        {
            System.exit(0);
        }
    }
    
    
    
}
