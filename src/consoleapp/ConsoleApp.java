/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consoleapp;

import Student.Fees;
import Student.Student;

/**
 *
 * @author KFMAA1265
 */
public class ConsoleApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student std = new Student();
        std.setId(1);
        System.out.println("Std Id is: "+std.getId());
        
        std.setName("Ali");
        System.out.println("Std Name is: "+std.getName());
        
        std.setAddres("Lahore");
         System.out.println("Std Address is: "+std.getAddres());
        
         System.out.println("========");
         Fees fs = new Fees();
        // fs.addres = "Lahore";
        
         fs._setId(2);
         System.out.println("Fees Id is: "+fs._getId());
         
         fs.name= "Ali Khan";
         System.out.println("Fees Name is: "+fs.name);
         
         fs.setAddres("Karachi");
         System.out.println("Fees Address is: "+fs.getAddres());
         
         
    }
    
}
