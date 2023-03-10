package binary_Tree;

public class Delete_Node {
	public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null){
            return null;
        }
       if(root.val > key){
           root.left = deleteNode( root.left , key ) ;
           return root ;
       }
       else if(root.val < key){
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
               root.val = max(root.left) ;
               root.left = deleteNode(root.left,root.val) ;
               return root ;
           }
           
       }
   }
   public int max(TreeNode node){
       while(node.right != null){
           node = node.right ;
       }
       return node.val ;
   }
}
