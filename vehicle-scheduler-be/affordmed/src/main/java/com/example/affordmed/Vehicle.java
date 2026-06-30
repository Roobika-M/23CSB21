package com.example.affordmed;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
    @Id
    private int id;

    private int mechanicHours;
    private int duration;
    private int impact;
    private String taskId;

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

    public void setMechanicHours(int mechanicHours){
        this.mechanicHours = mechanicHours;
    }
    public int getMechanicHours(){
        return mechanicHours;
    }

    public void setDuration(int duration){
        this.duration = duration;
    }
    public int getDuration(){
        return duration;
    }

    public void setImpact(int impact){
        this.impact = impact;
    }
    public int setImpact(){
        return impact;
    }

    public void setTaskId(String taskId){
        this.taskId = taskId;
    }
    public String getTaskId(){
        return taskId;
    }
}
