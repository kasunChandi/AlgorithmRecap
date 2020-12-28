  /*Step 1
   *  following is the tree after above statement 
  
              1 
            /   \ 
          null  null     */
  /*Step 2
   *  2 and 3 become left and right children of 1 
               1 
             /   \ 
            2      3 
          /    \    /  \ 
        null null null null  */
  

 /*Step 3
  *  4 becomes left child of 2 
                    1 
                /       \ 
               2          3 
             /   \       /  \ 
            4    null  null  null 
           /   \ 
          null null 
         */
class Node  //create class Node and his Constructors 
{ 
    int key; 
    Node left, right; 
  
    public Node(int item) 
    { 
        key = item; 
        left = right = null; 
    } 
} 

public class BinaryTreeAlgo {
   
    Node root; // Root of Binary Tree   
    BinaryTreeAlgo(int key)  // Constructors
    { 
        root = new Node(key); 
    } 
  
    BinaryTreeAlgo() 
    { 
        root = null; 
    } 
  
    public static void main(String[] args) 
    { 
    	BinaryTreeAlgo tree = new BinaryTreeAlgo(); 
  
     //step 1 create root node
        tree.root = new Node(1); 
  
    //step 2  
  
        tree.root.left = new Node(2); 
        tree.root.right = new Node(3); 
  
    //step 3
        tree.root.left.left = new Node(4); 
       
    } 
	
}
