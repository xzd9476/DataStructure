package com.f.������;

public class Eƽ����������ж� {
	/*
	 * ƽ����������������������ĸ߶Ȳ����1 ��Ŀ�������������ĸ��ڵ�root���ж��Ƿ�Ϊƽ�������
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
