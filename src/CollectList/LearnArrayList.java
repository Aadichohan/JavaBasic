/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CollectList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author KFMAA1265
 */
public class LearnArrayList {
     ArrayList<String> std = new ArrayList<>();
     ArrayList<String> newStd = new ArrayList<>();
     ArrayList<Integer> tech = new ArrayList<>();
     ArrayList<List> newList = new ArrayList<>();
    // Normal Array that is not scalable
  //  public String[] Arry(){   
//        String[]  stds = new String[2];
//         stds[0] = "Ali";
//         stds[1] = "Ahmed";
////         stds[2] = "Hussain";
//        return stds;
//    }
    
//      public void setArryList( String name){
//        // Add element on specif index
//       // initially it creates  10 length empty array
//        // then you add 11th element into it creates new array and copies old array into it 
////        and extends size  by n + n/2 + 1
////           if n = 10 then 10 + 10 /2 + 1 = 16   
//        std.add(name);
//        System.out.println(std);
//    }
    public void setStringArryList(ArrayList<String> _arr, String name){
        _arr.add(name);
        System.out.println(_arr);
    }
    public void setStringArryList(int ind, ArrayList<String> _arr, String name){
        // Add element on specif index
        _arr.add(ind,name);
        System.out.println(_arr);
    }
    
    public void setIntArryList(ArrayList<Integer> _arr, Integer val){
        _arr.add(val);
    }
    
    public void setIntArryList(int ind, ArrayList<Integer> _arr, Integer val){
        // Add element on specif index
        _arr.add(ind,val);
        System.out.println(_arr);
    }
    
    public void setListArryList(ArrayList<List> _arr, List val){
        _arr.addAll(val);
    }
    

    public ArrayList<String> getStringArryList(ArrayList<String> _arr){
        return _arr;
    }
    
    public void addAllArryList(ArrayList<String> _newStd ,ArrayList<String> _std){
       _newStd.addAll(_std);
    }
    
    public void setStringArryList(ArrayList<String> _arr , int i, String val){
//        update value on specific index
       _arr.set(i,val);
    }
    
    public void removeStringArryList(ArrayList<String> _arr , int i){
       _arr.remove(i);
    }
 
    public static void main(String[] args){
        LearnArrayList lst = new LearnArrayList();
        // Normal Array that is not scalable
//        for(int i = 0; i < lst.Arry().length; i++)
//        System.out.println(lst.Arry()[i]);
        // lst.ArryList().add("Ahmed");
        lst.setStringArryList(lst.std,"Ali");
        lst.setStringArryList(lst.std,"Arsalan");
           System.out.println("Befor adding last "+lst.std);
        lst.setStringArryList(lst.std,"Abu Bakar");
        for(int i = 0; i < lst.std.size(); i++){
             System.out.println("======");
          System.out.println(lst.std.get(i));
          System.out.println("======");
          System.out.println(lst.getStringArryList(lst.std).get(i));
        }
         lst.setStringArryList(1,lst.std, "Umer");
         
         // copy all element of old arraylist to new
         lst.addAllArryList(lst.newStd, lst.std);
         
         lst.setStringArryList(lst.newStd,"Hussain");
         System.out.println("newStd "+lst.newStd);
         
         lst.removeStringArryList(lst.newStd, 1);
         System.out.println("newStd after Remove "+lst.newStd);
         
         lst.setStringArryList(lst.newStd, 1, "Umer");
         System.out.println("newStd after Set "+lst.newStd);
         
          System.out.println("get Index "+lst.newStd.indexOf("Umer"));
          System.out.println("get clone "+lst.newStd.clone());
          System.out.println("get contains "+lst.newStd.contains("Ali"));
          System.out.println("get isEmpty "+lst.newStd.isEmpty());
          
          
         lst.setIntArryList(lst.tech, 1);
         lst.setIntArryList(lst.tech, 12);
         lst.setIntArryList(lst.tech, 9);
        
         lst.setListArryList(lst.newList,lst.newStd);
         lst.setListArryList(lst.newList,lst.tech);
         
         System.out.println("new List "+lst.newList);
         
//         print newList using for loop
          System.out.println("\nprint newList using for loop");
         for(int i = 0; i < lst.newList.size(); i++){
             System.out.println("For Loop Item is: "+lst.newList.get(i));
         }
          System.out.println("\nprint newStd using For Each");
         for(String elem : lst.newStd){
             System.out.println("For Each Item is: "+elem);
         }
         
         System.out.println("\nprint newList using Iterator");
         Iterator<List> it =  lst.newList.iterator();
         while(it.hasNext()){
              System.out.println("Iterate Item: "+it.next());
         }
       //  System.out.println();
    }
}
