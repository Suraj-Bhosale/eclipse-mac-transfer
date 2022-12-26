


import java.util.*;
import java.lang.*;
import java.io.*;



 public class Minimum_value_BST {

	public static void main(String[] args)throws java.lang.Exception {
	    // int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		   //  int arr[] = {1, 2, 5, 3, 4, 6};
        Tree bst = new Tree();

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for(int i=0;i<n;i++){

            int a = sc.nextInt();
            bst.root = bst.addNode(bst.root,a);
        }
	       // bst.preOrder(bst.root);
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
	}

