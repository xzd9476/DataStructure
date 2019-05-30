package com.a.排序;

public class C插入排序 {
	/*
	 * 时间复杂度为O（n²）
	 * 第一次比较区间为0~1，如果第2个数比第1个数更小，则交换位置
	 * 第二次比较区间为0~2，如果第3个数比第2个数更小，则交换，再比较第2个数是否小于第一个数
	 * 直到比较区间为0~n-1的时候，整个区间有序了
	 */
	public int[] insertionSort(int[] A, int n) {
		for (int i = 1; i < n; i++) {
			int j=i;
			while(j >0 && A[j]<A[j-1]){
				int num=A[j];
				A[j]=A[j-1];
				A[j-1]=num;
				j--;
			}
		}
		return A;
    }
}
