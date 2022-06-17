/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author KFMAA1265
 */
public class LearnLinkedList {
    Queue<Integer> age = new LinkedList<>();
    List<String> name  = new LinkedList<>();
    
     public  void offerItem(int item){
        age.offer(item);
     }
     public  void addItem(String item){
        name.add(item);
     }
     public  void addItem(int i, String item){
         // add item on specific index
        name.add(i,item);
     }
      public void setItem(int i, String item){
         // update item on specific index
        name.set(i,item);
     }
      public static void main(String[] args){
          LearnLinkedList lst = new LearnLinkedList();
          // offer queue FIFO
          lst.offerItem(1);
          lst.offerItem(2);
          lst.offerItem(3);
          lst.offerItem(4);
          System.out.println("Queue: "+lst.age);
          System.out.println("Queue peek : "+lst.age.peek());
          System.out.println("Queue poll : "+lst.age.poll());
           System.out.println("Queue after poll : "+lst.age);
          System.out.println("========\n");
          
          lst.addItem("Ali");
          lst.addItem("Hamza");
          lst.addItem("Qasim");
          
          System.out.println("List: "+lst.name);
          lst.addItem(1,"Rayan");
          
          System.out.println("List remove : "+lst.name.remove(0));
            
           lst.setItem(2,"Haris");
           System.out.println("List after set : "+lst.name);
          System.out.println("========\n");
          
      }
    
}
