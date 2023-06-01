package org.example;

public class Easy21 {
  public static void main(String[] args) {
    ListNode l1_1 = new ListNode(4);
    ListNode l1_2 = new ListNode(2, l1_1);
    ListNode l1 = new ListNode(1, l1_2);

    ListNode l2_1 = new ListNode(4);
    ListNode l2_2 = new ListNode(3, l2_1);
    ListNode l2 = new ListNode(1, l2_2);

    ListNode listNode = mergeTwoLists(l1, l2);
    System.out.println(listNode);
  }

  public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode dummy = new ListNode(0);
    ListNode currentNode = dummy;

    System.out.println(l1);
    System.out.println(l2);

    while(l1 !=null && l2 != null) {
     if(l1.val < l2.val) {
       currentNode.next = l1;
       l1 = l1.next;
     } else {
       currentNode.next =l2;
       l2 = l2.next;
     }
     currentNode = currentNode.next;
    }
    return dummy.next;
  }
}
