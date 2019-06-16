package com.f.二叉树;

public class E平衡二叉树的判断 {
	/*
	 * 平衡二叉树，左子树右子树的高度差不超过1 题目；给定二叉树的根节点root，判断是否为平衡二叉树
	 */

	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;
		public TreeNode(int val) {
			this.val = val;
		}
	}

	public boolean check(TreeNode root) {
		return ck(root)>=0;
	}
	
	public int ck(TreeNode root){
		if(root==null)
			return 0;
		int lh=ck(root.left);
		int rh=ck(root.right);
		if(Math.abs(lh-rh)>1)
			return -1;
		if(lh == -1 || rh ==-1)
			return -1;
		return Math.max(lh+1, rh+1);
	}

}
