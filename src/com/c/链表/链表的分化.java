package com.c.����;

import com.c.����.��������ĳ������ɾ��.ListNode;

public class ����ķֻ� {
	/*
	 * ����һ�������ͷ��㣬��һ����ֵval���뷵��һ������ʹС�ڵ������Ľ����ǰ�����ڵ��������ں�
	 * ��������1,4,2,5�� 3
	 * ��1,2,3,4,5��
	 */
	
	public static class ListNode{
		int val;
		ListNode next=null;
		ListNode(int val){
			this.val=val;
		}
	}
	
	public static ListNode listDivide(ListNode head, int val) {
			ListNode big=new ListNode(-1);
			ListNode small=new ListNode(-1);
			ListNode equal=new ListNode(-1);
			
			ListNode bigList=big;
			ListNode equalList=equal;
			ListNode smallList=small;
			
			while(head!=null){
				ListNode temp=head;
				head=head.next;
				temp.next=null;
				if(temp.val<val){
					small.next=temp;
					small=small.next;
				}
				if(temp.val>val){
					big.next=temp;
					big=big.next;
				}
				if(temp.val==val){
					equal.next=temp;
					equal=equal.next;
				}
			}
			if(smallList.next == null){
				equal.next=bigList.next;
			}else{
				equal.next=smallList.next;
				small.next=bigList.next;
			}
			
			return equalList.next;
    }
	
	public static void main(String[] args) {
		ListNode node=new ListNode(360);
		node.next=new ListNode(220);
		node.next.next=new ListNode(2);
		node.next.next.next=new ListNode(2);
		ListNode ndo=listDivide(node, 2);
		while(ndo!=null){
			System.out.println(ndo.val);
			ndo=ndo.next;
		}
	}
}
