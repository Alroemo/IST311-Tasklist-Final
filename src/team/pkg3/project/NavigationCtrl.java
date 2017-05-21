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
public class NavigationCtrl {
    
    private MainMenuv2 theMainMenuv2;
    private TaskListController theTaskListController;
    
    

    
    public NavigationCtrl()
    {
        
    theMainMenuv2 = new MainMenuv2(this);
    theMainMenuv2.setVisible(true);
    theMainMenuv2.setLocationRelativeTo(null);
                
    }
    
    public void requestTaskList()
    {
        if(theTaskListController == null)
            theTaskListController = new TaskListController(this);
        else
            theTaskListController.requestViewer();
    }
    
   public void requestNavCtrl()
   {
       theMainMenuv2.setVisible(true);
   }
    
   
    
}
