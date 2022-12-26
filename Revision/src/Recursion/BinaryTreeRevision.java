package Recursion;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;



//     10
//    /   \
//   7     15
//  / \   / \
// 5   8 13   17
/// \    / \
//3  6  11   14
//
//int[] arr = {10,7,5,3,6,8,15,13,11,14,17};
    
    
	public class BinaryTreeRevision {
		public static void main(String[] args) {
	         Tree bst = new Tree();
	         int[] arr = {10,7,5,3,6,8,15,13,11,14,17};
	         
	         for(int i = 0; i < arr.length; i++) {
	        	 int a = arr[i];
	        	 bst.root = bst.addNode(bst.root, a);
	         }
	         
	         bst.preOrder(bst.root);
		}
	}


	class Node{
       int data;
       Node left;
       Node right;
       Node(int data){
    	   this.data = data;
    	   this.left = null;
    	   this.right = null;
       }
	}
	
	class Tree{
		
		Node root;
		
		public Node addNode(Node currNode, int key) {
			if(currNode == null) {
				Node curr = new Node(key);
				return curr;
			}
			
			if(currNode.data > key) {
				currNode.left = addNode(currNode.left, key);
			}
			else {
				currNode.right = addNode(currNode.right, key);
			}
			
			return currNode;
		}
		
		public void preOrder(Node curr) {
			if(curr == null) {
				return;
			}
			
			System.out.print(curr.data+" ");
			preOrder(curr.left);
			preOrder(curr.right);
		}
		
		public void 
		
		
		
	
	}



