package revision;

public class LinkedListClone {
    Node head;
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
			//newNode = head;
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
		
	}
	
	public void addLast(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			newNode.next = head;
			return;
		}
		
		Node currNode = head;  

		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		//newNode = currNode.next;
		currNode.next = newNode;

	}
	
	public void deleteFirst() {
	
		if(head == null) {
			return;
		}
		
     head =head.next;
	}
	
	public void deleteLast() {
		
		if(head == null) {
			return;
		}
		
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node curr = head;
		Node nextNode = head.next;
		while(nextNode.next != null) {
			nextNode = nextNode.next;
			curr = curr.next;
		}
		curr.next = null;
       
	}
	
	public void print() {

		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		Node currNode = head;  

		while(currNode != null) {
			System.out.print(currNode.data + " ->");
			currNode = currNode.next;
		}
		
         System.out.println("NULL");
	}
	
	public void reverse() {
		if(head == null || head.next == null) {
			return;
		}
		Node pre = head;
		Node curr = head.next;
		
		while(curr.next != null) {
			Node nextNode = curr.next;
			curr.next = pre;
			pre = curr;
			curr = nextNode;
		}
		
		head.next = null;
		head = pre;
		
	}
	public static void main(String[] args) {
		LinkedListClone list = new LinkedListClone();
		list.addFirst(0);
		list.addLast(1);
		list.addLast(2);
		list.addLast(3);
		list.addLast(4);
//		list.print();
		list.deleteFirst();
		list.print();
//		list.deleteLast();
//		list.print();
//		list.reverse();
//		list.print();
		
	}

}
