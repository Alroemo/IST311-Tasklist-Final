/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.pkg3.project;

/**
 *
 * @author wbm5061
 */
public class User {
    
    private String username;
    private char[] password;
    
    public User(String u, char[] p)
    {
        username = u;
        password = p;
    }
    
    public boolean checkUsername(String U2check)
    {
        boolean passes;
        
        if (U2check.equals(username))
        {
            passes = true;
        }
        else
        {
            passes = false;
        }
        
        return passes;
    }   
 
    public boolean checkPassword(char[] P2check)
    {
        boolean passes = false;
        boolean charCheck;
        
        for(int c = 0; c < password.length; c++)
        {
            if(P2check[c] == password[c])
            {
                charCheck = true;
            }
            else
            {
                charCheck = false;
                return charCheck;
            }
            
            if(c == password.length - 1)
                passes = true;
        }
        
        return passes;
        
    }
    
}

