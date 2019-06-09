package com.b.字符串;

public class E字符串移位 {
	/*
	 * 对于一个字符串，请设计一个算法，将字符串的长度为len的前缀平移到字符串的最后 要求空间复杂度O(1)
	 * 因为要求空间复杂度，所以不能拼接字串
	 * 先将0~len-1的字串逆序，在将整体逆序
	 */
	public  String stringTranslation(String A, int n, int len) {
		if (n <= 0 || A == null || len > n)
			return null;
		char[] arr = A.toCharArray();
		reserve(arr, 0, len - 1);
		reserve(arr, len, n - 1);
		reserve(arr, 0, n - 1);
		return String.valueOf(arr);
	}

	private  void reserve(char[] arr, int start, int end) {
		if (start >= end)
			return;
		int n=end;
		for (int i = start; i <= (end+start)/2; i++) {
			char temp=arr[i];
			arr[i]=arr[n];
			arr[n--]=temp;
		}
	}
	

}
