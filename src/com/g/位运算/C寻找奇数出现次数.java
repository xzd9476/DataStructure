package com.g.λ����;

public class CѰ���������ִ��� {
	/*
	 * ��һ����������A������ֻ��һ���������������Σ�����������������ż���Σ����ӡ�������
	 * ���������н�����
	 * 0^n=n
	 */
	public int findOdd(int[] A, int n) {
        int a=0;
        for (int i = 0; i < A.length; i++) {
			a=a^A[i];
		}
        return a;
    }

}
