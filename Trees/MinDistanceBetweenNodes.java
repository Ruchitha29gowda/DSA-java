public class MinDistanceBetweenNodes {
    
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

    public static Node lca(Node root, int n1, int n2){
        if(root==null) return null;
        if(root.data==n1 || root.data==n2) return root;

        Node left = lca(root.left, n1, n2);
        Node right = lca(root.right, n1, n2);

        if(left==null) return right;
        if(right==null) return left;

        return root;
    }

    public static void findMinDistance(Node root, int n1, int n2){
        Node ancestor = lca(root, n1, n2);
        int d1 = findDistance(root, n1, 0);
        int d2 = findDistance(root, n2, 0);

        System.out.println(d1+d2);
    }

    public static int findDistance(Node root, int n1, int count){
        if(root==null) return 0;
        if(root.data==n1) return count;

        int left = findDistance(root.left, n1,count+1);
        int right = findDistance(root.right, n1, count+1);
        return Math.max(left, right);
        
    }


    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);

        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 

        // System.out.println(lca(root, 4, 7).data);
        findMinDistance(root, 2, 3);

    }
}
