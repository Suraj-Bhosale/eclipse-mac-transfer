package linkedList;

import java.util.*;

import linkedList.LLClass.Node;

import java.lang.*;
import java.io.*;

public class Sum_Last_N_Nodes{  
	  
	Node head;
	private int size;
	
	Sum_Last_N_Nodes(){
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


	    public int sum(Node head, int k){
	        
	        Node curr = head;
	        int size = 1;
	        
	        while(curr.next != null){
	            size++;
	            curr = curr.next;
	        }
	        int posIdx = size - k;
	        
	        curr = head;
	        int sum = 0;
	        int i = 1;
	        while(curr != null){
	            if(posIdx == i){
	                sum += curr.data;
	            }
	            i++;
	            curr = curr.next;
	        }
	        
	        return sum;
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
		  Sum_Last_N_Nodes sList = new Sum_Last_N_Nodes(); 
	        
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