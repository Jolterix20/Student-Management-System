/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentManagement;


/**
 *
 * @author jayes
 */
public class Teacher{
    private int id;
    private int english;
    private int maths;
    private int science;
    private int admin = 1;
    
    public Teacher(int id, int english, int maths, int science){
        this.id = id;
        this.english = english;
        this.maths = maths;
        this.science = science;
    }
    
    public int getid(){
        return id;
    }
    
    public int getEnglish(){
        return english;
    }
    
    public int getMaths(){
        return maths;
    }
    
    public int getScience(){
        return science;
    }
    
    public int getadmin(){
        return admin;
    }
}
