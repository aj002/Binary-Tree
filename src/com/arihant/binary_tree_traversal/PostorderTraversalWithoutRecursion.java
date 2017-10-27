package com.arihant.binary_tree_traversal;

import java.util.Stack;

public class PostorderTraversalWithoutRecursion
{
	public static void traverse(node rt)
	{
		Stack<node> s = new Stack<>();
		if(rt==null)
		{
			return;
		}
		s.push(rt);
		while(!s.isEmpty())
		{
			node t = s.peek();
			if(t.l == null && t.r == null)
			{
				System.out.println(s.pop());
			}
			else
			{
				
			}
		}
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		node rt 	= new node();
		rt 			= node.newnode(1);
		rt.l 		= node.newnode(2);
		rt.r 		= node.newnode(3);
		rt.l.l 		= node.newnode(4);
		rt.l.l.l 	= node.newnode(5);
		
		/* Tree is 
		 		1
		 	  2   3
		 	4
		  5  
		 */
		
		System.out.println("Postorder ");
		traverse(rt);

	}

}
