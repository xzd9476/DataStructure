package com.b.×Ö·û´®;

public class B´ÊÓï±äĞÎ {
	public boolean chkTransform(String A, int lena, String B, int lenb) {
		if(A == null || B==null || lena==0 || lena ==0)
			return false;
		int[] map=new int[256];
		char[] arrA=A.toCharArray();
		char[] arrB=B.toCharArray();
		for(int i=0;i<lena;i++){
			map[arrA[i]]++;
		}
		for(int i=0;i<lenb;i++){
			if(map[arrB[i]]-- ==0)
				return false;
		}
		return true;
	}
}
