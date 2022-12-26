package linkedList;

import java.util.*;
import java.lang.*;
import java.io.*;
public class Merge_Sorted_List {
    
	Node head;
	Node head2;
	private int size;
	Merge_Sorted_List(){
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
	
	public Node add(int data) {
		Node newNode = new Node(data);
		Node currNode = head;
		if(head == null) {
			head = newNode;
			return newNode;
		}
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
		return newNode;
	}
	
	public void add2(int data) {
		Node newNode = new Node(data);
		Node currNode = head2;
		if(head2 == null) {
			head2 = newNode;
			return;
		}
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
		newNode.next = null;
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
	
	public void print2() {
		
		Node currNode = head2;
		if(head2 == null) {
			
			return;
		}
		while(currNode != null) {
			System.out.print(currNode.data+" -> ");
			currNode = currNode.next;
		}
        System.out.println("NULL");
	}
	
	public void merge() {
		Node l1 = head;
		Node l2 = head2;
		Node temp = new Node(0);
		Node currNode = temp;
		
		while(l1 != null && l2 != null) {
			if(l1.data < l2.data) {
				currNode.next = l1;
				l1 = l1.next;
			}
			else {
				currNode.next = l2;
				l2 = l2.next;
			}
			currNode = currNode.next;
		}
		
		if(l1 != null) {
			currNode.next = l1;
			l1 = l1.next;
		}
		
		if(l2 != null) {
			currNode.next = l2;
			l2 = l2.next;
		}
		
		Node ans = temp.next;
		System.out.print(ans);
		//return temp.next;
		
	}
	
	public static void main(String[] args) {
		Merge_Sorted_List ll = new Merge_Sorted_List();
//		ll.add(1);
//		ll.add(3);
//		ll.add(5);
//		ll.add(7);
//		
//		ll.add2(2);
//		ll.add2(4);
//		ll.add2(6);
//		ll.add2(8);
//		ll.print();
//		ll.print2();
		
//		Scanner scan = new Scanner(System.in);
//		
//		int n= scan.nextInt();
//		for(int i = 0; i<n; i++) {
//			int value = scan.nextInt();
//			ll.merge(null, null);
//		}
//		Node head1 = null;
//		Node head2 = null;
		int[] arr1 = {1,3,4,6};
		int[] arr2 = {8,9,11};
		
		for(int i = 0; i<arr1.length; i++) {
			ll.add(arr1[i]);
		}
		
		for(int i = 0; i<arr2.length; i++) {
			ll.add2(arr2[i]);
		}
		
	 	ll.merge();
//
//		Node head = ll.merge(head1, head2);
//		System.out.println(head);
		
		
		

	}

}
