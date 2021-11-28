/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentManagement;


/**
 *
 * @author jayes
 */
public class Student {
    private int uid;
    private int admin = 0;
    private int english;
    private int maths;
    private int science;
    
    
    public Student(int uid, int english, int maths, int science){
        this.uid = uid;
        this.english = english;
        this.maths = maths;
        this.science = science;
    }
    
    public int getuid(){
        return uid;
    }
    
    public int getadmin(){
        return admin;
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
}
