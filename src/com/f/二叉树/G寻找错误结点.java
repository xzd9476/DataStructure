package com.f.二叉树;

import java.util.ArrayList;
import java.util.Stack;

import com.f.二叉树.C层级遍历二叉树.TreeNode;

public class G寻找错误结点 {
	/*
	 * 一个二叉树本是搜索二叉树，但是其中只有两个结点调换了位置，使得不再是搜索二叉树，请找出这俩错误结点并放回他们的值
	 * 给定一棵树的根结点，请返回两个调换了位置的值，其中小的值在前。
	 */

	public static class TreeNode {
		int val;
		TreeNode left = null;
		TreeNode right = null;

		public TreeNode(int val) {
			this.val = val;
		}
	}

	public static int[] findError(TreeNode root) {
		Stack<TreeNode> stack=new Stack<TreeNode>();
		ArrayList<Integer> list=new ArrayList<Integer>();
		while(!stack.isEmpty() || root!=null){
			if(root!=null){
				stack.push(root);
				root=root.left;
			}else{
				TreeNode node=stack.pop();
				list.add(node.val);
				root=node.right;
			}
		}
		//得到中序遍历数组
		int[] arr=new int[list.size()];
		int k=0;
		for (Integer i : list) {
			arr[k++]=i;
		}
		
		int[] res=new int[2];
		boolean flag=true;//表示第一次
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				if(flag){//第一次
					res[1]=arr[i];
					res[0]=arr[i+1];
					flag=false;
				}else{//第二次
					res[0]=arr[i+1];
				}
			}
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		TreeNode node = new TreeNode(5);
		node.left = new TreeNode(3);
		node.right = new TreeNode(7);
		node.left.left = new TreeNode(4);
		node.left.right = new TreeNode(2);
		int[] arr=findError(node);
		for (int i : arr) {
			System.out.println(i);
		}
	}

}
