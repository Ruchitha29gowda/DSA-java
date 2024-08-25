public class TreeDiameter2 {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
        
    }

    static class Info{
        int maxDiameter;
        int height;

        Info(int d, int h){
            this.maxDiameter = d;
            this.height = h;
        }
    }

    public static Info maxDiameter(Node root){
        if(root==null) return new Info(0, 0);
        int leftD = maxDiameter(root.left).maxDiameter;
        int rightD = maxDiameter(root.right).maxDiameter;

        int leftHeight = maxDiameter(root.left).height;
        int rightHeight = maxDiameter(root.left).height;
        int finalHeight = Math.max(leftHeight, rightHeight)+1;

        int selfD = leftHeight+rightHeight+1;
        int finalD = Math.max(selfD, Math.max(leftD, rightD));
        

        return new Info(finalD, finalHeight);
    }
    

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 

        System.out.println(maxDiameter(root).maxDiameter);
        System.out.println(maxDiameter(root).height);

    }
}
