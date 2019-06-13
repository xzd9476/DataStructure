package com.c.链表;

public class 环形链表插入 {
	/*
	 * 给定链表A，和对应的next指向的元素位置，同时给定要插入之val
	 * 例如[1,3,4,5,7],[1,2,3,4,0],2
	 * 返回[1,2,3,4,5,7]
	 */
	public static class ListNode{
		int val;
		ListNode next=null;
		
		ListNode(int val){
			this.val=val;
		}
	}
	
	public static ListNode insert(int[] A, int[] nxt, int val) {
       if(A.length == 0)
    	   return new ListNode(val);
       
       ListNode head=new ListNode(A[0]);
       ListNode tail=head;
       
       for(int i=0;i<nxt.length-1;i++){
    	   tail.next=new ListNode(A[nxt[i]]);
    	   tail=tail.next;
       }
       
       ListNode preNode=head;
       ListNode nxtNode=preNode.next;
       while(nxtNode!=null && val>nxtNode.val){
    	   preNode=nxtNode;
    	   nxtNode=nxtNode.next;
       }
       
       ListNode node=new ListNode(val);
       preNode.next=node;
       node.next=nxtNode;
       
       return head;
    }
	
	public static void main(String[] args) {
		//[1,3,4,5,7],[1,2,3,4,0],2
		int[] A={4,8,9};
		int[] B={1,2,0};
		ListNode node=insert(A, B, 4);
		for(int i=0;i<A.length+2;i++){
			System.out.println(node.val);
			node=node.next;
		}
	}

}
