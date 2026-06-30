package com.example.affordmed;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Vehicle {
    @Id
    private String taskId;

    private int duration;
    private int impact;

    public Vehicle(){
    }

    public void setTaskId(String taskId){
        this.taskId = taskId;
    }
    public String getTaskId(){
        return taskId;
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
    public int getImpact(){
        return impact;
    }
}
