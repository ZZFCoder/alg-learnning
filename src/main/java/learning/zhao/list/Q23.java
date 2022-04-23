package learning.zhao.list;

import java.util.PriorityQueue;

public class Q23 {
    static class Solution {
        public ListNode mergeKLists(ListNode[] lists) {
            ListNode ret = new ListNode();
            ListNode tmp = ret;
            Queue<ListNode> pq = new PriorityQueue<>((a, b) -> a.val - b.val);
            for (ListNode node : lists) {
                if(node != null) {
                    pq.add(node);
                }
            }

            while(!pq.isEmpty()) {
                ListNode node = pq.poll();
                tmp.next = node;
                tmp = tmp.next;
                if(node.next != null) {
                    pq.add(node.next);
                }
            }

            return ret.next;
        }
    }
}
