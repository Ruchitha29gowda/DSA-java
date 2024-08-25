import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class TopView {

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

    static class Info {
        Node node;
        int horizontalDistance;

        Info(Node node, int hd){
            this.node = node;
            this.horizontalDistance = hd;
        }
    }

    public static void TopView(Node root){
        if (root==null) {
            return;
        }
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer, Node> map = new HashMap<>();
        q.add(new Info(root, 0));
        q.add(null);

        int min=0, max =0;

        while (!q.isEmpty()) {
            Info curreInfo = q.remove();
            if(curreInfo==null){
                if(q.isEmpty()) break;
                else q.add(null);
            }
            else{
                if(!map.containsKey(curreInfo.horizontalDistance)){
                    map.put(curreInfo.horizontalDistance, curreInfo.node);
                }
                if(curreInfo.node.left!=null){
                    q.add(new Info(curreInfo.node.left, curreInfo.horizontalDistance-1));
                    min = Math.min(min, curreInfo.horizontalDistance-1);
                }
                if(curreInfo.node.right!=null){
                    q.add(new Info(curreInfo.node.right, curreInfo.horizontalDistance+1));
                    max = Math.max(max, curreInfo.horizontalDistance+1);
                }
            }
        }

        for(int i=min; i<=max; i++){
            if(map.containsKey(i)){
                System.out.print(map.get(i).data+"   ");
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
        TopView(root);



    }
}
