/*
 * package Algo;
 * 
 * import java.util.LinkedList; import java.util.Queue;
 * 
 * import model.Node;
 * 
 * public class BinaryTree {
 * 
 * // Root of Binary Tree public static Node<T> root;
 * 
 * // Constructors BinaryTree(int key) { root = new Node(key); }
 * 
 * BinaryTree() { root = null; }
 * 
 * static void insert(Node<T> temp, T key) {
 * 
 * if (temp == null) { try { root = new Node(key); } catch (Exception e) { //
 * TODO Auto-generated catch block e.printStackTrace(); } return; } Queue<Node>
 * q = new LinkedList<Node>(); q.add(temp);
 * 
 * // Do level order traversal until we find // an empty place. while
 * (!q.isEmpty()) { temp = q.peek(); q.remove();
 * 
 * if (temp.left == null) { temp.left = new Node(key); break; } else
 * q.add(temp.left);
 * 
 * if (temp.right == null) { temp.right = new Node(key); break; } else
 * q.add(temp.right); } } public static void main(String[] args) { // TODO
 * Auto-generated method stub
 * 
 * 
 * BinaryTree tree = new BinaryTree();
 * 
 * create root tree.root = new Node<Integer>(1);
 * 
 * 
 * }
 * 
 * 
 * }
 * 
 * 
 * 
 * 
 */