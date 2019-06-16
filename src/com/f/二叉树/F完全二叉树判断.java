package com.f.二叉树;

import java.util.LinkedList;
import java.util.Queue;

import com.f.二叉树.C层级遍历二叉树.TreeNode;

public class F完全二叉树判断 {
	/*
	 * 完全二叉树：最后一层满了 或者 最后一层不满，缺少的结点全部集中在右边 给定一个root，判断是否是完全二叉树 使用层级遍历
	 * 若节点有右孩子没有左孩子返回false 
	 * 若当前节点不是左右孩子都有（01 10 00），则层次遍历后面当前层的节点必须全为叶子节点（没有孩子），否则返回false
	 */
	public static class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public static boolean chk(TreeNode root) {
		if (root == null)
			return true;
		TreeNode last = root;
		TreeNode theRight = null;
		Queue<TreeNode> queue = new LinkedList<F完全二叉树判断.TreeNode>();
		queue.add(root);
		boolean flag=false;
		while (queue.size() != 0) {
			TreeNode node = queue.poll();
			if(node.left==null && node.right!=null)
				return false;
			if (node.left != null){
				if(flag)
					return false;
				queue.add(node.left);
				theRight=node.left;
			}
			if (node.right != null){
				if(flag)
					return false;
				queue.add(node.right);
				theRight=node.right;
			}
			if(node==last){
				last=theRight;
				flag=false;
			}
			if(node.right==null || node.left==null)
				flag=true;	
		}
		return true;
	}
	
	public static void main(String[] args) {
		TreeNode node = new TreeNode(132);
		node.left = new TreeNode(11);
		node.right = new TreeNode(23);
		node.left.left = new TreeNode(343);
		node.left.right = new TreeNode(34);
		node.left.left.left=new TreeNode(55);
		System.out.println(chk(node));
	}

}
