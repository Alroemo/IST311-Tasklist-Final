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
public class Time {
    
    private int hour;
    private int minute;
    private boolean isAM;
    
    public Time(int hour, int minute, boolean isAM)
    {
        this.hour = hour;
        this.minute = minute;
        this.isAM = isAM;
    }

    public String toString()
    {
        String tempString = Integer.toString(hour);
        if(minute == 0)
            tempString = tempString + ":00";
        else if(minute < 10)
            tempString = tempString + ":0" + minute;
        else
            tempString = tempString + ":" + minute;
        if (isAM)
         tempString = tempString + " AM";
        else
         tempString = tempString + " PM";
        return tempString;
    }
    
    /**
     * @return the hour
     */
    public int getHour() {
        return hour;
    }

    /**
     * @param hour the hour to set
     */
    public void setHour(int hour) {
        this.hour = hour;
    }

    /**
     * @return the minute
     */
    public int getMinute() {
        return minute;
    }

    /**
     * @param minute the minute to set
     */
    public void setMinute(int minute) {
        this.minute = minute;
    }

    /**
     * @return the isAM
     */
    public boolean isIsAM() {
        return isAM;
    }

    /**
     * @param isAM the isAM to set
     */
    public void setIsAM(boolean isAM) {
        this.isAM = isAM;
    }
    
    
}
