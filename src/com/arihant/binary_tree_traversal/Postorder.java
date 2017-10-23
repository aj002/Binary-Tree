package com.arihant.binary_tree_traversal;

public class Postorder 
{
	public static void traverse(node rt)
	{
		if(rt==null)
		{
			return;
		}
		traverse(rt.l);
		traverse(rt.r);
		System.out.print(rt.data + " ");
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
