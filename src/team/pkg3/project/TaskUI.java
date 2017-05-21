package team.pkg3.project;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.HashSet;
import javax.swing.JFrame;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
/**
 *
 * @author Adlan Ramly
 */
public class TaskUI extends JFrame{
    private String task;
    private String description;
    private String location;
    private String tag;
    private String date;
    private boolean completed;
    private Time time;
    private Time startTime;
    private Time endTime;
    
    private JButton saveButton;
    private JButton cancelButton;
    private JButton deleteButton;
    
    private JTextField taskText;
    private JTextField descText;
    private JTextField locationText;
    private JTextField tagText;
    private JTextField startTText;
    private JTextField endTText;
    private JTextField dateText;
    private JTextField locText;
    private JTextField descriptionText;
    private JTextField startTTime;
    private JTextField endTTime;
    
    private JLabel taskLabel;
    private JLabel dateLabel;
    private JLabel descLabel;
    private JLabel completedLabel;
    private JLabel locLabel;
    private JLabel tagLabel;
    private JLabel timeLabel;
    private JLabel toLabel;
    private JLabel collabLabel;
    private JLabel summaryLabel;
    private JLabel statusLabel;
    //TODO: add checkboxes & radiobuttons!
    
    private Task t;
    
    //private TaskModel model;
    
    TaskUI(/*TaskModel model*/){
        //this.model = model;
        
       
        taskText = new JTextField("Enter Task");
        dateText = new JTextField("Enter Date");
        locationText = new JTextField("Enter Location");
        tagText = new JTextField("Enter Tag");
        descText = new JTextField("Enter Description");
        startTTime = new JTextField("");
        endTTime = new JTextField("");
        
        saveButton = new JButton("Save");
        deleteButton = new JButton("Delete");
        cancelButton = new JButton("Cancel");
        
        summaryLabel = new JLabel("No info yet");
        statusLabel = new JLabel("");
        
        taskLabel = new JLabel("Task:");
        dateLabel = new JLabel("Date:");
        completedLabel = new JLabel ("Completed?");
        timeLabel = new JLabel ("Time:");
        toLabel = new JLabel ("to");
        locLabel = new JLabel ("Location:");
        tagLabel = new JLabel("Tag:");
        descLabel = new JLabel ("Notes:");
        collabLabel = new JLabel("Collaborators:");
      
        //checkbuttons & radiobuttons
        
        JPanel content = new JPanel();
        
        GridLayout grid = new GridLayout(4,1);
        content.setLayout(grid);
        
        content.add(taskLabel);
        content.add(taskText);
        //checkbutton
        content.add(completedLabel);
        content.add(dateLabel);
        content.add(dateText);
        content.add(timeLabel);
        content.add(startTText);
        content.add(toLabel);
        content.add(endTText);
        content.add(locLabel);
        content.add(locText);
        content.add(tagLabel);
        content.add(tagText);
        content.add(descLabel);
        content.add(descText);
        content.add(collabLabel);
        //radiobuttons
        content.add(deleteButton);
        content.add(saveButton);
        content.add(cancelButton);
        
        this.setContentPane(content);
        this.pack();
        this.setTitle("Task");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void ButtonListener(ActionListener al) 
    {    
        saveButton.addActionListener(al);
        cancelButton.addActionListener(al);
        deleteButton.addActionListener(al);
    }
    
    public void setCurrentWord(String newWord)
    {
        taskText.setText(newWord);
        descText.setText(newWord);
        dateText.setText(newWord);
        locationText.setText(newWord);
        tagText.setText(newWord);
        descText.setText(newWord);
        //Time variable types?
        //startTTime.setText(newWord);
        //endTTime.setText(newWord);
    }
    
    public String getTaskName(){
        return taskText.getText();
    }
    
    public String getDate(){
        return dateText.getText();
    }
    
    public String getDesc(){
        return descriptionText.getText();
    }
    
    public String getloc(){
        return locationText.getText();
    }
  
    public String getTag(){
        return tagText.getText();
    }
    
    public JButton getSaveButton() {
        return this.saveButton;
    }
    
    public JButton getCancelButton() {
        return this.cancelButton;
    }
  
    public JButton getDeleteButton() {
        return this.deleteButton;
    }
}

