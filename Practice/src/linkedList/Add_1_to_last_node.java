package linkedList;

import java.util.Scanner;

import linkedList.Insert_Node_In_Kth_Position.Node;

public class Add_1_to_last_node {
	Node head;
    private int size;
	
    Add_1_to_last_node(){
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
	
	public void add(int val) {
	  Node newNode = new Node(val);
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
	

	
	public static void main(String[] args) {
		Add_1_to_last_node ll = new Add_1_to_last_node();
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		String str = String.valueOf(no + 1);

		int n = str.length();
		
		for(int i = 0; i < n; i++) {
			int val = Integer.valueOf(str.charAt(i)) - 48;
	
			ll.add(val);
		}
		
		ll.print();

	}
}
