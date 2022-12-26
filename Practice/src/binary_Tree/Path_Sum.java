package binary_Tree;

public class Path_Sum {

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

		 Path_Sum_Tree bst = new Path_Sum_Tree();

	       // Scanner sc = new Scanner(System.in);
	        int[] arr = {5,3,2,4,7,6,8};
	        int n = arr.length;

	        for(int i=0;i<n;i++){

	            int a = arr[i];
	            bst.root = bst.addNode(bst.root,a);
	        }

//	       int ans = bst.sumAllLeftLeaves(bst.root,false);
//	           System.out.println(ans);
	        
	          System.out.print(bst.PathFind(bst.root, 11)?"True": "False");
	    }
	}

//		class Node{
	//
//		    int data;
//		    Node left;
//		    Node right;
	//
//		    Node(int data){
	//
//		        this.data = data;
//		        this.left  = null;
//		        this.right = null;
//		    }
//		}
		class Path_Sum_Tree{
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

		    
		    boolean PathFind(Node curr, int target) {
		    	if(curr == null) {
		    		return false;
		    	}
		    	boolean ans = false;
		    	int subSum = target - curr.data;
              if(curr.left == null && curr.right == null && subSum == 0) {
            	  return true;
              }
              
              if(curr.left != null) {
            	  ans = ans || PathFind(curr.left,subSum);
              }
              
              if(curr.right != null) {
            	  ans = ans || PathFind(curr.right,subSum);
              }
			return ans;
		    	
		    }
		    
		    boolean hasPathSum(Node node, int sum)
		    { /* If the tree is empty there is no way the reqd sum will be there. */
		      if(root==null)
		      return false;
		      boolean ans = false;
		      int subSum = sum - node.data;
		      if(subSum == 0 && node.left == null && node.right == null)
		        return(ans = true);
		      if(node.left != null) 
		         
		        // ans || hasPathSum... has no utility if the ans is false
		        ans = ans || hasPathSum(node.left, subSum);       
		      
		      if(node.right != null)
		         
		        // But if it is true then we can avoid calling hasPathSum
		        // here as answer has already been found
		        ans = ans || hasPathSum(node.right, subSum);   
		      return(ans);
		    }
		    


}
