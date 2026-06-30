package com.example.notify;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Notification {
    @Id
    private Integer id;

    private String type;
    private String message;
    private String timestamp;

    public Notification(){
    }

    public void setid(int id){
        this.id = id;
    }
    public int getid(){
        return id;
    }

    public void settype(String type){
        this.type = type;
    }
    public String gettype(){
        return type;
    }

    public void setmessage(String message){
        this.message = message;
    }
    public String getmessage(){
        return message;
    }

    public void settimestamp(String timestamp){
        this.timestamp = timestamp;
    }
    public String gettimestamp(){
        return timestamp;
    }
}