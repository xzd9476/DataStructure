package com.a.排序;

public class G希尔排序 {
	/*
	 * 时间复杂度为O（nlgn）
	 * 是改良的插入排序
	 * 插入排序的步长为1，希尔排序选取选取一个合适的步长
	 * 排序时，例如步长为3，则前三位是不用调整的，第4位和第1个位置的进行比较，如果更小，则进行交换，
	 * 然后0 -步长判断已经小于零了则进行下一次比较，
	 * 下一次比较，第7位的数和第4个位置的数进行比较，如果更小则进行交换，
	 * 然后第4个数和第1个数进行比较。
	 * 这样，一次循环完后，步长减一，直到步长为1的时候，等于一次插入排序，整个数组有序了
	 */
	public int[] shellSort(int[] A, int n) {
		sort(A, n);
		return A;
	}

	private void sort(int[] A, int n) {
		//调整步长
		for (int i = n/2; i > 0; i--) {
			for(int j=i;j<n;j=j+i){
				for(int k=j;k >= i;k = k-i){
					if(A[k]<A[k-i]){
						swap(A,k,k-i);
					}
				}
			}
		}
	}

	private void swap(int[] A,int i, int j){
		int temp=A[j];
		A[j]=A[i];
		A[i]=temp;
	}
}
