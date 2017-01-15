/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode it = head;
        if(it==null) return head;
        int cur=it.val;
        while(it!=null&&it.next!=null){
            if(it.next.val==cur){
                it.next=it.next.next;
            }
            else{
              cur=it.next.val;
              it=it.next;
            } 
        }
        return head;
    }
}