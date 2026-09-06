package oops;
import java.util.*;
public abstract  class Emply {
    private String Name ;
    private int Id;

    public Emply (String Name , int Id){
        this.Name = Name;
        this.Id = Id;
    }

    public void setName(String name) {
        this.Name = Name;
    }

    public void getName () {
         this.Name ;
    }
    public void setId (int Id){
        this.Id = Id ;
    }
    public void getId () {
        this.Id = Id;
    }
}
