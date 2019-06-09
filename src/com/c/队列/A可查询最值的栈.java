package com.c.队列;

import java.util.Stack;

public class A可查询最值的栈 {
	/*
	 * 定义栈的数据结构，在该类型中实现一个能够得到栈最小元素的min函数
	 * 方案1：定义stack:stackMin，若入站元素>=stackMin栈顶元素则不压入stackMin；
	 * 方案2：定义stack:stackMin,若入站元素>=stackMin则重复压入栈顶元素
	 */
	private Stack<Integer> stackData=new Stack<Integer>();
	private Stack<Integer> stackMin=new Stack<Integer>();
	public void push(int node) {//压入
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

	public void pop() {//弹出
		stackData.pop();
		stackMin.pop();
	}

	public int top() {//栈顶元素
		return stackMin.peek();
	}

	public int min() {//最小值
		return stackMin.peek();
	}

}
