package hash;

import java.util.*;
import java.lang.*;
import java.io.*;

public class remove_duplicates_linkedList
{
    class Node{
      int data;
      Node next;
      Node(int data){
        this.data = data;
        this.next = null;
      }
    }

    public Node head;
    public Node tail;
    void add(int data){
      
      Node newNode = new Node(data);
        if(head == null){
          head = newNode;
          tail = newNode;
        }
      else{
        tail.next = newNode;
        tail = newNode;
        newNode.next = null;
      }
    }

   void removeDup(){
      HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();

      Node curr = head;
      Node prev = null;
     
      while(curr != null){

        if(map.containsKey(curr.data)){
          int freq = map.get(curr.data);
          map.put(curr.data,freq+1);
 
          prev.next = curr.next;
    
        }
        else{
          map.put(curr.data,1);
          prev = curr;
        }
        
        curr = curr.next;
        
      }
   
     
   }
    void print(){
      if(head == null){
        return;
      }

      Node curr = head;
      while(curr != null){
        System.out.print(curr.data+" -> ");
        curr = curr.next;
      }
      System.out.println("Null");
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		remove_duplicates_linkedList list = new remove_duplicates_linkedList();

        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        for(int i = 0; i < no; i++){
          int a = scan.nextInt();
          list.add(a);
        }
      list.removeDup();
      list.print();
	}

  
}
