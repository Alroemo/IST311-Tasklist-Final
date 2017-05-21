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
public class LoginCtrl {
    
       private UserList theUserList;
       private LoginUIv2 theLoginUIv2;
       private NavigationCtrl theNavigationCtrl;
       
       public LoginCtrl(){
           theUserList = new UserList();
           theLoginUIv2 = new LoginUIv2(this);
           theLoginUIv2.setLocationRelativeTo(null);
           theLoginUIv2.setVisible(true);
       }
       
       public boolean requestAuthenticate(String usernameToCheck, char[] passwordToCheck)
       {
           boolean authenticated;
           
           authenticated = theUserList.authenticate(usernameToCheck, passwordToCheck);
           
           return authenticated;
       }
       
       public void requestNagivationCtrl()
       {
            theLoginUIv2.setVisible(false);
            theNavigationCtrl = new NavigationCtrl();
       }
}


