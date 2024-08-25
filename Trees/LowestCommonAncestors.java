import java.util.ArrayList;

public class LowestCommonAncestors {

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

    

    public static Node lca2(Node root, int n1, int n2){
        if(root==null) return null;
        if(root.data == n1 || root.data==n2) return root;
        
        Node left = lca2(root.left, n1, n2);
        Node right = lca2(root.right, n1, n2);

        if(left==null) return right;
        if(right==null) return left;

        return root;
    }

    public static boolean findPath(Node root, int n, ArrayList<Node> path){
        if(root==null) return false;

        path.add(root);
        if(root.data == n){
            return true;
        }

        boolean left = findPath(root.left, n, path);
        boolean right = findPath(root.right, n, path);

        if(left || right){
            return true;
        }
        path.remove(path.size()-1);
        return false;
    }

    public static void lca(Node root, int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        findPath(root, n1, path1);
        findPath(root, n2, path2);

        for(int i=0; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i)!=path2.get(i)){
                System.out.println(path1.get(i-1).data);
                break;
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

        lca(root, 4, 5);

        
    }
}          
