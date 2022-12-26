package linkedList;

import java.util.*;

import linkedList.LLClass.Node;

import java.lang.*;
import java.io.*;

public class deleteMid{  
	  
	Node head;
	private int size;
	
	deleteMid(){
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
			while(currNode.next != null) {
				currNode = currNode.next;
			}
			
			currNode.next = newNode;
		}


       Node deleteMiddle() {
        
        if(head.next == null){
            return null;
        }
        
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        

        
        int s = 0;
        int end = size;
        int mid = s + (end - s)/2;
        
        if(mid == size){
            return head.next;
        }
        int preIndx = mid;
        Node pre = head;
        int i = 1;
        while(i < preIndx){
            pre = pre.next;
            i++;
            
        }
        
        pre.next = pre.next.next;
        return head;
        
        
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
		  deleteMid sList = new deleteMid(); 
	        
	      Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt();
	      for(int i = 0; i < n; i++){
	        int value = scan.nextInt();
	        sList.addNode(value);
	      }
            sList.deleteMiddle();
	 
             sList.display();  
	  
	    }    
	} 