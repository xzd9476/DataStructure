package com.b.�ַ���;

public class C������ת {
	/*
	 * ���������ַ���A��B�����ж�A��B�Ƿ�Ϊ��ת��
	 * ��ת�Σ�����һ���ַ���A����A��ǰ������һ����Ų�����ȥ�γɵ��ַ�����ΪA����ת��
	 */
	public static boolean chkRotation(String A, int lena, String B, int lenb) {
		if(A==null || B==null || lena<=0 || lenb<=0)
			return false;
		String A2=A+A;
		char[] A2arr=A2.toCharArray();
		char[] Barr=B.toCharArray();
		for (int i = 0; i < A2.length(); i++) {
			if(A2arr[i]==Barr[0]){
				System.out.println(i+lenb);
				String temp=A2.substring(i, i+lenb>A2arr.length?A2arr.length:i+lenb);
				if(temp.equals(B))
					return true;
			}
		}
		return false;
		
    }
	
	public static void main(String[] args) {
		System.out.println(chkRotation("12345", 5, "51238", 5));
	}

}
