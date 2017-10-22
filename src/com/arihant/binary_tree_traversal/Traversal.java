package com.arihant.binary_tree_traversal;

import java.util.LinkedList;
import java.util.Queue;

class node
{
	int data;
	node l;
	node r;
	
	static public node newnode(int x)
	{
		node t = new node();
		t.data = x;
		/*t.l = null;
		t.r = null;*/
		return t;
	}
	
	static public void inorder(node rt)
	{
		if(rt==null)
		{
			return;
		}
		inorder(rt.l);
		System.out.print(rt.data + " ");
		inorder(rt.r);
	}
	
	static public void levelorder(node rt)
	{
		Queue<node> q = new LinkedList<>();
		node t = null;
		q.add(rt);
		while(!q.isEmpty())
		{
			try{ t = q.remove(); }catch(Exception e) {}
			System.out.print(t.data + " ");
			if(t.l!=null)
			{
				q.add(t.l);
			}
			if(t.r!=null)
			{
				q.add(t.r);
			}
		}
	}
	
}


public class Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node rt = new node();
		rt = node.newnode(1);
		rt.l = node.newnode(2);
		rt.r = node.newnode(3);
		rt.l.l = node.newnode(4);
		rt.l.l.l = node.newnode(5);
		/* Tree is 
		 		1
		 	  2   3
		 	4
		  5  
		 */
		System.out.println("Inoder ");
		node.inorder(rt);
		
		System.out.println("\nLevelorder ");
		node.levelorder(rt);

	}

}
