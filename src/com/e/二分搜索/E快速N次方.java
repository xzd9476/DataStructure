package com.e.��������;

public class E����N�η� {
	/*
	 * �õ�����k��N�η��Ĺ�����ʵ��ʱ�临�Ӷ�ΪO(logN)�ķ�����
	 * ����k��n���뷵��k��n�η���Ϊ�˷�ֹ������뷵�ؽ��Mod1000000007��ֵ��
	 */
	public static int getPower(int k, int N) {
		if (N == 0)
			return 1;
		long temp = k;
		long res = 1;

		for(;N>0;N=N>>1){
			if((N&1)!=0)
				res*=temp;
			temp=(temp*temp)%1000000007;
			res=res%1000000007;
		}
		return (int) res;
	}

	public static void main(String[] args) {
		System.out.println(getPower(2, 1));
	}
}
