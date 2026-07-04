
class ListNode {

    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycle {
    public boolean FindCycle(ListNode head){
        ListNode A = head;
        ListNode B = head;

        if(head == null || head.next  == null){
            return false;
        }

        while(B != null && B.next != null){
            A = A.next;
            B = B.next.next;

            if(A == B){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        LinkedListCycle llc = new LinkedListCycle();
        
        // Sample input 1: Linked list with cycle
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(0);
        head1.next.next.next = new ListNode(-4);
        head1.next.next.next.next = head1.next; // Create cycle
        System.out.println("Cycle detected in list 1: " + llc.FindCycle(head1));
        
        // Sample input 2: Linked list without cycle
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        System.out.println("Cycle detected in list 2: " + llc.FindCycle(head2));
        
        // Sample input 3: Single node without cycle
        ListNode head3 = new ListNode(5);
        System.out.println("Cycle detected in list 3: " + llc.FindCycle(head3));
    }
}
