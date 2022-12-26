package linkedList;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Delete_Nth_position {
    
	Node head;
	Node head2;
	private int size;
	Delete_Nth_position(){
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
		if(head == null) {
			
			return;
		}
		while(currNode != null) {
			System.out.print(currNode.data+" -> ");
			currNode = currNode.next;
		}
        System.out.println("NULL");
	}

	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		head = head.next;
	}
	
    public void deleteNode(int k) {
    	if(k == 0) {
    		deleteFirst();
    		return;
    	}
    	int length = size;
    	//System.out.println(length);
    	Node currNode = head;
    	int preIndx = k - 1;
    	int i = 1;
    	while(i <= preIndx) {
    		currNode = currNode.next;
    		i++;
    	}
    	if(currNode.next == null) {
    		System.out.println("You are deleting out of list value");
    		return;
    	}
    	currNode.next = currNode.next.next;
    }
	
	public static void main(String[] args) {
		Delete_Nth_position ll = new Delete_Nth_position();

		
		Scanner scan = new Scanner(System.in);
		
		int n= scan.nextInt();
		for(int i = 0; i<n; i++) {
			int value = scan.nextInt();
			ll.add(value);
		}

		int k= scan.nextInt();
         ll.deleteNode(k);
         ll.print();
	}

}
