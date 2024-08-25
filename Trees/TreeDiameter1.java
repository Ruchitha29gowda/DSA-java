public class TreeDiameter1 {

    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int maxDiameter(Node root){
        if(root==null) return 0;
        int leftD = maxDiameter(root.left);
        int rightD = maxDiameter(root.right);
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);

        int self = leftHeight + rightHeight +1;
        int maxofsubtree = Math.max(leftD, rightD);
        return Math.max(maxofsubtree, self);
    }

    public static int findHeight(Node root){
        if (root==null) {
            return 0;
        }
        else{
            return Math.max(findHeight(root.left), findHeight(root.right))+1;
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

        System.out.println(maxDiameter(root));
        
    }
}