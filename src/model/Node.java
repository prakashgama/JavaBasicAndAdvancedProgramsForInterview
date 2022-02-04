package model;
public class Node<T>
{
	
	
	public T key;
	public	Node<T> left;
	public	Node<T> right;
	
	public Node(T item)
    {
		key = item;
        left = right = null;
    }
	
	
	
}