import java.util.*;

public class KthLevelNodes {

    static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void recursiveWay(Node root, int level, int k){
        if(root==null) return;
        if(level==k){
            System.out.print(root.data+" ");
            return;
        }
        recursiveWay(root.left, level+1, k);
        recursiveWay(root.right, level+1, k);
    }

    public static void printK_levelNodes(Node root, int k){
        if(root==null) return;
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int count=1;

        while (!q.isEmpty()) {
            Node curr = q.remove();
            if(curr==null){
                System.out.println();
                if(q.isEmpty()) break;
                else{
                    q.add(null);
                    count++;
                }
            }
            else{
                if(count == k) System.out.print(curr.data+" ");

                if (curr.left!=null) {
                    q.add(curr.left);   
                }
                if(curr.right!=null){
                    q.add(curr.right);
                }
            }
        }
    }
    

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 

        printK_levelNodes(root, 3);
        recursiveWay(root, 1, 3);
    }
}
