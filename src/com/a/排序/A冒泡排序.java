package com.a.排序;

public class A冒泡排序 {
	/*
	 * 时间复杂度是O（n²）
	 * 第一次比较区间是0-n-1,将第0个数和第一个数进行比较，哪个大哪个放后面，然后第一位数和第二个数进行比较，哪个大那个放后面，第一躺下来，最大的数就放到了最后面
	 * 第二次比较是0~n-2区间，比较下来，第二大的数就放到了倒数第二个位置
	 * 直到比较区间只剩下一个的时候，整个数组就有序了。
	 */
	public int[] bubbleSort(int[] A, int n) {
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n-i-1; j++) {
				if(A[j]>A[j+1]){
					int num=A[j];
					A[j]=A[j+1];
					A[j+1]=num;
				}
			}
		}
		return A;
    }
}
