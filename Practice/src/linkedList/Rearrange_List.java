package linkedList;

import java.util.*;

import linkedList.LLClass.Node;

import java.lang.*;
import java.io.*;

public class Rearrange_List{  
	  
	Node head;
	private int size;
	
	Rearrange_List(){
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

		public void addLAst(int data) {
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


		//For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.
	    public Node reverse(Node temp){
	        if(temp == null){
	            return null;
	        }
	        Node res = null;
	        while(temp != null){
	            Node curr = temp.next;
	            temp.next = res;
	            res = temp;
	            temp = curr;
	        }
	        return res;
	    }
	    public Node merge(Node L1, Node L2){
	        Node res = L1;
	        while(L1 != null){
	            Node l1 = L1.next;
	            Node l2 = L2.next;
	            L1.next = L2;
	            if(l1 == null){
	                break;
	            }
	            L2.next = l1;
	            L1 = l1;
	            L2 = l2;
	        }
	        return res;
	    }
	    Node reorderlist() {
	        if(head==null || head.next==null){
	            return head;
	        }
	        Node l1 = head;
	        Node slow = head;
	        Node fast = head;
	        Node prev = null;
	        
	        while(fast!=null && fast.next!=null){
	            prev = slow;
	            slow = slow.next;
	            fast = fast.next.next;
	        }
	        prev.next = null;
	        Node l2 = reverse(slow);
	        Node ans = merge(l1,l2);
	        return ans;
	    }
		  

			public void printList() {
				if(head == null) {
					System.out.print("List is Empty");
					return;
				}
				
				Node currNode = head;
				while(currNode != null) {
					System.out.print(currNode.data + " -> ");
					currNode = currNode.next;
				}
				
				System.out.println("NULL");
			} 
	  
	  public static void main(String[] args) {  
		  Rearrange_List list = new Rearrange_List(); 
		  list.addLAst(1);
		  list.addLAst(2);
	      list.addLAst(3);
	      list.addLAst(4);
	      list.addLAst(5);

	      list.reorderlist();
	      list.printList(); 
	  
	    }    
	} 