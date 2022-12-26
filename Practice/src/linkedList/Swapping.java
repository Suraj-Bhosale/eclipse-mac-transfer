package linkedList;

import linkedList.Swapping.Node;

public class Swapping {
    Node head;
	private int size;
	Swapping(){
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

	void mainLogic(int a, int b) {
		Node curr = head;
		Node firstNode = head;
		Node secondNode = head;
		
		while(curr != null) {
			if(curr.data == a) {
				firstNode = curr;
			}
			
			if(curr.data == b) {
				secondNode = curr;
			}
			curr = curr.next;
		}
		System.out.println(firstNode.data +"  "+ secondNode.data);
		swaping(firstNode.data,secondNode.data);
	}
	void swaping(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
	}
	
	public static void main(String[] args) {
		Swapping ll = new Swapping();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		ll.add(60);
		ll.print();
		ll.mainLogic(20, 50);
		System.out.println();
		ll.print();
		


	}
}

