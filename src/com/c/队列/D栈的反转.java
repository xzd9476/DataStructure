package com.c.����;

public class Dջ�ķ�ת {
	/*
	 * ʹ�õݹ鷴תһ�����飬Ҫ�󲻽����������ݽṹ
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
