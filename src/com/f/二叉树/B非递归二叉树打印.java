package com.f.二叉树;

import java.util.ArrayList;
import java.util.Stack;

public class B非递归二叉树打印 {
	/*
	 * 非递归方法遍历二叉树
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
		ArrayList<Integer> preList = new ArrayList<Integer>();
		ArrayList<Integer> inList = new ArrayList<Integer>();
		ArrayList<Integer> postList = new ArrayList<Integer>();

		preOrder(root, preList);
		inOrder(root, inList);
		postOrder(root, postList);

		int[][] arr = new int[3][preList.size()];
		for (int i = 0; i < preList.size(); i++) {
			arr[0][i] = preList.get(i);
			arr[1][i] = inList.get(i);
			arr[2][i] = postList.get(i);
		}

		return arr;
	}

	private static void preOrder(TreeNode root, ArrayList<Integer> preList) {
		if (root == null)
			return;
		Stack<TreeNode> stack = new Stack<B非递归二叉树打印.TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			preList.add(node.val);
			if (node.right != null)
				stack.push(node.right);
			if (node.left != null)
				stack.push(node.left);
		}

	}

	private static void inOrder(TreeNode root, ArrayList<Integer> inList) {
		if (root == null)
			return;
		Stack<TreeNode> stack = new Stack<B非递归二叉树打印.TreeNode>();
		while (root != null || !stack.isEmpty()) {
			if (root != null) {
				stack.push(root);
				root = root.left;
			} else {
				TreeNode node = stack.pop();
				inList.add(node.val);
				root = node.right;
			}
		}
	}

	private static void postOrder(TreeNode root, ArrayList<Integer> postList) {
		if (root == null)
			return;
		Stack<TreeNode> stack1 = new Stack<B非递归二叉树打印.TreeNode>();
		Stack<TreeNode> stack2 = new Stack<B非递归二叉树打印.TreeNode>();
		stack1.push(root);
		while (!stack1.isEmpty()) {
			root = stack1.pop();
			stack2.push(root);
			if (root.left != null)
				stack1.push(root.left);
			if (root.right != null)
				stack1.push(root.right);
		}
		while(!stack2.isEmpty()){
			postList.add(((TreeNode)stack2.pop()).val);
		}

	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(132);
		node.left = new TreeNode(11);
		node.right = new TreeNode(23);
		node.left.left = new TreeNode(343);
		node.left.right = new TreeNode(34);
		int[][] arr = convert(node);
		for (int[] is : arr) {
			System.out.println("----");
			for (int i : is) {
				System.out.println(i);
			}
		}
	}

}
