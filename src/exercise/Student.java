/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise;

/**
 *
 * @author Soykot
 */
public class Student {
    String studentName;
    
    public static void main(String []args){
        Student [] student = new Student [10];
        
        student[0] = new Student();
        student[1] = new Student();
        student[2] = new Student();
        student[3] = new Student();
        student[4] = new Student();
        student[5] = new Student();
        student[6] = new Student();
        student[7] = new Student();
        student[8] = new Student();
        student[9] = new Student();
        
        student[0].studentName = "Titu";
        student[1].studentName = "Soykot";
        student[2].studentName = "Shovon";
        student[3].studentName = "Manik";
        student[4].studentName = "Smrittee";
        student[5].studentName = "Bristy";
        student[6].studentName = "Aurthi";
        student[7].studentName = "Saiful";
        student[8].studentName = "Mimi";
        student[9].studentName = "Israfil";
        
        int x = 0;
        
        while(x<student.length){
            student[x].getName();
            x++;
        }
        
    }
    
    public void getName(){
        System.out.println(studentName + " is a student.");
    }
    
}
