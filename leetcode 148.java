/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode sortList(ListNode head) {
        List<Integer> num = new ArrayList<Integer>();
        ListNode it=head;
        while(it!=null){
            num.add(it.val);
            it=it.next;
        }
        Collections.sort(num);
        it=head;
        int i=0;
        while(it!=null){
            it.val=num.get(i).intValue();
            it=it.next;
            ++i;
        }
        return head;
    }
}