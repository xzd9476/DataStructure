package com.c.����;

public class ����ָ��ֵ��� {
	/*
	 * ����һ����������һ������val��Ҫ�����������е���val�Ľڵ�ɾ��
	 */
	
	public static class ListNode{
		int val;
		ListNode next=null;
		ListNode(int val){
			this.val=val;
		}
	}
	
	public ListNode clear(ListNode head, int val) {
        ListNode node=new ListNode(-1);
        ListNode nodeHead=node;
        while(head!=null){
        	if(head.val!=val){
        		node.next=head;
        		node=node.next;
        	}
        	head=head.next;
        }
        return nodeHead.next;
    }

}
