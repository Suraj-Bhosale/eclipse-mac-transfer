package linkedList;



import java.util.HashMap;
import java.util.Stack;

import Recursion.LinkedListPractice.Node;





public class Circular_LinkedList_Main {
	//Node head;
	private int size;
	
	Circular_LinkedList_Main(){
		this.size = 0;
	}
	
	
	class Node{
        int data;
		Node next;
		Node(int data){
			this.data = data;
		
			size++;
		}
	}

    public Node head = null;  
    public Node tail = null;  
  
   
    public void addLast(int data){  
  
        Node newNode = new Node(data);  
     
        if(head == null) {  
         
            head = newNode;  
            tail = newNode;  
            newNode.next = head;  
        }  
        else {  
   
            tail.next = newNode;  
          
            tail = newNode;  
             
            tail.next = head;  
        }  
    }  
  
    //Displays all the nodes in the list  
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
        }  
        else {  
             
             do{  
                //Prints each node by incrementing pointer.  
                System.out.print(current.data+ " -> ");  
                current = current.next;  
            }while(current != head);  
            System.out.println("Null");  
        }  
    }  

    
	 void addHead(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		tail.next = newNode;
	}
	 

	 
	 void print() {
			if(head == null) {
		
				return;
			}
			
			Node curr = head;
			do {
				System.out.print(curr.data+" -> ");
				curr = curr.next;
			}
			while(curr != head);
				
			System.out.println();
	 }
	
	  void exchangeNodes() {
		  Node curr = head;
		  
		  while(curr.next != tail) {
			  curr = curr.next;
		  }
		  Node lastNod = tail;
		  curr.next = head;

		  lastNod.next = head;
		  head = lastNod;

		  curr.next = head;
		  
		  Node firstNo = lastNod.next;
		  lastNod.next = lastNod.next.next;
		  curr.next = firstNo;
		  firstNo.next = head;
	  }
	
	public static void main(String[] args) {
	  Circular_LinkedList_Main list = new Circular_LinkedList_Main();
     // list.addHead(1);
      list.addLast(2);
      list.addLast(3);
      list.addHead(0);
      list.addHead(-1);
//      list.addLast(4);
     // list.addHead(3);
     // System.out.print(list.isCircular()?"1":"1");
     list.display();
	}





	

}

