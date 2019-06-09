package com.b.字符串;

public class D句子的逆序 {
	/*
	 * 只在字符串的单词间做逆序调整，也就是说，字符串由一些空格分隔的部分组成，你需要将这些部分逆序。
	 * "abc de f" -->"f ed cba" --> "f de abc"
	 * 先将字符串整体逆序调整，再将单个单次内部逆序调整
	 */
	public static String reverseSentence(String A, int n) {
		if (n <= 0 || A == null)
			return null;
		char[] Aarr = A.toCharArray();
		reverse(Aarr, 0, n - 1);
		int start=0;
		int end=0;
		for(int i=0;i<n;i++){
			if(Aarr[i]==' ' || i==n-1){
				reverse(Aarr, start, end==n-1?n-1:end-1);
				start=i+1;
			}
			end++;
		}
		String str=String.valueOf(Aarr);
		return str;
	}

	private static void reverse(char[] aarr, int start, int end) {
		if (end > start) {
			int n=end;
			for (int k = start; k <= (end+start)/2; k++) {
				char temp=aarr[k];
				aarr[k]=aarr[n];
				aarr[n]=temp;
				n--;
			}
		}
	}
	
	public static void main(String[] args) {
		System.out.println(reverseSentence("12345 1234", 10));
	}

}
