package com.example.affordmed;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Depot {
    @Id
    private Integer id;

    private int mechanicHours;

    public Depot(){
    }
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
}
