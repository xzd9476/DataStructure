package com.b.�ַ���;

public class D���ӵ����� {
	/*
	 * ֻ���ַ����ĵ��ʼ������������Ҳ����˵���ַ�����һЩ�ո�ָ��Ĳ�����ɣ�����Ҫ����Щ��������
	 * "abc de f" -->"f ed cba" --> "f de abc"
	 * �Ƚ��ַ�����������������ٽ����������ڲ��������
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
