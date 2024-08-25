import java.util.ArrayList;
import java.util.Arrays;

public class GroupAnagrams {
    static class Node{
        Node[] children = new Node[26];
        boolean eow;
        ArrayList<String> data = new ArrayList<>();


        Node(){
            for(int i=0; i<26; i++){
                this.children[i]=null;
            }
        }
    } 
    public static Node root = new Node();
    public static ArrayList<ArrayList<String>> ansList = new ArrayList<>();
    
    public static void insert(String s){
        Node curr = root;
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        for(int i=0; i<ch.length; i++){
            int indx = ch[i] - 'a';
            if(curr.children[indx]==null){
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }

        curr.eow = true;
        curr.data.add(s);
    }

    public static void traverseTrie(Node root){
        if(root==null) return;
        if(root.eow==true){
            ansList.add(root.data);
        }
        for(int i=0; i<26;i++){
            if(root.children[i]!=null){
                traverseTrie(root.children[i]);
            }
        }
    }

    public static void main(String[] args) {
        String[] words = {"eat","tea","tan","ate","nat","bat"};

        for(int i=0; i<words.length; i++){
            insert(words[i]);
        }

        traverseTrie(root);
        System.out.println(ansList);



        
       
    }
}
