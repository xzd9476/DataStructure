package com.b.�ַ���;

public class F�ո��滻 {
	/*
	 * ���ַ��������е�' '�滻Ϊ'%20'
	 * ����������洢
	 */
	public String replaceSpace(String iniString, int length) {
        int num=0;
        for (int i = 0; i < length; i++) {
			if(iniString.charAt(i)==' ')
				num++;
		}
        
        char[] arr=new char[length+num*2];
        int j=0;
        for (int i = 0; i < length; i++) {
			if(iniString.charAt(i)==' '){
				arr[j++]='%';
				arr[j++]='2';
				arr[j++]='0';
			}else{
				arr[j++]=iniString.charAt(i);
			}
		}
        return String.valueOf(arr);
    }
}
