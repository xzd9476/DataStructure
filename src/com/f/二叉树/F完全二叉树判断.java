package com.f.������;

import java.util.LinkedList;
import java.util.Queue;

import com.f.������.C�㼶����������.TreeNode;

public class F��ȫ�������ж� {
	/*
	 * ��ȫ�����������һ������ ���� ���һ�㲻����ȱ�ٵĽ��ȫ���������ұ� ����һ��root���ж��Ƿ�����ȫ������ ʹ�ò㼶����
	 * ���ڵ����Һ���û�����ӷ���false 
	 * ����ǰ�ڵ㲻�����Һ��Ӷ��У�01 10 00�������α������浱ǰ��Ľڵ����ȫΪҶ�ӽڵ㣨û�к��ӣ������򷵻�false
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
		Queue<TreeNode> queue = new LinkedList<F��ȫ�������ж�.TreeNode>();
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
