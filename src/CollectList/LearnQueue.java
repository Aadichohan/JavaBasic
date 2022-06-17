/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author KFMAA1265
 */
public class LearnQueue {
//    First in First Out FIFO
    Queue<Integer>  num = new LinkedList<>();
    
    public  void offerItem(int item){
        num.offer(item);
    }
     public static void main(String[] args){
     
         LearnQueue lq = new LearnQueue();
         
         lq.offerItem(1);
         lq.offerItem(2);
         lq.offerItem(3);
         lq.offerItem(4);
         lq.offerItem(5);
         
         System.out.println("Queue Items: "+lq.num);
         
         System.out.println("Queue poll to remove val : "+lq.num.poll());
         System.out.println("Queue Items: "+lq.num);
         
          System.out.println("Queue peek : "+lq.num.peek());
     }
    
}

//The Queue interface includes all the methods of the Collection interface. It is because Collection is the super interface of Queue.
//
//Some of the commonly used methods of the Queue interface are:
//
//add() - Inserts the specified element into the queue. If the task is successful, add() returns true, if not it throws an exception.
//offer() - Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
//element() - Returns the head of the queue. Throws an exception if the queue is empty.
//peek() - Returns the head of the queue. Returns null if the queue is empty.
//remove() - Returns and removes the head of the queue. Throws an exception if the queue is empty.
//poll() - Returns and removes the head of the queue. Returns null if the queue is empty.
