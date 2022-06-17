/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectList;

import java.util.Stack;

/**
 *
 * @author KFMAA1265
 */
public class LearnStack {
//    First In lastOut
     Stack<String> animal = new Stack<>();
    public  void pushItem(String item){
        animal.push(item);
    }
    
    public static void main(String[] args){
        LearnStack lsk = new LearnStack();
        lsk.pushItem("cat");
        lsk.pushItem("cow");
        lsk.pushItem("horse");
        
        System.out.println("animal "+lsk.animal);
        System.out.println("peak "+lsk.animal.peek());
        System.out.println("pop "+lsk.animal.pop());
        System.out.println("animal after pop "+lsk.animal);
    }
    
    
}
