package binary_Tree;

// package codechef; // don't place package name! /

import java.util.*;
import java.lang.*;
import java.io.*;

// package codechef; // don't place package name! /

public class SumOfLeftLeaves
{
    public static void main (String[] args) throws java.lang.Exception
    {
        /* Let us create following BST
        5
     /     \
    3      7
   /  \    /  \
  2   4   6     8
  /
  9                              * 
  int[] arr = {50,30,20,40,70,60,80}; */

    	SumOfLeftLeaves_Tree bst = new SumOfLeftLeaves_Tree();

       // Scanner sc = new Scanner(System.in);
        int[] arr = {5,3,2,4,7,6,8};
        int n = arr.length;

        for(int i=0;i<n;i++){

            int a = arr[i];
            bst.root = bst.addNode(bst.root,a);
        }

//       int ans = bst.sumAllLeftLeaves(bst.root,false);
//           System.out.println(ans);
           
          bst.postOrder(bst.root,false);
    }
}

//	class Node{
//
//	    int data;
//	    Node left;
//	    Node right;
//
//	    Node(int data){
//
//	        this.data = data;
//	        this.left  = null;
//	        this.right = null;
//	    }
//	}
	class SumOfLeftLeaves_Tree{
	    Node root;

		
	    void preOrder(Node currNode){

	        if(currNode==null){
	            return;
	        }
	        System.out.print(currNode.data+" ");
	        preOrder(currNode.left);
	        preOrder(currNode.right);
	    }

	    Node addNode(Node currNode,int key){

	        if(currNode==null){

	            Node newNode =  new Node(key);
	            return newNode;
	        }

	        if(currNode.data<key){

	            currNode.right = addNode(currNode.right,key);
	        }else
	            currNode.left = addNode(currNode.left,key);


	        return currNode;
	    }
	    
		void leaves(Node curr) {
			if(curr == null) {
				return;
			}

			leaves(curr.left);
		//	leaves(curr.right);
			
			if(curr.left == null && curr.right == null) {
				System.out.print(curr.data+" ");
			}
        }
		
		void postOrder(Node curr, boolean isLeft) {
			
			if(curr == null) {
				return;
			}

			postOrder(curr.left,false);
			postOrder(curr.right,true);
			
			if(curr.left == null && curr.right == null && isLeft) {
				System.out.print(curr.data+" ");
			}
			
			
			
			//System.out.print(curr.data+" ");
			
		}
		


		
		void printLeftNodes(Node curr) {
			if(curr == null) {
				return;
			}
			
			if(curr.left != null) {
				System.out.print(curr.data+" ");
				printLeftNodes(curr.left);
				
			}
			


		}
		
		void printRightNodes(Node curr) {
			if(curr == null) {
				return;
			}
			

			if(curr.right != null) {
				System.out.print(curr.data+" ");
				printRightNodes(curr.right);
			}
			

		}
		
		static int sum = 0;
		 static int sumAllLeftLeaves(Node node, boolean isLeft)
		  {
		    // base case:
		    if (node == null)
		      return 0;
		    // check whether this node is a leaf node and is left.
		    if (node.left == null && node.right == null && isLeft) {
		    	System.out.println("Nodes are: "+node.data);
		      return node.data;
		    }
		 
		    int leftTree = sumAllLeftLeaves(node.left, true);
		    int rightTree = sumAllLeftLeaves(node.right, false);
		    // recursive case
		    return leftTree+rightTree;
		      
		  }
		 
		 static int sumAllRightLeaves(Node node, boolean isRight)
		  {
		    // base case:
		    if (node == null)
		      return 0;
		    // check whether this node is a leaf node and is left.
		    if (node.left == null && node.right == null && isRight)
		      return node.data;
		 
		    // recursive case
		    return sumAllRightLeaves(node.left, false)
		      + sumAllRightLeaves(node.right, true);
		  }
		
		

	}

