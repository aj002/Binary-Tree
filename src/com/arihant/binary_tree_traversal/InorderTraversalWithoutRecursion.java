package com.arihant.binary_tree_traversal;

import java.util.Stack;

public class InorderTraversalWithoutRecursion
{
	public static void traverse(node rt)
	{
		Stack<node> s = new Stack<>();
		for(node i = rt ; i != null ; i = i.l)
		{
			s.push(i);
		}
		while(!s.isEmpty())
		{
			node t = s.pop();
			System.out.print(t.data + " ");
			if(t.r != null)
			{
				t = t.r;
				for(node i = t ; i != null ; i = i.l)
				{
					s.push(i);
				}
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
		
		System.out.println("Inorder ");
		traverse(rt);
	}
}
