package main.java.com.example.affordmed;

@Entity
public class Notification {
    @Id
    private Integer ID;

    private String Type;
    private String Message;
    private Date Timestamp;

    public Notification(){
    }

    public void setId(int ID){
        this.ID = ID;
    }
    public int getID(){
        return ID;
    }

    public void setType(String Type){
        this.Type = Type;
    }
    public String getType(){
        return Type;
    }

    public void setMessage(String Message){
        this.Message = Message;
    }
    public String getMessage(){
        return Message;
    }

    public void setTimestamp(Date Timestamp){
        this.Timestamp = Timestamp;
    }
    public String getTimestamp(){
        return Timestamp;
    }
}