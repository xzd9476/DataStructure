package com.f.������;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

import com.f.������.B�ǵݹ��������ӡ.TreeNode;

public class C�㼶���������� {
	/*
	 * �������Ĳ㼶����
	 */
	public static class TreeNode {
		int val;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public static int[][] printTree(TreeNode root) {
		if(root == null)
			return null;
		ArrayList<ArrayList<TreeNode>> levelList=new ArrayList<ArrayList<TreeNode>>();
		ArrayList<TreeNode> level=new ArrayList<TreeNode>();
		TreeNode last=root;
		TreeNode theRight=null;
		Queue<TreeNode> queue=new LinkedList<C�㼶����������.TreeNode>();
		queue.add(root);
		while(queue.size()!=0){
			TreeNode node=queue.poll();
			level.add(node);
			if(node.left!=null){
				queue.add(node.left);
				theRight=node.left;
			}
			if(node.right!=null){
				queue.add(node.right);
				theRight=node.right;
			}
			if(last== node){
				last=theRight;
				levelList.add(level);
				level=new ArrayList<C�㼶����������.TreeNode>();
			}
		}
		
		int[][] arr=new int[levelList.size()][];
		int i=0;
		for (ArrayList<TreeNode> list1 : levelList) {
			arr[i]=new int[list1.size()];
			int j=0;
			for(TreeNode node:list1){
				arr[i][j++]=node.val;
			}
			i++;
		}
		return arr;
	}

	public static void main(String[] args) {
		TreeNode node = new TreeNode(132);
		node.left = new TreeNode(11);
		node.right = new TreeNode(23);
		node.left.left = new TreeNode(343);
		node.left.right = new TreeNode(34);
		int[][] arr = printTree(node);
		for (int[] is : arr) {
			for (int i : is) {
				System.out.println(i);
			}
		}
	}

}
