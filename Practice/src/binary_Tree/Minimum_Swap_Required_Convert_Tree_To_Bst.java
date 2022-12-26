package binary_Tree;

import java.util.Arrays;
import java.util.HashMap;

public class Minimum_Swap_Required_Convert_Tree_To_Bst {

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

		 Minimum_Swap_Tree bst = new Minimum_Swap_Tree();

	       // Scanner sc = new Scanner(System.in);
	        int[] arr = {5,3,2,4,7,6,8};
	        int n = arr.length;

	        for(int i=0;i<n;i++){

	            int a = arr[i];
	            bst.root = bst.addNode(bst.root,a);
	        }

	        bst.minSwaps(arr, n);
	        
	        for(int i=0;i<n;i++){
              
	        	System.out.print(arr[i]);
	   
	        }
	    }
	}


		class Minimum_Swap_Tree{
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

		    
		    public int minSwaps(int[] arr, int N)
		    {
		  
		        int ans = 0;
		        int[] temp = Arrays.copyOfRange(arr, 0, N);
		  
		        // Hashmap which stores the
		        // indexes of the input array
		        HashMap<Integer, Integer> h
		            = new HashMap<Integer, Integer>();
		  
		        Arrays.sort(temp);
		        for (int i = 0; i < N; i++) 
		        {
		            h.put(arr[i], i);
		        }
		        for (int i = 0; i < N; i++) 
		        {
		  
		            // This is checking whether
		            // the current element is
		            // at the right place or not
		            if (arr[i] != temp[i]) 
		            {
		                ans++;
		                int init = arr[i];
		  
		                // If not, swap this element
		                // with the index of the
		                // element which should come here
		                swap(arr, i, h.get(temp[i]));
		  
		                // Update the indexes in
		                // the hashmap accordingly
		                h.put(init, h.get(temp[i]));
		                h.put(temp[i], i);
		            }
		        }
		        return ans;
		    }
		    public void swap(int[] arr, int i, int j)
		    {
		        int temp = arr[i];
		        arr[i] = arr[j];
		        arr[j] = temp;
		    }
		   
		    

}
