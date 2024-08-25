public class MaxPathSum {
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

    static int max = Integer.MIN_VALUE;
    public static int maxPathSum(Node root){
        if(root == null) return 0;

        int l = maxPathSum(root.left);
        int r = maxPathSum(root.right);

        int maxSingle = Math.max(Math.max(l, r)+root.data, root.data);
        int topMax = Math.max(maxSingle, l+r+root.data);

        max = Math.max(topMax, max);

        return maxSingle;
    }

    public static void preOrder(Node root){
        if(root==null) return;

        System.out.print(root.data+"  ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String[] args) {
        // Node root = new Node(-10);
        // root.left = new Node(9);
        // root.right = new Node(20);

        // root.right.left = new Node(15);
        // root.right.right = new Node(7);

        // Node root = new Node(1);
        // root.left = new Node(2);


        Node root = new Node(5);
        root.left = new Node(4);
        root.left.left = new Node(11);
        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);



        root.right = new Node(8);
        root.right.left = new Node(13);
        root.right.right = new Node(4);
        root.right.right.right = new Node(1);
        preOrder(root);

        maxPathSum(root);
        System.out.println("\n"+max);
    }
}
