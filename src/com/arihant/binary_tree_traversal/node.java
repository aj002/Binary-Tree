package com.arihant.binary_tree_traversal;

public class node 
{
	int data;
	node l;
	node r;
	
	static public node newnode(int x)
	{
		node t = new node();
		t.data = x;
		/*
			t.l = null;
			t.r = null;
		*/
		return t;
	}

}
