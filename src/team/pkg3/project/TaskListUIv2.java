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
 * @author Wesley
 */
public class TaskListUIv2 extends javax.swing.JFrame{
    
    TaskListController realTaskListCtrl = null;
    JTable taskTable;
    
    public TaskListUIv2(TaskListController taskListCtrl)
    {
        realTaskListCtrl = taskListCtrl;
        
        this.setSize(800,400);
        this.setTitle("Task List");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        
        // a panel for ui components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        JPanel thePanel = new JPanel();
        thePanel.setLayout(new GridLayout(1,4));
        JPanel tablePanel = new JPanel();
        
        //create cell numbers for the gridlayout
        JPanel[] cellNumbers = new JPanel[5];
        for(int c = 0; c < 5; c++)
        {
            JPanel nextPanel = new JPanel();
            cellNumbers[c] = nextPanel;
            thePanel.add(nextPanel);
        }
        
        // Buttons
        JButton backToMainMenuButton = new JButton("Main Menu");
        JButton exitButton = new JButton("Exit app");
        JButton sortByNameButton = new JButton("Sort by name");
        
        // Button actions
        exitButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                System.exit(0);
            }
        });
        backToMainMenuButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                taskListCtrl.requestMainMenuFromTaskList();
            }
        });
        sortByNameButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                taskListCtrl.requestSortByName();
                
            }
        });
        
        
        // setup JTable stuff
        String[] columnTitles = {"Task", "Details", "Date", "Time"};
        int columns = 4; //number of columnTitles
        int size = taskListCtrl.requestSizeOfTaskList();
        Object[][] data = new Object[size][columns];
        //import task list data
        for(int c = 0; c < size; c++)
        {
            for(int i = 0; i < columns; i++)
            {
                switch(i)
                {
                    case 0:
                        data[c][0] = taskListCtrl.requestTaskList().getTask(c).getTaskName();
                        break;
                    case 1:
                        data[c][1] = taskListCtrl.requestTaskList().getTask(c).getTaskDescription();
                        break;
                    case 2:
                        data[c][2] = taskListCtrl.requestTaskList().getTask(c).getDay().toString();
                        break;
                    case 3:
                        data[c][3] = taskListCtrl.requestTaskList().getTask(c).getTime().toString();
                        break;
                    default:
                        System.out.println("Something messed up in the importing of tasks to the JTable");
                        break;
                }
            }
        }
        
        // Create the JTable
        taskTable = new JTable(data, columnTitles);
        
        // Assembly
        cellNumbers[0].add(backToMainMenuButton);
        cellNumbers[2].add(sortByNameButton);
        cellNumbers[4].add(exitButton);
        tablePanel.add(taskTable);
        JScrollPane tablePane = new JScrollPane(taskTable);
        taskTable.setFillsViewportHeight(true);
        
        // put all that stuff in
        mainPanel.add(tablePane, BorderLayout.CENTER);
        mainPanel.add(thePanel, BorderLayout.PAGE_END);
        this.add(mainPanel);
        
        
    }
    
}
