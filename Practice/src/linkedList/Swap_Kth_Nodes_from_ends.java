package linkedList;

import java.util.Scanner;

import linkedList.Add_1_to_last_node.Node;

public class Swap_Kth_Nodes_from_ends {
	Node head;
    private int size;
	
    Swap_Kth_Nodes_from_ends(){
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
	
	public void swap(int n,int position) {
		
		
		Node firstValue = head;
		
		if(position > n) {
			return;
		}
		
		if(position == n ||position == 1 ) {
			Node cornerNode = head;
			int first = cornerNode.data;
			
			
			while(cornerNode.next != null) {
				cornerNode = cornerNode.next;
			}
			
			int second = cornerNode.data;
		
			
			head = head.next;
			Node addNode = new Node(second);
			
			addNode.next = head;
			head = addNode;
			
			cornerNode = head;
			
			while(cornerNode.next.next != null) {
				cornerNode = cornerNode.next;
			}
			
			cornerNode.next = null;
			
		
			Node newNodd = new Node(first);
			cornerNode.next = newNodd;
			
			return;
		}
		
		int j = 1;
		while(j < position) {
			firstValue = firstValue.next;
			j++;
		}

		int swapOneValue = firstValue.data;
		Node newNode = new Node(swapOneValue);
		Node currNode = head;

		int secondIndx = n - position;
		int i = 1;
		while(i < secondIndx) {
			currNode = currNode.next;
			i++;
		}

		
		int swapSecondValue = currNode.next.data;

	

	        newNode.next = currNode.next.next;
		    currNode.next = newNode;

		 
			Node newNode2 = new Node(swapSecondValue);
			     currNode = head;

			int firstIndx = position-1;
			 i = 1;
			while(i < firstIndx) {
				currNode = currNode.next;
				i++;
			}

		
		

		        newNode2.next = currNode.next.next;
			    currNode.next = newNode2;
			    
		    
	}
	

	
	public static void main(String[] args) {
		Swap_Kth_Nodes_from_ends ll = new Swap_Kth_Nodes_from_ends();
		
		
		Scanner scan = new Scanner(System.in);
		int no = scan.nextInt();
		int pos = scan.nextInt();

	
		
		for(int i = 0; i < no; i++) {
			int val = scan.nextInt();
	
			ll.add(val);
		}

		
		ll.swap(no,pos);
        ll.print();

	}
}
