package com.f.������;

import java.util.ArrayList;
import java.util.Stack;

import com.f.������.C�㼶����������.TreeNode;

public class GѰ�Ҵ����� {
	/*
	 * һ��������������������������������ֻ��������������λ�ã�ʹ�ò��������������������ҳ����������㲢�Ż����ǵ�ֵ
	 * ����һ�����ĸ���㣬�뷵������������λ�õ�ֵ������С��ֵ��ǰ��
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
		//�õ������������
		int[] arr=new int[list.size()];
		int k=0;
		for (Integer i : list) {
			arr[k++]=i;
		}
		
		int[] res=new int[2];
		boolean flag=true;//��ʾ��һ��
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				if(flag){//��һ��
					res[1]=arr[i];
					res[0]=arr[i+1];
					flag=false;
				}else{//�ڶ���
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
