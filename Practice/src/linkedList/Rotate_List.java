package linkedList;

import java.util.HashMap;
import java.util.Scanner;

import hash.remove_duplicates_linkedList;


public class Rotate_List {

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

        void rotateLogic() {
        	Node curr = head;
        	Node endNode = head;
        	
        	while(endNode.next != null) {
        		endNode = endNode.next;
        	}
        	
        	while(curr.next != endNode) {
        		curr = curr.next;
        	}

        	endNode.next = head;
	        	
	        	head = endNode;
	        	curr.next = null;

        }
        
        void rotate(int k) {
        	int i = 0;
        	 while(i < k) {
        		 rotateLogic();
        		 i++;
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
			Rotate_List list = new Rotate_List();
                  list.add(1);
                  list.add(2);
                  list.add(3);
                  list.add(4);
                  list.add(5);
                  list.rotate(4);
			      list.print();
		}

	  

}
