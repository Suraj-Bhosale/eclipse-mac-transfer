package binary_Tree;

// package codechef; // don't place package name! /

import java.util.*;



import java.lang.*;
import java.io.*;

// package codechef; // don't place package name! /

public class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        /* Let us create following BST
        5
     /     \
    3      7
   /  \    /  \
  2   4   6     8
  
  
  			            10
					   /   \
					  7     15
					 / \   / \
					5   8 13   17
				   / \    / \
				  3  6  11   14
				  
		int[] arr = {10,7,5,3,6,8,15,13,11,14,17};		  
				  
  int[] arr = {50,30,20,40,70,60,80}; */

        Tree bst = new Tree();

       // Scanner sc = new Scanner(System.in);
        int[] arr = {5,3,2,4,7,6,8};
        int n = arr.length;

        for(int i=0;i<n;i++){

            int a = arr[i];
            bst.root = bst.addNode(bst.root,a);
        }
      //int ans = bst.levelOrder(bst.root);
      //  System.out.println(ans);
       // bst.topView(bst.root);
      bst.findGrandparents(bst.root);
   // System.out.println(ans);
   // ;
   //  System.out.println( bst.minValue(bst.root));
       // System.out.println(bst.height(bst.root));
//        bst.deleteNode(bst.root,81 );
//        System.out.println();
     // bst.preOrder(bst.root);
