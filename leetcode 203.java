/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode newHead = new ListNode(-1);
        ListNode it = newHead;
        newHead.next = head;
        while(it!=null){
            if(it.next==null) break;
            if(it.next.val==val){
                it.next=it.next.next;
            }
            else{
                it=it.next;
            }
        }
        return newHead.next;
    }
}