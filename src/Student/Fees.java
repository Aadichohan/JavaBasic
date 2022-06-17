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
public class Fees extends Student{
      public void _setId(int id){
        this.id = id;
      }
      public int _getId(){
        return id;
      }
    
      public void setAddres(String addres){
          System.out.println("Fees Address");
          this.addres = addres;
        }
        public String getAddres(){
          return addres;
        }
    public static void main(String[] args){
        Student std = new Student();
       // std.addres = "Peshawer";
        Fees f = new Fees();
      //  f.addres = "Ali";
        
      
        //std.
    }
}
