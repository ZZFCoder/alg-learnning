package learning.zhao.list;

public class Q21 {
    static class Solution {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode ret = new ListNode();
            ListNode tmp = ret;
            while(list1 != null && list2 != null) {
                if(list1.val <= list2.val) {
                    tmp.next = list1;
                    list1 = list1.next;
                }
                else {
                    tmp.next = list2;
                    list2 = list2.next;
                }
                tmp = tmp.next;
            }

            while(list1 != null) {
                tmp.next = list1;
                list1 = list1.next;
                tmp = tmp.next;
            }

            while(list2 != null) {
                tmp.next = list2;
                list2 = list2.next;
                tmp = tmp.next;
            }

            return ret.next;
        }
    }

    static class Solution2 {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            ListNode ret = new ListNode();
            ListNode tmp = ret;
            while(list1 != null && list2 != null) {
                if (list1.val < list2.val) {
                    tmp.next = list1;
                    list1 = list1.next;
                }
                else {
                    tmp.next = list2;
                    list2 = list2.next;
                }
                tmp = tmp.next;
            }

            if(list1 != null) {
                tmp.next = list1;
            }

            if(list2 != null) {
                tmp.next = list2;
            }

            return ret.next;
        }
    }
}
