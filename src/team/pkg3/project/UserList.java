/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.pkg3.project;

import java.util.ArrayList;
/**
 *
 * @author wbm5061
 */
public class UserList {
    
    private ArrayList<User> theListOfUsers;
    private int numberOfUsers = 0;  //change this later
    char[] testPass = {'p','a','s','s'};
//    User user1 = new User("johnny2", testPass);
//    User user2 = new User("johnny3", testPass);
//    User user3 = new User("johnny4", testPass);
//    User user4 = new User("johnny5", testPass);
    
    public UserList()
    {
       theListOfUsers = new ArrayList();
       for (int c = 0; c < 100; c++)
       {
            User tempUser = new User("johnny" + c, testPass);
            theListOfUsers.add(tempUser);
            numberOfUsers++;
       }
    }
    
    public boolean authenticate(String usernameToCheck, char[] passwordToCheck)
    {
        boolean authenticated = false;
        boolean first;
        for(int c = 0; c < numberOfUsers; c++)
        {
            first = theListOfUsers.get(c).checkUsername(usernameToCheck);
            if(first == true)
            {
                authenticated = theListOfUsers.get(c).checkPassword(passwordToCheck);
            }
            if(authenticated == true)
            {
                return authenticated;
            }
        }
        
        
        return authenticated;
    }
    
}
