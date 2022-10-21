package root.weekly_challenges;

import java.util.ArrayList;

public class MyStack<E> {
	
	private class Node<E> {
		E data;
	}
	
	Node<E> top;
	int max = 0;	
	ArrayList<Node<E>> stack = new ArrayList<>();
	
	public MyStack(){}
	
	public MyStack(Node<E> n) {
		this.top = n;
		max = 1;
	}
    
    public void push(E value){
        Node<E> temp = new Node<>();
        temp.data = value;
        stack.add(temp);
        max++;
    }
    
    
    public E pop(){        
        Node<E> temp = stack.get(max - 1);
        stack.remove(max - 1);
        max--;
        return temp.data;
    }
    
    public int max(){
        return this.max;
    }	

}
