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
    
    
    public Student(int uid){
        this.uid = uid;
    }
    
    public int getuid(){
        return uid;
    }
    
    public int getadmin(){
        return admin;
    }
}
