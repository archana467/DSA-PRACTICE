/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    ListNode head;
    public Solution(ListNode head) {
        this.head=head;
    }
    
    public int getRandom() {
        ListNode temp=this.head;
        int count=0;
        int random=0;
        while(temp!=null){
            count++;
            if((int)(Math.random()*count )==0){
                random=temp.val;
            }
            temp=temp.next;
        }
    return random;
    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */