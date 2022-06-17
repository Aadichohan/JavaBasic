/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

/**
 *
 * @author KFMAA1265
 */
public class Student {
   int id;
   public String name;
   private int age;
   protected String addres;
   
//   public Student(int id, String name){
//    this.id =id;
//    this.name = name;
//   }
    
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
      return id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
      return name;
    }
    
    public void setAddres(String addres){
        System.out.println("Student Address");
          this.addres = addres;
    }
    public String getAddres(){
       return addres;
    }
    
    
}
