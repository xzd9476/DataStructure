package com.a.排序;

public class F堆排序 {
	/*
	 * 首先将数组建成一个大小为N的大根堆
	 * 把堆顶元素和堆的最后一个位置的元素进行交换，放在数组最后的位置，脱离出数组结构
	 * 接着将大小为N-1的堆调整为大根堆，同样将堆顶元素与最后一个元素进行交换，脱离出数组结构
	 * 继续这样调整大根堆，将堆顶元素与最后一个元素进行交换
	 * 每次调整都会使得堆的大小减一，当堆的大小减为1的时候，整个数组就有序了。
	 */
	public int[] heapSort(int[] A, int n) {
		return A;
	}
}
