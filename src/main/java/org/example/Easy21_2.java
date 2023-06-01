package org.example;

public class Easy21_2 {

    public static void main(String[] args) {
        ListNode l1_1 = new ListNode(4);
        ListNode l1_2 = new ListNode(2, l1_1);
        ListNode l1 = new ListNode(1, l1_2);

        ListNode l2_1 = new ListNode(4);
        ListNode l2_2 = new ListNode(3, l2_1);
        ListNode l2 = new ListNode(1, l2_2);

        System.out.println(mergeTwoLists(l1, l2));

    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1!=null && list2!=null){
            if(list1.val<list2.val){
                list1.next=mergeTwoLists(list1.next,list2);
                return list1;
            }
            else{
                list2.next=mergeTwoLists(list1,list2.next);
                return list2;
            }
        }
        if(list1==null)
            return list2;
        return list1;
    }
}