//       bst.insertIntoBST(bst.root,50);
      // bst.leftView(bst.root);
    }
}

	class Node{

	    int data;
	    Node left;
	    Node right;

	    Node(int data){

	        this.data = data;
	        this.left  = null;
	        this.right = null;
	    }
	}
	
	class Tree{
	    Node root;
	    static int sum = 0;
	    public int sumEvenGrandparent(Node root) {
	        if (root == null) {
	            return 0;
	        }
	        int sum = 0;
	        if (root.data % 2 == 0) {
	            if (root.left != null) {
	                if (root.left.left != null) sum += root.left.left.data;
	                if (root.left.right != null) sum += root.left.right.data;
	            }
	            if (root.right != null) {
	                if (root.right.left != null) sum += root.right.left.data;
	                if (root.right.right != null) sum += root.right.right.data;
	            }
	        }
	        return sum + sumEvenGrandparent(root.left) + sumEvenGrandparent(root.right);
	        }
	    
	    public int findGrandparents(Node root) {
	        if (root == null) {
	            return 0;
	        }
	        int sum = 0;
		      
	        sumEvenGrandparent(root.left);
	        sumEvenGrandparent(root.right);
	        
		            if (root.left != null) {
		                if (root.left.left != null) {
		                	sum += root.left.left.data;
		                }
		                if (root.left.right != null) {
		                	sum += root.left.right.data;
		                }
		            }
		            if (root.right != null) {
		                if (root.right.left != null) {
		                	sum += root.right.left.data;
		                }
		                if (root.right.right != null) {
		                	sum += root.right.right.data;
		                }
		            }
		    
	        return sum;
	        }
		
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
	    
	    boolean rootToLeafCheck(Node curr, int target) {
	    	if(curr == null) {
	    		return false;
	    	}
	    	
	    	boolean ans = false;
	    	
	    	int subSum = target - curr.data;
	    	
	    	if(subSum == 0 && curr.left == null && curr.right == null) {
	    		return true;
	    	}
	    	
	    	if(curr.left != null) {
	    		ans = ans || rootToLeafCheck(curr.left,subSum);
	    	}
	    	
	    	if(curr.right != null) {
	    		ans = ans || rootToLeafCheck(curr.right,subSum);
	    	}
	    	
	    	return ans;
	    }
	    
		int minValue(Node currNode) {
			if(currNode == null) {
				return -1;
			}
			
			int a = minValue(currNode.left);
			if(currNode.left == null) {
				return currNode.data;
			}
			
			return a;

		}
		
		void postOrder(Node curr) {
			
			if(curr == null) {
				return;
			}

			postOrder(curr.left);
			postOrder(curr.right);
			System.out.print(curr.data+" ");
			
		}
		
		void leaves(Node curr) {
			if(curr == null) {
				return;
			}

			leaves(curr.left);
			leaves(curr.right);
			
			if(curr.left == null && curr.right == null) {
				System.out.print(curr.data+" ");
			}
        }
		
		void printLeftNodes(Node curr) {
			if(curr == null) {
				return;
			}
			
			if(curr.left != null) {
				System.out.print(curr.data+" ");
				printLeftNodes(curr.left);
				
			}
			
			else if(curr.right != null) {
				System.out.print(curr.data+" ");
				printRightNodes(curr.right);
				
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
			
			else if(curr.left != null) {
				System.out.print(curr.data+" ");
				printRightNodes(curr.left);
				
			}
		}
		

		
		void printBoundaryValues(Node curr) {
			if(curr == null) {
				return;
			}
			
			System.out.print(curr.data+" ");
			printLeftNodes(curr.left);
			leaves(curr.left);
			leaves(curr.right);
			printRightNodes(curr.right);
			
		}
	  	int maxValue(Node currNode) {
			if(currNode == null) {
				return -1;
			}
			
			int a = maxValue(currNode.right);
			if(currNode.right == null) {
				return currNode.data;
			}
			
			return a;

		}
	
	    boolean isBalanced(Node curr) {
	    	if(curr == null) {
	    		return false;
	    	}
	    	
	    	
	    	 int leftHeight = height(curr.left);
	    	 int rightHeight = height(curr.right);

	    	 
	         if(Math.abs(leftHeight - rightHeight) > 1)
	             return false;
	    	 
	    	 return isBalanced(curr.left) && isBalanced(curr.right);
	    }
	    
	    
	   public static void levelOrder(Node root) {
	       if(root == null) {
	           return;
	       }

	       Queue<Node> q = new LinkedList<Node>();
	       q.add(root);
	       q.add(null);
	       while(!q.isEmpty()) {
	    	   Node currNode = q.remove();
	    	   if(currNode == null) {
	    		   System.out.println();
	    		   if(q.isEmpty()) {
	    			   return;
	    		   }
	    		   else {
	    			   q.add(null);
	    		   }
	    	   }
	    	   
	    	   else {
	    		   System.out.print(currNode.data+ " ");
	    		   if(currNode.left != null) {
	    			   q.add(currNode.left);
	    		   }
	    		   if(currNode.right != null) {
	    			   q.add(currNode.right);
	    		   }
	    	   }
	       }
	   }
	   
	    public Node insertIntoBST(Node root, int val) {
	        if(root == null) return new Node(val);
	        Node cur = root;
	        while(true) {
	            if(cur.data <= val) {
	                if(cur.right != null) cur = cur.right;
	                else {
	                    cur.right = new Node(val);
	                    break;
	                }
	            } else {
	                if(cur.left != null) cur = cur.left;
	                else {
	                    cur.left = new Node(val);
	                    break;
	                }
	            }
	        }
	        return root;
	    }
	    
	    static ArrayList<Integer> topView(Node root)
	    {
	        ArrayList<Integer> ans = new ArrayList<>(); 
	        if(root == null) return ans;
	        Map<Integer, Integer> map = new TreeMap<>();
	        Queue<Pair> q = new LinkedList<Pair>();
	        q.add(new Pair(root, 0)); 
	        while(!q.isEmpty()) {
	            Pair it = q.remove();
	            int hd = it.hd; 
	            Node temp = it.node; 
	            if(map.get(hd) == null) map.put(hd, temp.data); 
	            if(temp.left != null) {
	                
	                q.add(new Pair(temp.left, hd - 1)); 
	            }
	            if(temp.right != null) {
	                
	                q.add(new Pair(temp.right, hd + 1)); 
	            }
	        }
	    
	        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
	            ans.add(entry.getValue()); 
	        }
	        return ans; 
	    }
	    
	    
	   public static void rightView(Node root) {
		   if(root == null) {
	           return;
	       }

	       Queue<Node> q = new LinkedList<Node>();
	       q.add(root);
	      
	       while(!q.isEmpty()) {
	    	   int n = q.size();
	    	   
	    	   for(int i = 1; i <= n; i++) {
	    		   Node temp = q.peek();
	    		   q.remove();
	    		   
	    		   if(i == n) {
	    			   System.out.println(temp.data+" ");
	    		   }
	    		   
	    		   if(temp.left != null) {
	    			   q.add(temp.left);
	    		   }
	    		   
	    		   if(temp.right != null) {
	    			   q.add(temp.right);
	    		   }
	    	   }

	       }
	    
	   }
	   
	   public static void leftView(Node root) {
	       if(root == null) {
	           return;
	       }

	       Queue<Node> q = new LinkedList<Node>();
	       q.add(root);
	      
	       while(!q.isEmpty()) {
	    	   int n = q.size();
	    	   
	    	   for(int i = 1; i <= n; i++) {
	    		   Node temp = q.peek();
	    		   q.remove();
	    		   
	    		   if(i == 1) {
	    			   System.out.println(temp.data+" ");
	    		   }
	    		   
	    		   if(temp.left != null) {
	    			   q.add(temp.left);
	    		   }
	    		   
	    		   if(temp.right != null) {
	    			   q.add(temp.right);
	    		   }
	    	   }

	       }
	    
	   }
	   
        public Node searchNode(Node root, int key) {
              if(root == null){
                  return null;
              }

            if(root.data == key){
                return root;
            }
          
            if(root.data < key){
                return searchNode(root.right,key);
            }
        
            else {
            return searchNode(root.left,key);
            }
        }

	   
		public Node deleteNode(Node root, int key) {
	        if(root == null){
	            return null;
	        }
	       if(root.data > key){
	           root.left = deleteNode( root.left , key ) ;
	           return root ;
	       }
	       else if(root.data < key){
	           root.right = deleteNode( root.right , key ) ;
	           return root ;
	       }
	       else{ 
	           if(root.left == null && root.right == null ){
	               return null ;
	           }else if(root.right == null){
	               return root.left ;
	           }else if(root.left == null){
	               return root.right ;
	           }else{
	               root.data = max(root.left) ;
	               root.left = deleteNode(root.left,root.data) ;
	               return root ;
	           }
	           
	       }
	   }
		
			
    	Node lca(Node root, int n1,int n2)
    	{
    	    if(root == null || root.data == n1 || root.data == n2){
    	        return root;
    	    }	
    	    
    	    Node left = lca(root.left, n1,n2);
    	    Node right = lca(root.right, n1,n2);
    	    
    	    if(left == null){
    	        return right;
    	    }
    	    
    	   else if(right == null){
    	        return left;
    	    }
    	    else {
    	        return root;
    	    }
    	}
    	
		 static int idx = 0;
		 public Node buildTree(int[] preOrderArray, int[] inOrderArray, int start, int end) {
		
				if(start > end) {
					return null;
				}
			int curr = preOrderArray[idx];
			idx++;
			
			Node newNode = new Node(curr);
			if(start == end) {
				return newNode;
			}
			
			int idxIO = search(inOrderArray,start,end,curr);
			
			newNode.left = buildTree(preOrderArray,inOrderArray,start,idxIO-1);
			newNode.right = buildTree(preOrderArray,inOrderArray,idxIO+1,end);
			return newNode;
			
		}
	
	  public Node bstFromPreorder(int[] A, int bound, int[] i) {
	        if (i[0] == A.length || A[i[0]] > bound) return null;
	        Node root = new Node(A[i[0]++]);
	        root.left = bstFromPreorder(A, root.data, i);
	        root.right = bstFromPreorder(A, bound, i);
	        return root;
	    }
		    
	  private int search(int[] inOrderArray, int start, int end, int curr) {
			
			for(int i = start; i <= end; i++) {
				if(inOrderArray[i] == curr) {
					return i;
				}
			}
			return -1;
		}
			
	   public static int max(Node currNode) {
		   
		   while(currNode.right != null) {
			   currNode = currNode.right;
		   }
		   
		   return currNode.data;
	   }
	   
	   public static int height(Node root) {
   
	   }
	   
	   public static int countOfNodes(Node root) {
	       if(root == null) {
	           return 0;
	       }
	 
	       int leftNodes = countOfNodes(root.left);
	       int rightNodes = countOfNodes(root.right);
	       return leftNodes + rightNodes + 1;
	   }
	   
	   public static int sumOfNodes(Node root) {
	       if(root == null) {
	           return 0;
	       }
	 
	       int leftSum = sumOfNodes(root.left);
	       int rightSum = sumOfNodes(root.right);
	       return leftSum + rightSum + root.data;
	   }
	   
	   public static int diameter(Node root) {
		       if(root == null) {
		           return 0;
		       }
		 
		       int diam1 = height(root.left) + height(root.right) + 1;
		       int diam2 = diameter(root.left);
		       int diam3 = diameter(root.right);
		 
		       return Math.max(diam1, Math.max(diam2, diam3));
		   }
		   
		 boolean isBst(Node root, Node max, Node min) {
				 if(root == null) {
					 return true;
				 }
				 
				 if(max != null && max.data <= root.data) {
					 return false;
				 }
				 
				 if(min != null && min.data >= root.data) {
					 return false;
				 }
				 
				 boolean leftNode = isBst(root.left, root, min);
				 boolean rightNode = isBst(root.right, max, root);
				 return leftNode && rightNode;
			 }
	
		  void mirrorTree(Node curr) {
					if(curr == null) {
						return;
					}
					
					mirrorTree(curr.left);
					mirrorTree(curr.right);
					
					Node temp = curr.left;
					curr.left = curr.right;
					curr.right = temp;
				}
		  

	}

