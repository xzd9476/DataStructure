package com.b.字符串;

public class C两串旋转 {
	/*
	 * 对于两个字符串A和B，请判断A和B是否互为旋转词
	 * 旋转次：对于一个字符串A，将A的前面任意一部分挪到后边去形成的字符串称为A的旋转词
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
