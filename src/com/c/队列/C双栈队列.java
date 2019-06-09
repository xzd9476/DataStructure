package com.c.����;

import java.util.Stack;

public class C˫ջ���� {
	/*
	 * ������ջʵ�ֶ��У�֧�ֶ��е�push��pop
	 */
	public static int[] twoStack(int[] ope, int n) {
		Stack<Integer> push=new Stack<Integer>();
		Stack<Integer> pop=new Stack<Integer>();
		int num=0;
		for(int i=0;i<n;i++){
			if(ope[i]>0){
				push.push(ope[i]);
			}
			if(ope[i]==0){
				num++;
			}
		}
		
		while(!push.isEmpty()){
			pop.push(push.pop());
		}
		
		int[] arr=new int[num];
		for(int i=0;i<num;i++){
			arr[i]=pop.pop();
		}
		return arr;
		
	}
	
	public static void main(String[] args) {
		int[] arr={1,0,3,0,5};
		System.out.println(twoStack(arr, 5));
		
	}

}
