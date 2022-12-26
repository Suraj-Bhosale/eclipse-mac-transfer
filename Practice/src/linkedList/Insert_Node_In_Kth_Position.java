package linkedList;

import java.util.Scanner;

public class Insert_Node_In_Kth_Position {
	Node head;
    private int size;
	
    Insert_Node_In_Kth_Position(){
    	this.size = 0;
    }
    
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	public void add(int data) {
	  Node newNode = new Node(data);
	  Node currNode = head;
	  
	  if(head == null) {
		  head = newNode;
		  return;
	  }
	  while(currNode.next != null) {
		  currNode = currNode.next;
	  }
	  
	  currNode.next = newNode;
	  
	}
	
	public void print() {
		
		  Node currNode = head;
	
		  while(currNode != null) {
			  System.out.print(currNode.data+" ->");
			  currNode = currNode.next;
		  }
		  
		 System.out.println("NULL");
		  
	}
	
	public void insertNode(int k, int position) {
		Node newNode = new Node(k);
		Node currNode = head;
		
		if(position == 0) {
			newNode.next = head;
			head = newNode;
		    return;
		}
		int i = 1;
		while(i < position) {
			currNode = currNode.next;
			i++;
		}
		//currNode.next.next = newNode.next;
	//	currNode.next = newNode;
		newNode.next = currNode.next;
		currNode.next = newNode;
		
		
		//Insert element in particular position
            //newNode.next = currNode.next;
            //currNode.next = newNode;
		
		
		//Replace and Insert new at particular location
	        //newNode.next = currNode.next.next;
		    //currNode.next = newNode;
	}
	
	public static void main(String[] args) {
		Insert_Node_In_Kth_Position ll = new Insert_Node_In_Kth_Position();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++) {
			ll.add(scan.nextInt());
		}
		int k = scan.nextInt();
		int p = scan.nextInt();
		ll.insertNode(k,p);
		ll.print();

	}

}
