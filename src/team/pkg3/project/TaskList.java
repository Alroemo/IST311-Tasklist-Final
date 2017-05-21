/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.pkg3.project;

import java.util.ArrayList;

/**
 *
 * @author Wesley
 */
public class TaskList {
    private ArrayList theTaskList;
    
    public TaskList()
    {
        if(theTaskList == null)
        {
            theTaskList = new ArrayList<Task>();

            //lets create a couple of generic tasks
            Task tempTask;
            tempTask = new Task("Submit sprint","Due sunday night", new day("March",26,2017), new Time(12,00,true));
            theTaskList.add(tempTask);
            tempTask = new Task("Finish peer Review","Due sunday night", new day("March",26,2017), new Time(12,00,true));
            theTaskList.add(tempTask);
            tempTask = new Task("Lunch with Friends","At Panda Express", new day("March",26,2017), new Time(12,00,false));
            theTaskList.add(tempTask);
            System.out.println("Created tasks");
        }
    }
    
    
    public void requestSortByName()
    {
        //bubble sort for now
        boolean sorted = true;
        Task temp;
        
        while(sorted)
        {
            sorted = false;
            for (int c = 0; c < requestSize(); c++)
            {
                for (int i = c + 1; i < requestSize(); i++)
                {
                    //System.out.println(getTask(c).getTaskName().compareToIgnoreCase(getTask(i).getTaskName()) > 0);
                    if (getTask(c).getTaskName().compareToIgnoreCase(getTask(i).getTaskName()) > 0)
                    {

                        temp = getTask(c);
                        
                        editTask(c, getTask(i));
                        editTask(i, temp);
                        sorted = true;
                    }
                }
            }
        }
        System.out.println("sorted");
        
    }
    
    public int requestSize()
    {
        return theTaskList.size();
    }
    
    public void addTask(Task task)
    {
        theTaskList.add(task);
    }
    
    public Task getTask(int index)
    {
        return (Task) theTaskList.get(index);
    }
    
    public void deleteTask(int index)
    {
        theTaskList.remove(index);
    }

    /**
     * Task at the index will be deleted and the supplied task 
     * will be injected into the list at the same index.
     * @param index index of task to edit
     * @param task supply a new task with the changes
     */
    public void editTask(int index, Task task)
    {
        deleteTask(index);
        theTaskList.add(index, task);
    }
    
    /**
     * @return the theTaskList
     */
    public ArrayList getTheTaskList() {
        return theTaskList;
    }
    
}
