package com.c.队列;

import java.util.Stack;

public class B用栈遍历二叉树 {
	public static class TreeNode {
		private int val;
		private TreeNode left;
		private TreeNode right;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public static void preOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<B用栈遍历二叉树.TreeNode>();
		if (root != null) {
			stack.push(root);
		}
		System.out.println("前序遍历");
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			System.out.println(node.val);
			if (node.left != null)
				stack.push(node.right);
			if (node.right != null)
				stack.push(node.left);
		}
	}

	public static void inOrder(TreeNode root) {
		Stack<TreeNode> stack = new Stack<B用栈遍历二叉树.TreeNode>();
		System.out.println("中序遍历");
		while (root != null || !stack.isEmpty()) {
			while (root != null) {
				stack.push(root);
				root = root.left;
			}

			if (!stack.isEmpty()) {
				TreeNode node = stack.pop();
				System.out.println(node.val);
				root = node.right;
			}
		}
		
	}

	public static void postOrder(TreeNode root) {
		Stack<TreeNode> instack = new Stack<B用栈遍历二叉树.TreeNode>();
		Stack<TreeNode> outstack = new Stack<B用栈遍历二叉树.TreeNode>();
		while (root != null || !instack.isEmpty()) {
			if (root != null) {
				outstack.push(root);
				instack.push(root);
				root = root.right;
			} else {
				root = instack.pop();
				root = root.left;
			}
		}

		while (!outstack.isEmpty()) {
			TreeNode treenode = outstack.pop();
			System.out.println(treenode.val);
		}
	}

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);

		postOrder(root);
	}

}
