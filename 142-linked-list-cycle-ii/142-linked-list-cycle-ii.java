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
        boolean isCycle = false;
        if(head ==null){
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow==fast){
                isCycle = true;
                break;
            }
        }
        
        if(isCycle){
            ListNode newSlow = head;
            while(slow != newSlow){
                slow = slow.next;
                newSlow = newSlow.next;
            }
            return slow;
        }
        return null;
        
    }
}









