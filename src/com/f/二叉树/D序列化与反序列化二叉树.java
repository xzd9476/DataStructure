package com.f.������;

import java.util.Stack;

import com.f.������.C�㼶����������.TreeNode;

public class D���л��뷴���л������� {
	/*
	 * �������л������� �ڵ�ֵ�����!����Ϊ�սڵ���Ϊ#!
	 */
	public static class TreeNode {
		int val;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	// �ǵݹ�ʵ��
	public static String toString(TreeNode root) {
		if (root == null)
			return null;
		StringBuilder sb = new StringBuilder("");
		Stack<TreeNode> stack = new Stack<D���л��뷴���л�������.TreeNode>();
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

	// �ݹ�ʵ��
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
