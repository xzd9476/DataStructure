package com.c.����;

import com.c.����.�����������.ListNode;

public class ��������ĳ������ɾ�� {
	/*
	 * ɾ����������ĳ����㣬����ֻ������ǰ��㣬������ͷ���
	 */
	public static class ListNode{
		int val;
		ListNode next=null;
		ListNode(int val){
			this.val=val;
		}
	}
	
	//������ɾ����ͷ�ڵ��Ҫɾ�������֣���ִ��ɾ������������ɾ�����ͷ��㡣������û���ظ�����
	public ListNode removeNode(ListNode pNode, int delVal) {
		if(pNode == null)
			return null;
		if(pNode.val==delVal)
			return pNode.next;
		
		ListNode preNode=pNode;
		ListNode nxtNode=preNode.next;
		
		while(nxtNode.val!=delVal){
			preNode=nxtNode;
			nxtNode=nxtNode.next;
		}
		
		if(nxtNode!=null){
			preNode.next=nxtNode.next;
		}
		return pNode;
    }

}
