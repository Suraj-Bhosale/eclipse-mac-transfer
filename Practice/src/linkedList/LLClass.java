package linkedList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;






public class LLClass {
	Node head;
	private int size;
	
	LLClass(){
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
	
	public void addFirst(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		
		newNode.next = head;
		head = newNode;
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
	
	
	void deleteWithoutHead() {
		Node curr = head;
		
		int i = 0;
		
		while(i < 2) {
			curr = curr.next;
			i++;
		}
		curr.data = curr.next.data;
		curr.next = curr.next.next;
	}
	
	void swaping(Node a, Node b) {
		Node temp = a;
		a = b;
		b = temp;
	}
	
	void addBetween(int data, int pos) {
		Node newNode = new Node(data);
		
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node curr = head;
		int i = 1;
		while(i < pos) {
			curr = curr.next;
			i++;
		}
		
		//curr.next = newNode;
		newNode.next = curr.next;
		curr.next = newNode;
	}
	
    public Node middleNode() {
        
    	Node curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.next;
        }
        
        System.out.println("Size is: "+count);
        
        int midPosition = (count/2) + 1;
        System.out.println("MidPosition : "+ midPosition);
        Node currNode = head;
        
        int i = 1;
        while(i < midPosition){
            currNode = currNode.next;
            i++;
        }
        System.out.println("Print..."+ currNode.data);
        return currNode;
        
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
	
	public void deleteFirst() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	void deleteMiddle() {
		  if(head == null || head.next == null) {
			  return;
		  }
			int s = 0;
			int e = size;
			int mid = s + (e - s)/2;
			int i = 1;
			int targetIdx = mid;
			Node curr = head;
			while(i < targetIdx) {
				curr = curr.next;
				i++;
			}
			curr.next = curr.next.next;
			
		}
	public void deleteLast() {
		if(head == null) {
			System.out.println("List is empty");
			return;
		}
		
		size--;
		if(head.next == null) {
			head = null;
			return;
		}
		
		Node lastElement = head.next;
        Node secondLastElement = head;				
		while(lastElement.next != null) {
			lastElement = lastElement.next;
			secondLastElement = secondLastElement.next;
		}
		secondLastElement.next = null;
	}
	
	public void reverse() {
		Node currNode = head.next;
	    Node preNode = head;	
	    
	    if(head == null || head.next == null) {
	    	return;
	    	
	    }
	    
	    while(currNode != null) {
	    	Node nextNode = currNode.next;
	    	currNode.next = preNode;
	    	
	    	preNode = currNode;
	        currNode = nextNode;
		    
	    }
	    
	    head.next = null;
	    head = preNode;
	    
	
	}
	
	void removeDuplicateSorted() {
		Node curr = head;

		
		while(curr != null) {
			
			Node temp = curr;
			while(temp!=null  && temp.data == curr.data) {
				temp = temp.next;
			}
			curr.next = temp;
			curr = curr.next;
		}
	}
	
    boolean isPalindrome() 
    {
        Stack<Integer> st = new Stack<Integer>();
        Node curr = head;
        Node check = head;
        
        while(curr != null){
            st.push(curr.data);
            curr = curr.next;
        }
        
       while(check != null){
            if(check.data == st.peek()){
                
                st.pop();
                check = check.next;
            
            }
            else{
                return false;
            }
            
        }
	return true;
    }  
    
    public static Node reverse(Node head){
        Node current = head;
        Node previous = null;
        Node temp = null;
        while(current!=null){
            temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
        
    }
    
	   void removeDuplicatesUnSorted()
	    {
		   if(head == null)return;
            HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
            
            
            map.put(head.data, true);
            Node prev = head;
            while(true) {
            	
            	
            	Node curr = prev.next;
            	if(curr == null)break;
              	if(map.containsKey(curr.data)) {
              		prev.next = curr.next;
              	}
              	else {
              		map.put(curr.data, true);
              		prev = curr;
              	}
            }
           // System.out.println();
	    }
	
		  void divide(){
		        if(head==null){
		            return;
		        }
		        Node evenHead=null,evenTail=null;
		        Node oddHead=null,oddTail=null;
		        Node temp=head;
		        while(temp!=null){
		        	//System.out.println("What is: "+temp.data&1);
		            if((temp.data % 2)==0){
		                if(evenTail==null){
		                    evenHead=temp;
		                    evenTail=temp;
		                }
		                else{
		                    evenTail.next=temp;
		                    evenTail=temp;
		                }
		                temp=temp.next;
		                evenTail.next=null;
		            }
		            
		            
		            else{
		                if(oddTail==null){
		                    oddHead=temp;
		                    oddTail=temp;
		                }
		                else{
		                    oddTail.next=temp;
		                    oddTail=temp;
		                }
		                temp=temp.next;
		                oddTail.next=null;
		            }
		            
		        }
		        
//		        if(evenHead==null){
//		            return oddHead;
//		        }
		    
		        evenTail.next=oddHead;
		        head = evenHead;
		      //  return evenHead;
		    }
		  
		    void rearrangeEvenOdd(Node head)
		    {
		        Node odd=head, even=head.next, cur1=odd, cur2=even, temp;
		       
		       while(cur2 != null && cur2.next != null)
		       {
		           temp = cur2.next;
		           cur1.next = temp;
		           cur1 = cur1.next;
		           cur2.next = temp.next;
		           cur2 = temp.next;
		       }
		       
		       cur1.next = even;
		     }
		  void changePosition(int target) {
			  
			  Node prev = null;
			  Node curr = head;

			  
			  while(curr != null) {
				  
				  if(curr.data == target) {
					  Node checkFirstNode = curr;
					  Node currNode = curr;
					  Node prevNode = prev;
					  Node headNode = head;
//					  head = checkFirstNode;
//				
//					  checkFirstNode.next = headNode;
					 prevNode.next = currNode.next;
					 
					 head = checkFirstNode;
						
					checkFirstNode.next = headNode;
				  }
				  prev = curr;
				  curr = curr.next;
			  }
		  }
		  
			 public Node moveZeroes(){
				 
				 Node zeroHead = null;
				 Node zeroTail = null;
				 Node nonZeroHead = null;
				 Node nonZeroTail = null;
				 
				 Node currNode = head;
				 while(currNode != null) {
					if(currNode.data == 0) {
						if(zeroTail == null) {
							zeroHead = currNode;
							zeroTail = currNode;
						
						}
						else {
							zeroTail.next = currNode;
							zeroTail = currNode;
							
						}
						currNode = currNode.next;
						zeroTail.next = null;
					}
					
					else if(currNode.data >= 0) {
						if(nonZeroHead == null) {
							nonZeroHead = currNode;
							nonZeroTail = currNode;
					
						}
						else {
							nonZeroTail.next = currNode;
							nonZeroTail = currNode;
							
						}
						currNode = currNode.next;
						nonZeroTail.next = null;
					}
				 }
				 
				 if(zeroHead == null) {
					return zeroHead ;
				 }
				 zeroTail.next = nonZeroHead;
				 head = zeroHead;
				 
				return zeroHead;
			 }
			 
		  void SegregateEvenOdd() {
			  Node prev = null;
			  Node curr = head;
			  Node evenTail = null;

			  Node oddHead = null;
			  while(curr != null) {
				  
				  if(curr.data % 2 == 0) {
					  Node checkFirstNode = head;
					  Node currNode = curr;
					  Node prevNode = prev;
					  if(checkFirstNode.data % 2 != 0) {
						  

						  prevNode.next = currNode.next;
						  
						  head = currNode;
						  evenTail = currNode;
						  currNode.next = checkFirstNode;
						  oddHead = evenTail.next;
						
					  }
					  else {

						  prevNode.next = currNode.next;
					
						  currNode.next = oddHead;
						
					      evenTail.next = currNode;
					      
					      evenTail = currNode;
				
						  
					  }
					  
				  }

				  prev = curr;
				  curr = curr.next;
			  }
		  }
		  
		 //For example: Given 1->2->3->4->5 its reorder is 1->5->2->4->3.
		  Node reorderList() {
			 Node curr = head;
			 Node firstPartHead = head;
			 Node firstPartTail = null;
			 
			 int mid = (size/2)+1;
			 int i = 1;
			 
			 while(i < mid) {
				 curr= curr.next;
				 i++;
			 }
		 
			 firstPartTail = curr;
			 reverseReorderList(curr.next);
			 Node secondPartHead = head;
			 
			 firstPartTail.next = secondPartHead;
			 head = firstPartHead;
			return head;
		  }
		  
		  Node reverseReorderList(Node nod) {
				 Node prev = null;
				 Node currNode = nod;
				 Node nextNode = null;
				 
				 while(currNode != null) {
					 nextNode = currNode.next;
					 currNode.next = prev;
					 
					 prev = currNode;
					 currNode = nextNode;
				 }
				 head = prev;
				return head;
		  }
		  
		  void delHavingGreaterValue() {
			  Node prev = null;
			  Node curr = head;
	           while(curr.next != null) {
				  Node currNode = curr; 
				  Node prevNode = prev;
				 
				  if(currNode.next.data > currNode.data) {
					  
					  if(currNode == head) {
						
						  head = head.next;
						 
					  }
					  else {
						 
						  prevNode.next = prevNode.next.next;
					  }
				  }
				  List<Integer> list = new ArrayList<Integer>();
				  prev = curr;
				  curr = curr.next;
				  
			  }
		  }
	public static void main(String[] args) {
	  LLClass list = new LLClass();

      list.addLAst(1);
      list.addLAst(2);
      list.addLAst(3);
      list.addLAst(4);
      list.addLAst(5);
      list.printList();
      System.out.println("REverse");
      list.reverse();
      list.printList();
     // list.deletew(5);
     // list.printList();
	}
	

}
