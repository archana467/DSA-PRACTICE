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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
    ListNode beforeA=list1;
  
    for(int i=0;i<a-1;i++){
        beforeA=beforeA.next;

    }
    ListNode afterB=beforeA.next;
    for(int i=a;i<=b;i++){
        afterB=afterB.next;

    }
    ListNode temp=list2;
    while(temp!=null && temp.next!=null){
        temp=temp.next;
    }
    beforeA.next=list2;
    temp.next=afterB;
    return list1;
    }
}