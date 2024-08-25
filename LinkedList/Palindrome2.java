public class Palindrome2 {

    public class Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }
        
    }

    static Node head;
    static Node tail;

    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = tail = newNode;
            return;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    public void printList(){
        if(head== null){
            System.out.println("Empty!!");
        }
        else{
            Node temp = head;
            while (temp!=null) {
                System.out.print(temp.data+"    ");
                temp=temp.next;
            }
            System.out.println();
        }
    }

    public boolean isPalindrome(Node head){
        System.out.println("checking is palindrome...");
        if(head==null || head.next==null) return true;
        
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow.data+" -> Mid value");
        System.out.println("--------------------");
        
        Node mid = slow;

        Node current = mid;
        Node prev = null;
        Node nxt ;

        while (current!= null) {
            nxt = current.next;
            current.next = prev;
            prev = current;
            current = nxt;
        }

        Node left = head;
        Node right = prev;
        while(right!=null){
            if(left.data!=right.data ) return false;
            else{
                left = left.next;
                right = right.next;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Palindrome2 ll = new Palindrome2();
        ll.add(1);
        ll.add(2);
        ll.add(2);
        ll.add(1);

        ll.printList();
        System.out.println(ll.isPalindrome(head));;
    }
}
