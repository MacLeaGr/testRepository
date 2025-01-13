/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentexample;

/**
 *
 * @author gbmac
 */
public class StudentExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // store 3 student details in array
    Student s1 = new Student();
    s1.setName("Peter");
    s1.setSid(1);
    
    Student s2 = new Student();
    s2.setName("John");
    s2.setSid(2);
    
    Student s3 = new Student();
    s3.setName("Kim");
    s3.setSid(3);
    
    Student[] list = new Student[3];
    list[0] = s1;
    list[1] = s2;
    list[2] = s3;
    
        for (Student list1 : list) {
            System.out.println(list1.getName() + " " + list1.getSid());
        }
    }
}
