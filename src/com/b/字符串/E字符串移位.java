package com.b.�ַ���;

public class E�ַ�����λ {
	/*
	 * ����һ���ַ����������һ���㷨�����ַ����ĳ���Ϊlen��ǰ׺ƽ�Ƶ��ַ�������� Ҫ��ռ临�Ӷ�O(1)
	 * ��ΪҪ��ռ临�Ӷȣ����Բ���ƴ���ִ�
	 * �Ƚ�0~len-1���ִ������ڽ���������
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
