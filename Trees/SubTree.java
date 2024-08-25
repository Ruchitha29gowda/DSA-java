import java.util.Stack;

public class SubTree {
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

    public static void preOrder(Node root, Stack<Integer> s){
        if(root == null) return;
        else{
            s.push(root.data);
            preOrder(root.left, s);
            preOrder(root.right, s);
        }
    }

    public static boolean isIdentical(Node root, Node subroot){

        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        preOrder(root, s1);
        preOrder(subroot, s2);
        System.out.println(s1);
        System.out.println(s2);

        if(s1.size()!=s2.size()) return false;
        else{
            while(s1.isEmpty() || s2.isEmpty()){
                if(s1.pop()!=s2.pop()) return false;
            }
        }

        return true;
        
    }

    public static Node isSubTree(Node root, int target){
        if(root == null) return null;
        if(root.data==target) {
            return root;
        }
        if (isSubTree(root.left, target)!=null) {
            return isSubTree(root.left, target);
        }
        else if (isSubTree(root.right, target)!=null) {
            return isSubTree(root.right, target);
        }
        else{
            return null;
        }
    }

    public static boolean isIdenticalAPnaCollege(Node root, Node subroot){
        if(root==null && subroot==null) return true;
        else if(root==null || subroot==null || root.data!=subroot.data){
            return false;
        }

        if(!isIdenticalAPnaCollege(root.left, subroot.left)) return false;
        if(!isIdenticalAPnaCollege(root.right, subroot.right)) return false;

        return true;
    }

    public static boolean isSubTreeApnaCollege(Node root, Node subroot){
        if(root == null) return false;

        if(root.data == subroot.data){
            if(isIdenticalAPnaCollege(root, subroot)){
                System.out.println("Identical");
                return true;
            }
            else{
                System.out.println("Check again");
            }
        }

        return isSubTreeApnaCollege(root.left, subroot) || isSubTreeApnaCollege(root.right, subroot);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4); 
        root.left.right = new Node(5); 
        root.right.left = new Node(6); 
        root.right.right = new Node(7); 


        Node subroot = new Node(2);
        subroot.left = new Node(4);
        subroot.right = new Node(5);
        


        System.out.println(isSubTreeApnaCollege(root, subroot));
    }
}
