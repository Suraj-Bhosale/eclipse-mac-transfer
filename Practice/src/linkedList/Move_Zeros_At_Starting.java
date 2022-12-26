package linkedList;

import java.util.*;

import linkedList.LLClass.Node;

import java.lang.*;
import java.io.*;

public class Move_Zeros_At_Starting{  
	  
	Node head;
	private int size;
	
	Move_Zeros_At_Starting(){
		this.size = 0;
	}
	
	
		class Node{
	        int data;
			Node next;
			Node(int data){
				this.data = data;
				this.next = null;
				size++;
			}
		}

		public void addNode(int data) {
			Node newNode = new Node(data);
			if(head == null) {
				head = newNode;
				return;
			}
			
			
			
			Node currNode = head;
			System.out.println(currNode.data+"  Test  ");
			while(currNode.next != null) {
				currNode = currNode.next;
			}
			
			currNode.next = newNode;
		}


		public Node moveZeroes(){
			 
			 Node zeroHead = null;
			 Node zeroTail = null;
			 Node nonZeroHead = null;
			 Node nonZeroTail = null;
			 
			 Node currNode = head;
			 while(currNode != null) {
				if(currNode.data == 0) {
					if(zeroTail == null) {
						zeroHead = currNode;
						zeroTail = currNode;
					
					}
					else {
						zeroTail.next = currNode;
						zeroTail = currNode;
						
					}
					currNode = currNode.next;
					zeroTail.next = null;
				}
				
				else if(currNode.data >= 0) {
					if(nonZeroHead == null) {
						nonZeroHead = currNode;
						nonZeroTail = currNode;
				
					}
					else {
						nonZeroTail.next = currNode;
						nonZeroTail = currNode;
						
					}
					currNode = currNode.next;
					nonZeroTail.next = null;
				}
			 }
			 
			 if(zeroHead == null) {
				return zeroHead ;
			 }
			 zeroTail.next = nonZeroHead;
			 head = zeroHead;
			 
			return zeroHead;
		 }
		 

		public void display() {  

			Node current = head;  
			if(head == null) {  
			System.out.println("List is empty");  
			 return;  
			        }  
			        while(current != null) {  
			            
			            System.out.print(current.data + " ");  
			            current = current.next;  
			        }  
			        System.out.println();  
		}  
	  
	  public static void main(String[] args) {  
		  Move_Zeros_At_Starting sList = new Move_Zeros_At_Starting(); 
	        
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt();
	      for(int i = 0; i < n; i++){
	        int value = scan.nextInt();
	        sList.addNode(value);
	      }
            sList.moveZeroes();
	 
             sList.display();  
	  
	    }    
	} 