package binary_Tree;

import java.util.*;
import java.lang.*;
import java.io.*;

 public  class InOrder{
	  
		public static void main (String[] args) throws java.lang.Exception
		{
			BinaryStructure tree = new BinaryStructure();
            Scanner sc = new Scanner(System.in);
 
           int n = sc.nextInt();
            int[] nodes = new int[n];
			int[] arr = new int[n];
          for(int i = 0; i < nodes.length; i++) {
            
             int a=  sc.nextInt();
             nodes[i] = a;
         	tree.root = tree.addNode(tree.root, a);
          }
          
          tree.inOrder(tree.root);

          System.out.print(qu);
		}
  }
 static Queue <Integer> qu = new LinkedList<Integer>();
    class Nodee{
    	int data;
    	Node left;
    	Node right;
    	
    	Nodee(int data){
    		this.data = data;
    		this.left = null;
    		this.right = null;
    		
    	}
    }
    
     class BinaryStructure{
    	Node root;
        Node addNode(Nodee currNode, int key) {
    	  if(currNode == null) {
    		  Node newNode = new Node(key);
    		  return newNode;
    	  }
    	  
    	  if(currNode.data < key) {
    		  currNode.right = addNode(currNode.right, key);
    		  
    	  }
    	  else {
    		  currNode.left = addNode(currNode.left, key);
    	  }
          qu.add(currNode);
    	  return currNode;
       }
        
         void inOrder(Node currNode) {
        	if(currNode==null) {
        		return;
        	}
        	
       
        	inOrder(currNode.left);
            qu.add(currNode.data);
            System.out.print(currNode.data+" ");
        	inOrder(currNode.right);
        	
        }
      
    }
	   

