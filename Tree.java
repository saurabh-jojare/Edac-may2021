package Stack;
import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
	int key;
	Node left,right;
	Node(int k)
	{
		key=k;
		left=right=null;
	}

}

public class Tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //   Tree t =new Tree();
		Node root = new Node(10);
		root.left= new Node(15);
		root.right= new Node(5);
		int x=20;
		root= insert(root,x);
		inorder(root);
		
	}		
		 static Node insert(Node root, int x)
		{
			Node temp=new Node(x);
			Node parent =null,curr=root;
			while(curr !=null)
			{
				parent=curr;
				if(curr.key>x)
					curr=curr.right;
				else if(curr.key<x)
					curr =curr.right;
				else
					return root;	
			}
			
			if(parent==null)
				return temp;
			if(parent.key>x)
				parent.left=temp;
			else
				parent.right=temp;
			return root;		
		}
		 
		public static void inorder(Node root)
		{
			if(root !=null)
			{
				inorder(root.left);
				System.out.println(root.key+" ");
				inorder(root.right);
			}
		}
		
		
}
	

