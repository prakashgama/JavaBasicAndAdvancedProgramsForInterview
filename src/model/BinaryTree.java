//package model;
//
//
//public class BinaryTree<T> {
//
//	public Node<T> root; 
//	
//	public void insert(T key)  { 
//	        root = insert_Recursive(root, key); 
//	    } 
//	   
//	    //recursive insert function
//	public  Node<T> insert_Recursive(Node<T> root, T key) { 
//	          //tree is empty
//	        if (root == null) { 
//	            root = new Node<T>(key); 
//	            return root; 
//	        } 
//	        //traverse the tree
//	        if (<T>key < (T)root.key)     //insert in the left subtree
//	            root.left = insert_Recursive(root.left, key); 
//	        else if (key > root.key)    //insert in the right subtree
//	            root.right = insert_Recursive(root.right, key); 
//	          // return pointer
//	        return root; 
//	    } 
//	
//	
//}
