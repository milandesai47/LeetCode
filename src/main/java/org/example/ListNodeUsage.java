package org.example;

import java.util.LinkedList;
import java.util.List;

public class ListNodeUsage {
  public static void main(String[] args) {
    ListNode l1_1 = new ListNode(4);
    ListNode l1_2 = new ListNode(2, l1_1);
    ListNode l1 = new ListNode(1, l1_2);

    ListNode l2_1 = new ListNode(4);
    ListNode l2_2 = new ListNode(3, l2_1);
    ListNode l2 = new ListNode(1, l2_2);
    System.out.println("L1 : " + l1);
    System.out.println("L2 : " + l2);

  }
}
