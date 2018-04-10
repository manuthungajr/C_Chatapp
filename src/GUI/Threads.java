/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
    
    

/**
 *
 * @author Dulanjana
 */
public class Threads {
    
    private int id;
    private String name;
    private String date;
    private String by;
    
    
    public Threads(int id, String name, String date,int Age){
        this.id=id;
        this.name=name;
        this.date=date;
        this.by=by;
    }
    

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getBy() {
        return by;
    }

    
    
}
