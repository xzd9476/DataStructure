package com.f.¶þ²æÊ÷;

import java.util.ArrayList;
import java.util.List;

public class AµÝ¹é¶þ²æÊ÷´òÓ¡ {
	/*
	 * µÝ¹é·½·¨±éÀú¶þ²æÊ÷
	 */
	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public static int[][] convert(TreeNode root) {
		ArrayList<Integer> preList=new ArrayList<Integer>();
		ArrayList<Integer> inList=new ArrayList<Integer>();
		ArrayList<Integer> postList=new ArrayList<Integer>();
		
		preOrder(root,preList);
		inOrder(root,inList);
		postOrder(root,postList);
		int[][] arr=new int[3][preList.size()];
		for(int j=0;j<preList.size();j++){
			arr[0][j]=preList.get(j);
			arr[1][j]=inList.get(j);
			arr[2][j]=postList.get(j);
		}
		return arr;
	}
	
	private static void preOrder(TreeNode root, ArrayList<Integer> preList) {
		if(root == null)
			return;
		preList.add(root.val);
		preOrder(root.left, preList);
		preOrder(root.right, preList);
	}

	private static void inOrder(TreeNode root, ArrayList<Integer> inList) {
		if(root == null)
			return ;
		inOrder(root.left, inList);
		inList.add(root.val);
		inOrder(root.right, inList);
	}

	private static void postOrder(TreeNode root, ArrayList<Integer> postList) {
		if(root == null)
			return ;
		postOrder(root.left, postList);
		postOrder(root.right, postList);
		postList.add(root.val);
	}


	public static void main(String[] args) {
		TreeNode node=new TreeNode(132);
		node.left=new TreeNode(11);
		node.right=new TreeNode(23);
		node.left.left=new TreeNode(343);
		node.left.right=new TreeNode(34);
		
		int[][] kk=convert(node);
		for (int[] is : kk) {
			System.out.println("--------------");
			for (int i : is) {
				System.out.println(i);
			}
		}
	}

}
