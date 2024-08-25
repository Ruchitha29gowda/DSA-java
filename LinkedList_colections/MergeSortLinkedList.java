import java.util.LinkedList;

public class MergeSortLinkedList {

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

    //---------------MAIN FUNCTIONS-------------------------

    public static Node merge(Node leftHead, Node rightHead){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while (leftHead!=null && rightHead!=null) {
            if(leftHead.data<rightHead.data){
                temp.next= leftHead;
                leftHead=leftHead.next;
                temp=temp.next;
            }
            else{
                temp.next= rightHead;
                rightHead= rightHead.next;
                temp=temp.next;
            }
        }

        while (leftHead!=null) {
            temp.next=leftHead;
            leftHead=leftHead.next;
            temp=temp.next;
        }

        while (rightHead!=null) {
            temp.next=rightHead;
            rightHead=rightHead.next;
            temp=temp.next;
        }

        return mergeLL.next;
    }

    public static Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    public Node mergeSort(Node head){
        if(head==null || head.next==null){
            return head;
        }

        Node mid = getMid(head);
        Node right = mid.next;
        mid.next = null;


        Node leftHead = mergeSort(head);
        Node rightHead= mergeSort(right);
        return merge(leftHead, rightHead);
    }
    
    public static void main(String[] args) {
        MergeSortLinkedList ll = new MergeSortLinkedList();
        ll.add(1);
        ll.add(4);
        ll.add(3);
        ll.add(2);

        ll.printll(head);
        head =ll.mergeSort(head);
        ll.printll(head);
        
        
    }
}
