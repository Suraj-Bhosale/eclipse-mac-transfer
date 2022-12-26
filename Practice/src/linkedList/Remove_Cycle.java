package linkedList;

import linkedList.Remove_Cycle.Node;

public class Remove_Cycle {
    Node head;
	private int size;
	Remove_Cycle(){
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
	
	public void add(int data) {

		Node currNode = head;
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
		newNode.next = null;
	}
	
	public void print() {
		if(head == null) {
			return;
		}
		Node currNode = head;
	
		
		while(currNode != null) {
			System.out.print(currNode.data + "-> ");
			currNode = currNode.next;
		}
		
		System.out.println("NULL");
		
	}
	

	
	
	public void createLoop(int data) {
		Node temp = head;
		Node startNode = null;
		int count = 1;
		while(temp.next != null) {
			if(temp.data == data) {
				startNode = temp;
			}
			temp = temp.next;
			count++;
		}
		
		temp.next = startNode;
	}
	public boolean detectLoop() {
		Node slow = head;
		Node fast = head;
		if(head == null) {
			return false;
		}
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(slow == fast) {
				return true;
			}
		}
		
		return false;
	}
	
	public int detectFirstNode() {
        
		Node currNode = head;
		int length = size;
		int lastNodeInx = 1;
		while(lastNodeInx <= length) {
			currNode = currNode.next;
			lastNodeInx++;
		}
		
		if(currNode == null) {
			return 0;
		}
		return currNode.data;
	}
	
	public void deleteCycle() {
        
		Node currNode = head;
		int length = size;
		int lastNodeInx = 1;
		while(lastNodeInx < length) {
			currNode = currNode.next;
			lastNodeInx++;
		}
		
		if(currNode == null) {
			return ;
		}
		
		currNode.next = null;
	}
	
	public static void main(String[] args) {
		Remove_Cycle ll = new Remove_Cycle();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.print();
		ll.createLoop(70);
		//System.out.println(ll.size);
		//ll.print();
	    boolean result = ll.detectLoop() ? true : false;
	   // System.out.println(result);
//	    int check = ll.detectFirstNode();
//		System.out.println(check);
		//int first = ll.ll();
	     ll.deleteCycle();

		    boolean result2 = ll.detectLoop() ? true : false;
		   // System.out.println(result2);
	    
		if(result2 == false) {
			System.out.print("No Loop found");
		}
		else {
			System.out.print("Loop found and starting point is "+ll.detectFirstNode());
		}
		//ll.detectFirstNode();

	}
}

