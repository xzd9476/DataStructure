package com.g.位运算;

public class B比较练习题 {
	/*
	 * 对于两个32位整数a和b，请设计一个算法返回a和b中较大的。但是不能用任何比较判断。若两数相同，返回任意一个。
	 */
	public int getMax(int a, int b) {
		int c=a-b;
		c=(c>>31)&1;//若a>b,c=1;若b>a;c=0;
		c=c^1;//1->0  0->1;
		int d=c^1;
		return a*c+d*b;
	}

}
