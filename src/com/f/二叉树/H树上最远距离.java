package com.f.¶þ²æÊ÷;

public class HÊ÷ÉÏ×îÔ¶¾àÀë {
	public class TreeNode {
		int val = 0;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	private int longest=0;
	public int findLongest(TreeNode root) {
		int depth=findDist(root);
		return longest;
	}
	
	private int findDist(TreeNode root) {
		if(root == null)
			return 0;
		int left=findDist(root.left);
		int right=findDist(root.right);
		longest=Math.max((left+right)+1,longest);
		return Math.max(left, right)+1;
	}
	

}
