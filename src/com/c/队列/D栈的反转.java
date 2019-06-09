package com.c.队列;

public class D栈的反转 {
	/*
	 * 使用递归反转一个数组，要求不借助其他数据结构
	 */
	public int[] reverseStack(int[] A, int n) {
        if(n<=0)
        	return null;
        int temp=A[n-1];
        reverseStack(A, n-1);
        A[A.length-n]=temp;
        return A;
    }

}
