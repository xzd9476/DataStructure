package com.g.位运算;

public class C寻找奇数出现次数 {
	/*
	 * 有一个整型数组A，其中只有一个数出现了奇数次，其他的数都出现了偶数次，请打印这个数。
	 * 异或运算具有交换性
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
