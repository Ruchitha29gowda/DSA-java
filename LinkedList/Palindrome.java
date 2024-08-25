public class Palindrome {
    
    public static class  Node {
        
        int data;
        Node next = null;
        
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head =tail = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void printlist(Node head){
        if(head==null){
            System.out.println("Empty List!");
            return;
        }
        else{
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data +" -> ");
                temp = temp.next; 
            }
            System.out.println("null");
        }
    }

    //////// ------------MAIN FUNCTIONS--------------------- 
    
    public Node findMid(Node head){
        Node mid;
        Node slow=head;
        Node fast=head;

        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast= fast.next.next;
        }
        mid=slow;
        return mid;
    }

    public boolean isPalindrome(Node head){
        if(head==null || head.next==null) return true;

        //calculate mid
        Node mid = findMid(head);

        //reverse second half
        Node curr = mid;
        Node prev = null;
        Node nxt;
        while(curr!=null){
            nxt=curr.next;
            curr.next = prev;
            prev=curr;
            curr = nxt;
        }
        

        Node left = head;
        Node right = prev;

        //check if both half are equal
        while(right!=null){
            if(left.data!=right.data) return false;
            left= left.next;
            right= right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        Palindrome ll = new Palindrome();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(2);

        ll.addFirst(1);

        ll.printlist(head);
        System.out.println(ll.isPalindrome(head));
    }

}
