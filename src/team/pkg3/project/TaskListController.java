/**
 *
 * @author adlanar
 */

package team.pkg3.project; 
import java.awt.event.*;
import javax.swing.JButton;

public class TaskListController {
    //private TaskList model;
    private TaskListUIv2 view;
    NavigationCtrl realNavCtrl = null;
    TaskList theTaskList;

    public TaskListController(NavigationCtrl aNavCtrl) {
        //this.model = model;
        //this.view = view;
        realNavCtrl = aNavCtrl; 
        theTaskList = new TaskList();
        
        view = new TaskListUIv2(this);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        
        
        
        // Not sure what's going on here
//        class ButtonListener implements ActionListener {            
//            public void actionPerformed(ActionEvent e)
//            {
//                JButton clickSource = (JButton) e.getSource();
//               
//                if (clickSource == view.getSortButton())
//                {
//                    model.sortTask(view.getTaskListUI());
//                    view.setStatLabel("Task sorted!");
//                }
//            }
//        }
//        
//        view.ButtonListener(new ButtonListener()); 
    
        
           

    }
    
    public void requestViewer()
    {
        view.setVisible(true);
    }
    
    public void requestMainMenuFromTaskList()
        {
            view.setVisible(false);
            realNavCtrl.requestNavCtrl();
        }
    
    public TaskList requestTaskList()
    {
        return theTaskList;
    }
    
    public int requestSizeOfTaskList()
    {
        return theTaskList.requestSize();
    }
    
    public void requestSortByName()
    {
        theTaskList.requestSortByName();
        view.dispose();
        view = new TaskListUIv2(this);
        view.setVisible(true);
        view.setLocationRelativeTo(null);
        
    }
    
}
