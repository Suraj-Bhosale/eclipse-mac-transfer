package binary_Tree;

import java.util.LinkedList;
import java.util.List;

public class Binary_Tree_Path {



//	     10
//	    /   \
	//   7     15
	//  / \   / \
	// 5   8 13   17
	/// \    / \
	//3  6  11   14
	//
	//int[] arr = {10,7,5,3,6,8,15,13,11,14,17};
	    
	    


		public static void main(String[] args) {
			Tree tree = new Tree();
			int[] arr = {10,7,5,3,6,8,15,13,11,14,17};
				

			for (int i = 0; i < arr.length; i++) {
				tree.root = tree.buildTree(tree.root, arr[i]);
			}
			
//			System.out.println(tree.rangeSumBST(tree.root,6,10));
	        tree.inorder(tree.root);

		}


	}




		class Node{
			int data;
			Node right;
			Node left;
			Node(int data){
				this.data = data;
				this.right = null;
				this.left = null;
			}
		}
		
		class Tree{
			Node root;
			Node buildTree(Node root, int key) {
				if(root == null) {
					Node newNode = new Node(key);
					return newNode;
				}
				
				Node currNode = root;
				if(currNode.data > key) {
					currNode.left = buildTree(currNode.left,key);
				}
				else {
					currNode.right = buildTree(currNode.right,key);
				}
				
				return currNode;
			}
			
			
			void preOrder(Node root) {
				if(root == null) {
					return;
				}
				
				System.out.print(root.data+" ");
				preOrder(root.left);
				preOrder(root.right);
			}
			
			static int sum = 0;
		    public int rangeSumBST(Node root, int low, int high) {
		        if(root == null) return sum;
		        
		        if(low<=root.data && high>=root.data) {
	                return root.data + rangeSumBST(root.left,low,high) + rangeSumBST(root.right,low,high);
		        }
		        
		        else if(root.data<low){
	                return  rangeSumBST(root.right,low,high);
		        }else{
		                return rangeSumBST(root.left,low,high);
		        }
		    }
		    
		    
			Node search(Node root, int target) {
				String ans = "";
				if(root == null) {
					return root;
				}
				
				if(root.data == target) {
					return root;
				}
				if(root.data > target) {
					return search(root.left,target);
				}
				else {
					return search(root.right,target);
				}
				
			}
			
			 int sumL = 0;
			  int leftLeafs(Node curr, boolean right) {
				 
					if(curr == null) {
						return 0;
					}
					
					leftLeafs(curr.left, false);
					leftLeafs(curr.right,true);
					
					if(curr.left != null && curr.right != null && right == true) {
					//	sumL += curr.data;
						System.out.print(curr.data);
					}
					
					return 0;
			  }
			  
			  boolean checkTarget(Node curr, int target) {
				 int targetTwo = target - curr.data;
				 boolean ans = false;
				 if(targetTwo == 0 && curr.left == null && curr.right == null) {
					 return true;
				 }
				 
				 if(curr.left != null) {
					 ans = ans || checkTarget(curr.left, targetTwo);
				 }
				 
				 if(curr.right != null) {
					 ans = ans || checkTarget(curr.right, targetTwo);
				 }
				  
				 return ans;
			  }
	
			    
			    public List<String> inorder(Node root){
			        if(root == null) return;
			   
			        
			        for (String path : inorder(root.left)) {
			             System.out.println(path);
			         }
			        
			     //   inorder(root.right);
			        
			  
			    }
			    
			    public List<String> binaryTreePaths(Node root) {
			        
			        List<String> paths = new LinkedList<>();

			        if(root == null) return paths;
			        
			        if(root.left == null && root.right == null){
			            paths.add(root.data+"");
			            return paths;
			        }

			         for (String path : binaryTreePaths(root.left)) {
			             paths.add(root.data + "->" + path);
			         }

			         for (String path : binaryTreePaths(root.right)) {
			             paths.add(root.data + "->" + path);
			         }

			         return paths;
			        
			    }
		
		}




