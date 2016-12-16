/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode latter=head;
        ListNode former=head;
        while(former!=null && former.next!=null){
            latter=latter.next;
            former=former.next.next;
            if(latter==former){
                ListNode l2=head;
                while(l2!=latter){
                    l2=l2.next;
                    latter=latter.next;
                }
                return l2;
            }
        }
        return null;
    }
}