/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package team.pkg3.project;

/**
 *
 * @author Wesley
 */
public class Task {
    
    private String taskName;
    private String taskDescription;
    private boolean completed;
    private day day;
    private Time time;
    //add collaborator list when implemented
    
    public Task(String name, String description, day day, Time time)
    {
        this.taskName = name;
        this.taskDescription = description;
        this.day = day;
        this.time = time;
        this.completed = false;
    }

    /**
     * @return the taskName
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * @param taskName the taskName to set
     */
    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    /**
     * @return the taskDescription
     */
    public String getTaskDescription() {
        return taskDescription;
    }

    /**
     * @param taskDescription the taskDescription to set
     */
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    /**
     * @return the completed
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * @param completed the completed to set
     */
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    /**
     * @return the day
     */
    public day getDay() {
        return day;
    }

    /**
     * @param day the day to set
     */
    public void setDay(day day) {
        this.day = day;
    }

    /**
     * @return the time
     */
    public Time getTime() {
        return time;
    }

    /**
     * @param time the time to set
     */
    public void setTime(Time time) {
        this.time = time;
    }
    
    
    
}
