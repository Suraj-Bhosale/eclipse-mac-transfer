package binary_Tree;

import java.util.Scanner;

public class BinaryTree_From_Pre_And_In {

	public static void main(String[] args) {
		Construct bst = new Construct();

//        Scanner sc = new Scanner(System.in);
//
//        int n = sc.nextInt();
//
//        for(int i=0;i<n;i++){
//
//            int a = sc.nextInt();
//            bst.root = bst.addNode(bst.root,a);
//        }
         int[] pre = {1,2,4,3,5};
         int[] in = {4,2,1,5,3};
         Node ans = bst.buildTree(pre,in,0,4);
         bst.preOrder(ans);
         
	}

}

//class Node{
//
//    int data;
//    Node left;
//    Node right;
//
//    Node(int data){
//
//        this.data = data;
//        this.left  = null;
//        this.right = null;
//    }
//}

 class Construct{
	 
	 

	    Node root;
	    void preOrder(Node currNode){

	        if(currNode==null){
	            return;
	        }
	        System.out.print(currNode.data+" ");
	        preOrder(currNode.left);
	        preOrder(currNode.right);
	    }
	    
	    static int idx = 0;
	    Node buildTree(int[] preOrder, int[] inOrder, int start, int end) {
	    	 if(start > end) {
	    		 return null;
	    	 }
	    	
	    	int curr = preOrder[idx];
	    	 idx++;
	    	 
	    	 
	    	 Node node = new Node(curr);
	    	 if(start == end) {
	    		 return node;
	    	 }
	    	 int pos = search(inOrder,start,end,curr);
	    	 
	    	 node.left = buildTree(preOrder, inOrder, start,pos-1);
	    	 node.right = buildTree(preOrder, inOrder, pos+1,end);
	
	    	return node;
	    }
	    
	    private int search(int[] inOrder, int start, int end, int preIdx) {
			
	    	for(int i = start; i <= end; i++) {
	    		if(inOrder[i] == preIdx) {
	    			return i;
	    		}
	    	}
			return -1;
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
 }
