package com.g.λ����;

public class B�Ƚ���ϰ�� {
	/*
	 * ��������32λ����a��b�������һ���㷨����a��b�нϴ�ġ����ǲ������καȽ��жϡ���������ͬ����������һ����
	 */
	public int getMax(int a, int b) {
		int c=a-b;
		c=(c>>31)&1;//��a>b,c=1;��b>a;c=0;
		c=c^1;//1->0  0->1;
		int d=c^1;
		return a*c+d*b;
	}

}
