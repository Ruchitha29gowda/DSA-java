public class Zigzag {
    public static class Node {
        int data ;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        
    }
    static Node head;

    public void add(int data){
        Node newNode = new Node(data);
        if(head==null){
            head=newNode;
            System.out.println("data added");
            return;
        }
        newNode.next=head;
        head=newNode;
        System.out.println("data added");
    }

    public void printll(Node head){
        if(head==null){
            System.out.println("Empty");
            return;
        }
        Node temp=head;
        while (temp!=null) {
            System.out.print(temp.data+"  ");
            temp=temp.next;
        }
        System.out.println();
    }


    //------------------MAIN FUNCTIONs-----------------------

    public static void Zigzag(){
        //find mid
        Node slow=head;
        Node fast=head.next;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }

        Node mid = slow;

        //reverse list after mid
        Node prev = null;
        Node currNode = mid.next;
        mid.next=null;
        Node nxt = null;

        while(currNode!=null){
            nxt=currNode.next;
            currNode.next=prev;
            prev=currNode;
            currNode=nxt;
        }

        Node left = head;
        Node right = prev;

        while (right!=null && left!=null) {
            Node leftLL= left.next;
            Node rightLL= right.next;

            left.next=right;
            right.next=leftLL;

            left=leftLL;
            right=rightLL;
        }
    }




    public static void main(String[] args) {
        Zigzag ll = new Zigzag();
        ll.add(5);
        ll.add(4);
        ll.add(3);
        ll.add(2);
        ll.add(1);

        ll.printll(head);
        ll.Zigzag();
        ll.printll(head);
    }

}
