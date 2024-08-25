
public class DeleteLeafNodes {

    public static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }
    public static void preOrder(Node root){
        if(root==null) {
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static boolean deleteLeafNodes(Node root, int val){
        if(root==null) return false;
        boolean left = deleteLeafNodes(root.left, val);
        if(left==true){
            root.left=null;
        }

        boolean right = deleteLeafNodes(root.right, val);
        if(right==true){
            root.right=null;
        }

        if(root.left==null && root.right==null){
            if(root.data==val){
                return true;
            }
            else return false;
        }

        return false;
    }

    static int flag =0;


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(2); 
        root.left.right = new Node(2); 

        root.right.left = new Node(2);
        root.right.right = new Node(4);

        preOrder(root);
        deleteLeafNodes(root, 2);
        System.out.println();
        preOrder(root);
        

    }

}
