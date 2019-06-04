package com.b.�ַ���;

/*
 * �������ñ˴˶����Ķ�����A��B��
 * ���дһ����Ч�㷨��
 * ���A���Ƿ����һ��������B�������˽ṹ��ȫ��ͬ��
 */
public class A���˽ṹ��ͬ���� {
	public static boolean chkIdentical(TreeNode A,TreeNode B){
		String father=treeToArr(A);
		String son=treeToArr(B);
		char[] fatherArr=father.toCharArray();
		char[] sonArr=son.toCharArray();
		boolean flag=false;
		for(int i=0;i<fatherArr.length;i++){
			if(fatherArr[i]==sonArr[0]){
				String fatherStr=father.substring(i, i+sonArr.length>fatherArr.length-1?fatherArr.length:i+sonArr.length);
				if(fatherStr.equals(son)){
					flag=true;
					break;
				}
			}
		}
		return flag;
	}

	private static String treeToArr(TreeNode a) {
		//�������ת��Ϊ�ַ���
		if (a==null)
			return null;
		String str=String.valueOf(a.val);
		str+=treeToArr(a.left);
		str+=treeToArr(a.right);
		return str;
	}
	
	public static void main(String[] args) {
		TreeNode a=new TreeNode(1);
		a.left=new TreeNode(2);
		
		TreeNode b=new TreeNode(2);
		
		System.out.println(chkIdentical(a, b));
	}

}

class TreeNode {
	int val = 0;
	TreeNode left = null;
	TreeNode right = null;

	public TreeNode(int val) {
		this.val = val;
	}
}