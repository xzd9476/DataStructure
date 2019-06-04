package com.a.排序;

public class B选择排序 {
	/*
	 * 时间复杂度为O（n²）
	 * 第一次比较区间为0~n-1，记录本次比较中最小值的位置，将最小值和第0位交换
	 * 第二次比较区间为1~n-1，记录本次比较，最小值的位置，将最小值和第1位进行交换
	 * 当比较区间只剩下一个数的时候，数组就是有序的了。
	 */
	public int[] selectionSort(int[] A, int n) {
        for(int i=0;i<n;i++){
        	int min=A[i];
        	int flag=i;
        	for (int j = i; j < n; j++) {
				if(min>A[j]){
					min=A[j];
					flag=j;
				}
			}
        	int num=A[i];
        	A[i]=A[flag];
        	A[flag]=num;
        }
        return A;
    }

}
