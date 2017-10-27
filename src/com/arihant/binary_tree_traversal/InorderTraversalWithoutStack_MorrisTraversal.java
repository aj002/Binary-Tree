package com.arihant.binary_tree_traversal;

public class InorderTraversalWithoutStack_MorrisTraversal
{
	public static void traverse(node rt)
	{
		node current = rt;
		while(current != null)
		{
			if(current.l == null)
			{
				System.out.print(current.data + " ");
				current = current.r;
			}
			else
			{
				node inpred = current.l;
				while(inpred.r != null && inpred.r != current)
				{
					inpred = inpred.r;
				}
				if(inpred.r == current)
				{
					System.out.print(current.data + " ");
					inpred.r = null;
					current = current.r;
				}
				else
				{
					inpred.r = current;
					current = current.l;
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
		
		System.out.println("Inorder Traversal using Morris traversal technique ");
		traverse(rt);

	}

}
