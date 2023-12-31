class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;

        ListNode dummy = new ListNode();
        ListNode p = dummy;

        Queue<ListNode> pQ = new PriorityQueue<>(lists.length, (a, b) -> a.val - b.val);
        for (ListNode head : lists) {
            if (head != null) {
                pQ.offer(head);
            }
        }

        while(!pQ.isEmpty()) {
            ListNode node = pQ.poll();
            p.next = node;
            if (node.next != null) {
                pQ.add(node.next);
            }
            p = p.next;
        }

        return dummy.next;
    }
}