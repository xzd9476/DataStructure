package com.b.字符串;

public class G合法括号序列判断 {
	/*
	 * 判断是否左右括号都能配对
	 */
	public boolean chkParenthesis(String A, int n) {
		int num=0;
		for (int i = 0; i < n; i++) {
			if(A.charAt(i)=='(')
				num++;
			if(A.charAt(i)==')')
				num--;
			if(num<0)
				return false;
		}
		if(num!=0)
			return false;
		return true;
	}

}
