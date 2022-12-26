package Recursion;

import java.util.*;

import linkedList.Sum_Last_N_Nodes.Node;

import java.lang.*;
import java.io.*;

import java.util.*;
import java.lang.*;
import java.io.*;

//Given a single linked list of size M, your task is to complete
//the function sumOfLastN_Nodes(), which should return the sum of 
//		last N nodes of the linked list.

  class LinkedListPractice {

   Node head;
   Node tail;
   
   class Node{
	   int data;
	   Node next;
	   Node(int data){
		   this.data = data;
		   this.next = null;
	   }
   }
   
   public void addFirst(int data) {
	   Node newNode = new Node(data);
	   
	   if(head == null) {
		   head = newNode;
		   tail = newNode;
		   return;
	   }
	   
	   newNode.next = head;
	   head = newNode;
   }
   
   public void addLast(int data) {
	   Node newNode = new Node(data);
	   
	   if(head == null) {
		   head = newNode;
		   tail = newNode;
		   return;
	   }
	   tail.next = newNode;
	   tail = newNode;
	  // newNode.next = null;
       
   }
   
   public void display() {
	   
	   if(head == null) {
		   return;
	   }
	   Node curr = head;
	   while(curr != null) {
		   System.out.print(curr.data + "-> ");
		   curr = curr.next;
	   }
	   System.out.println("Null");
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
	
	
	public void reverseO() {
		Node prev = head;
		Node curr = head.next;

		  Node temp = null;
		while(curr != null) {
			temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;
		}
		head.next = null;
	    head = prev;

	}
	
    public  Node reverse(){
        Node current = head;
        Node previous = null;
        Node temp = null;
        while(current!=null){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
        
    }
	  
    
    public void deleteFirst() {
    	if(head == null) {
    		return;
    	}
    	
    	head = head.next;
    }

    public void deleteLast() {
    	if(head == null) {
    		return;
    	}
        
    	Node curr = head;
    	
    	while(curr.next != tail) {
    		curr = curr.next;
    	}
    	
    	curr.next = tail.next;
    	tail = curr;
    }
	    
	  public static void main(String[] args) {
		  LinkedListPractice ls = new LinkedListPractice();
		  ls.addFirst(3);
		  ls.addFirst(2);
		  ls.addLast(4);
		  ls.addLast(5);
		  ls.addLast(6);
		  ls.display();
		  ls.deleteLast();
		  ls.deleteLast();
		  System.out.println("Change");
		  ls.display();

	  }
    }
