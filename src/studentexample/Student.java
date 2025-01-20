/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentexample;

/**
 *
 * @author gbmac
 */
public class Student {
    private String name; //encapsulation
    private String progName;
    private int marks; 
    private int semesterNum;
    private int testUpdate;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getSid() {
        return marks;
    }
    public void setSid(int marks) {
        this.marks = marks;
    }
    
    public int getSemesterNum() {
        return semesterNum;
    }
    public void setSemesterNum(int semesterNum) {
        this.semesterNum = semesterNum;
    }
    
    public String getProgName() {
        return progName;
    }
    public void setProgName(String progName) {
        this.progName = progName;
    }
}
