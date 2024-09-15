package LL;

public class RevGrp {
    public static Node revLLII(Node head,int l,int r)
    {
        if(head==null||head.next==null)
        {
            return head;
        }
        
                // Step 1: Skip the first 'l-1' nodes
                Node dummy = new Node(0); // Dummy node to simplify edge cases
                dummy.next = head;
                Node prevL = dummy; // prevL is the node before position 'l'
                for (int i = 1; i < l; i++) {
                    prevL = prevL.next;
                }
        
                // Step 2: Reverse from 'l' to 'r'
                Node curr = prevL.next; // Start reversing from this node
                Node prev = null;
                Node start = curr; // 'start' will be the new tail of the reversed section
                for (int i = l; i <= r; i++) {
                    Node next = curr.next;
                    curr.next = prev;
                    prev = curr;
                    curr = next;
                }
        
                // Step 3: Reconnect the reversed section
                prevL.next = prev; // Connect the node before 'l' to the new head
                start.next = curr; // Connect the new tail to the node after 'r'
        
                return dummy.next; // Return the new head of the list
            }
        
            public static void main(String[] args) {
                Node head = new Node(1);
                head.next = new Node(2);
                head.next.next = new Node(3);
                head.next.next.next = new Node(4);
                head.next.next.next.next = new Node(5);
        
                int left = 2, right = 4;
                Node value = revLLII(head, left, right);
        
                // Print the list
                while (value != null) {
                    System.out.print(value.data + " ");
                    value = value.next;
                }
            }
        }
        
     
   