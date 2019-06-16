package com.f.二叉树;

import java.util.Stack;

import com.f.二叉树.C层级遍历二叉树.TreeNode;

public class D序列化与反序列化二叉树 {
	/*
	 * 先序序列化二叉树 节点值后加上!，若为空节点则为#!
	 */
	public static class TreeNode {
		int val;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	// 非递归实现
	public static String toString(TreeNode root) {
		if (root == null)
			return null;
		StringBuilder sb = new StringBuilder("");
		Stack<TreeNode> stack = new Stack<D序列化与反序列化二叉树.TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node=stack.pop();
			if(node==null){
				sb.append("#!");
			}else{
				sb.append(String.valueOf(node.val)+"!");
				stack.push(node.right);
				stack.push(node.left);
			}
		}
		return sb.toString();
	}

	// 递归实现
	public static String toString2(TreeNode root) {
		StringBuilder sb = new StringBuilder("");
		toString(root, sb);
		return sb.toString();
	}

	private static void toString(TreeNode root, StringBuilder sb) {
		if (root == null) {
			sb.append("#!");
			return;
		}

		sb.append(String.valueOf(root.val) + "!");
		toString(root.left, sb);
		toString(root.right, sb);
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(132);
		node.left = new TreeNode(11);
		// node.right = new TreeNode(23);
		node.left.left = new TreeNode(343);
		node.left.right = new TreeNode(34);
		String str = toString(node);
		System.out.println(str);

		String str2 = toString2(node);
		System.out.println(str2);
	}
}
