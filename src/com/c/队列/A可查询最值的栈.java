package com.c.����;

import java.util.Stack;

public class A�ɲ�ѯ��ֵ��ջ {
	/*
	 * ����ջ�����ݽṹ���ڸ�������ʵ��һ���ܹ��õ�ջ��СԪ�ص�min����
	 * ����1������stack:stackMin������վԪ��>=stackMinջ��Ԫ����ѹ��stackMin��
	 * ����2������stack:stackMin,����վԪ��>=stackMin���ظ�ѹ��ջ��Ԫ��
	 */
	private Stack<Integer> stackData=new Stack<Integer>();
	private Stack<Integer> stackMin=new Stack<Integer>();
	public void push(int node) {//ѹ��
		stackData.push(node);
		if(stackMin.size()>0){
			int min=stackMin.peek();
			if(min>=node){
				stackMin.push(node);
			}else{
				stackMin.push(min);
			}
		}else{
			stackMin.push(node);
		}
	}

	public void pop() {//����
		stackData.pop();
		stackMin.pop();
	}

	public int top() {//ջ��Ԫ��
		return stackMin.peek();
	}

	public int min() {//��Сֵ
		return stackMin.peek();
	}

}
