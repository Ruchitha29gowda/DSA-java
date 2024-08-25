import java.util.ArrayList;
import java.util.HashMap;

public class FindAllSubtrees {
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

    static HashMap<String, Integer> map ;
    static ArrayList<Node> result ;
    
    public static String inOrder(Node root){
        if(root==null) return "$";

        String str = "";
        str+= inOrder(root.left);
        str+="l";
        str+= ""+root.data;
        str+= inOrder(root.right);
        str+="r";
        if(map.get(str)!=null && map.get(str)==1){
            System.out.println(str+" ");
            System.out.println(root.data);
            result.add(root);
        }

        if(map.containsKey(str)){
            map.put(str, map.get(str)+1);
        }
        else{
            map.put(str,1);
        }

        return str;
    }

    public static void PrintAllDuplicates(Node root){
        map = new HashMap<>();
        result = new ArrayList<>();
        inOrder(root);
        
    }


    public static void main(String[] args) {
        Node root = null;
        root = new Node(1);
        root.left = new Node(4);
        root.left.left = new Node(3);


        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(3);

        root.right.left.left = new Node(3);



        PrintAllDuplicates(root);

    }
}
