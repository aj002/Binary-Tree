package com.arihant.binary_tree_traversal;

public class Level_order_traversal_using_function {
	
	static public int height(node rt)
	{
		if(rt==null)
		{
			return -1;
		}
		int l = height(rt.l);
		int r = height(rt.r);
		return (1 + (l>r?l:r));
	}
	
	static public void printLevelorder(node rt)
	{
		for(int i=1;i<=height(rt)+1;i++)
		{
			printGivenLevel(rt,i);
		}
	}
	
	static public void printGivenLevel(node rt, int lvl)
	{
		if(rt == null)
		{
			return;
		}
		else if(lvl == 1)
		{
			System.out.print(rt.data + " ");
		}
		else
		{
			printGivenLevel(rt.l,lvl-1);
			printGivenLevel(rt.r,lvl-1);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		node rt = new node();
		rt = node.newnode(1);
		rt.l = node.newnode(2);
		rt.r = node.newnode(3);
		rt.l.l = node.newnode(4);
		rt.l.r = node.newnode(5);
		rt.r.r = node.newnode(6);
		/*
		 Tree is :
		 		1
		 	  2   3
		 	 4 5   6
		 */
		System.out.println("Height of the tree is " + height(rt));
		System.out.println("Level Order Traversal using function");
		printLevelorder(rt);

	}
}
