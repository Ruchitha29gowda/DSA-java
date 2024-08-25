import javax.swing.tree.TreeNode;

public class LargestBST {
    public static class  Node {
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
            this.left = this.right = null;
        }
    }


    public static class Info {
        boolean isBST;
        int size;
        int min;
        int max;

        Info(boolean isBST, int size, int min, int max){
            this.isBST=isBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
        
    }

    public static int maxBstSize =0;

    
    public static Info findLargsetBST(Node root){
        if(root == null) return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);

        Info leftInfo = findLargsetBST(root.left);
        Info rightInfo = findLargsetBST(root.right);

        int size = leftInfo.size + rightInfo.size +1;
        int min = Math.min(root.val, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.val, Math.max(leftInfo.max, rightInfo.max));

        if(root.val<=leftInfo.max || root.val>=rightInfo.min){
            return new Info(false, size, min, max);
        }

        if (leftInfo.isBST && rightInfo.isBST) {
            maxBstSize= Math.max(size, maxBstSize);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }




    public static void inorder(Node root){
        if(root == null) return;
        
        inorder(root.left);
        System.out.print(root.val+"   ");
        inorder(root.right);

    }

    public static int sum(Node root){
        if(root==null) return 0;
        return sum(root.left) + sum(root.right) + root.val;
    }
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(30);
        root.left.left = new Node(5);
        root.left.right = new Node(20);

        // root.right = new Node(60);
        // root.right.left = new Node(45);
        // root.right.right = new Node(70);

        // root.right.right.left = new Node(65);
        // root.right.right.right = new Node(80);
        
        System.out.println(sum(root));
        
        // inorder(root);
        // System.out.println();
        // maxBstSize =0;
        // findLargsetBST(root);
        // System.out.println(maxBstSize);
    }
}
