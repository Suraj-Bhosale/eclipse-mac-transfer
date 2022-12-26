
package binary_Tree;

import java.util.*;
import java.lang.*;
import java.io.*;



 public class Modes {

	public static void main(String[] args)throws java.lang.Exception {
	    // int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
		   //  int arr[] = {1, 2, 5, 3, 4, 6};
        TreeMode bst = new TreeMode();

		int[] arr = {1, 2, 3};
		

		for (int i = 0; i < arr.length; i++) {
			bst.root = bst.addNode(bst.root, arr[i]);
		}
		
//		System.out.println(tree.rangeSumBST(tree.root,6,10));

	        for(int a :bst.findMode(bst.root)) {
	        	System.out.print(a+" ");
	        }

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
	
	
	class TreeMode{
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
		
	    int maxCount = 1;
	    public int[] findMode(Node root) {
	        Map<Integer, Integer> map = new HashMap<>();
	        findModeHere(root, map);
	        
	        int[] arr = new int[map.size()];
	        int idx = 0;
	        for(Integer rep: map.keySet()){
	            if(map.get(rep) == maxCount){
	                arr[idx++] = rep;
	            }
	        }
	        
	        return Arrays.copyOf(arr,idx);
	    }
	    
	    void findModeHere(Node root, Map<Integer, Integer> map){
	        if(root == null) return;
	        
	        if(map.containsKey(root.data)){
	            int count = map.get(root.data);
	            map.put(root.data, count + 1);
	            maxCount = Math.max(maxCount,count);
	        }
	        else{
	            map.put(root.data, 1);
	        }
	        findModeHere(root.left, map);
	        findModeHere(root.right, map);
	        
	        
	    }
	    
	   
	    
//	        void forTwo(Node root2, String ans2){
//	        if(ans2 == null) return;
//	        forTwo(root2.left, ans2);
//	        forTwo(root2.right, ans2);    
//	        
//	        if(root2.left == null && root2.right==null){
//	            ans2 += root2;
//	        }
//	    }
	}

