package com.e.二分搜索;

public class E快速N次方 {
	/*
	 * 得到整数k的N次方的过程请实现时间复杂度为O(logN)的方法。
	 * 给定k和n，请返回k的n次方，为了防止溢出，请返回结果Mod1000000007的值。
	 */
	public static int getPower(int k, int N) {
		if (N == 0)
			return 1;
		long temp = k;
		long res = 1;

		for(;N>0;N=N>>1){
			if((N&1)!=0)
				res*=temp;
			temp=(temp*temp)%1000000007;
			res=res%1000000007;
		}
		return (int) res;
	}

	public static void main(String[] args) {
		System.out.println(getPower(2, 1));
	}
}
