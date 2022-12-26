
package binary_Tree;

import java.util.*;
import java.lang.*;
import java.io.*;



 public class Increasing_order_tree {

	public static void main(String[] args)throws java.lang.Exception {
	    // int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		   //  int arr[] = {1, 2, 5, 3, 4, 6};
        TreeM bst = new TreeM();

		int[] arr = {1, 2, 3};
		

		for (int i = 0; i < arr.length; i++) {
			bst.root = bst.addNode(bst.root, arr[i]);
		}
		
//		System.out.println(tree.rangeSumBST(tree.root,6,10));

	        System.out.println(bst.leafSimilar(bst.root));

	}
	
 }
//	class Node{
//		int data;
//		Node left;
//		Node right;
//		Node(int data){
//			this.data = data;
//			this.left = null;
//			this.right = null;
//		}
//	 }
	
	
	class TreeM{
		Node root;
		Node addNode(Node currNode, int key) {
			if(currNode == null) {
				Node newNode = new Node(key);
				return newNode;
			}
			
			if(currNode.data < key) {
				currNode.right = addNode(currNode.right,key);
			}
			else {
				currNode.left = addNode(currNode.left,key);
			}
			
			return currNode;
			
		}
		
		void preOrder(Node currNode) {
			if(currNode == null) {
				System.out.print(currNode.data);
			}
			//System.out.println();
			preOrder(currNode.left);
			preOrder(currNode.right);
		}
		
	    private Node result;
	    private Node pre;
	    public Node increasingBST(Node root) {
	        inorder(root);
	        return result;
	    }
	    private void inorder(Node root) {
	        if (root == null) {
	            return;
	        }
	        inorder(root.left);
	        if (result == null) {
	            result = root;
	        } else {
	            pre.right = root;
	        }
	        pre = root;
	        root.left = null;
	        inorder(root.right);
	    }
	}

