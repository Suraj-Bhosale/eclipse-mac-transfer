package linkedList;

import java.util.HashMap;
import java.util.Stack;

import Recursion.LinkedListPractice.Node;





public class Double_LinkedList_Main {
	Node head;
	private int size;
	
	Double_LinkedList_Main(){
		this.size = 0;
	}
	
	
	class Node{
        int data;
		Node next;
		Node prev;
		Node(int data){
			this.data = data;
			this.next = null;
			this.prev = null;
			size++;
		}
	}
	
	public void insertAtTail(int data) {

	    if(head == null){
	    	insertAtHead(data);
	        return;
	    }
	     
	    Node newNode = new Node(data);
	    Node temp = head;
	         
	    while(temp.next!=null){
	        temp = temp.next;
	    }
	    temp.next=newNode;
	    newNode.prev =temp;

	}
	

	
	private void insertAtHead(int data) {
		
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node curr = head;
		curr.prev = newNode;
		newNode.next = curr;
		head = newNode;
		
		
	   
//		newNode.next=head;
//	 
//	    if(head!=null){
//	        head.prev = newNode;
//	    }
//	     
//	    head = newNode;
	}

	
	void reverse() {
	    Node temp = null;
        Node current = head;
 
        /* swap next and prev for all nodes of
         doubly linked list */
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }

	}

	  void addBetweenDLL(int data) {
		  
		  Node curr = head;
		  Node newNode = new Node(data);
		  int i = 1;
		  int pos = 3;
		  
		  while(i < pos) {
			  curr = curr.next;
			  i++;
		  }
		  System.out.println("Current :" +curr.data);

		  newNode.next = curr.next;
          curr.next = newNode;  
          newNode.prev = curr;  
          newNode.next = curr.next.next;

	  }
	  
	public void printList() {
		if(head == null) {
			System.out.print("List is Empty");
			return;
		}
		
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		
		System.out.println("NULL");
	}
	

	  void deleteBetweenDLL() {
		  Node curr = head;
		  int i = 1;
		  int pos = 3;
		  
		  while(i < pos) {
			  curr = curr.next;
			  i++;
		  }
		  
		  curr.prev.next = curr.next;
		  curr.next.prev = curr.prev;
	  }
	  
	  void deleteFirst() {
		  Node curr = head;
		  
		  if(head == null) {
			  return;
		  }
		  
		  head = head.next;
		  head.prev = null;
	  }
	  
	  
	  void deleteLast() {
		  Node curr = head;
		  
		  
		  while(curr.next != null) {
			  curr = curr.next;
		  }
		  
		  curr.prev.next = null;
	  }

	

 
    

	
	public static void main(String[] args) {
	  Double_LinkedList_Main list = new Double_LinkedList_Main();
//      list.insertAtTail(1);
//      list.insertAtTail(2);
      list.insertAtHead(1);
      list.insertAtHead(0);
      list.insertAtHead(3);
      list.insertAtHead(4);
      list.insertAtTail(2);
      list.insertAtTail(3);
//      list.insertAtTail(4);
//      list.insertAtTail(5);
      list.printList();
      System.out.println();
      list.reverse();
      list.printList();
	}
	

}
