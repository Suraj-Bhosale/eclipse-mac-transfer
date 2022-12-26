package linkedList;

public class FirstNode_Detect_Loop {
    Node head;
	private int size;
	FirstNode_Detect_Loop(){
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
			if(count == data) {
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
	
	public static void main(String[] args) {
		FirstNode_Detect_Loop ll = new FirstNode_Detect_Loop();
		ll.add(1);
		ll.add(2);
		ll.add(3);
		ll.add(4);
		ll.add(5);
		ll.add(6);
		ll.print();
		ll.createLoop(4);
		//System.out.println(ll.size);
		//ll.print();
	    boolean result = ll.detectLoop() ? true : false;
//	    int check = ll.detectFirstNode();
//		System.out.println(check);
		//int first = ll.ll();
		if(result == false) {
			System.out.print("No Loop found");
		}
		else {
			System.out.print("Loop found and starting point is "+ll.detectFirstNode());
		}
		//ll.detectFirstNode();

	}
}
