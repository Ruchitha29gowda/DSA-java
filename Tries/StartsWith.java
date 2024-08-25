public class StartsWith {

    static class Node {
        Node[] children = new Node[26];
        boolean endOfWord;

        Node(){
            for(int i=0; i<26; i++){
                this.children[i]=null;
            }
        }
    }

    public static Node root = new Node();

    //INERTION IN TRIE
    public static void insert(String s){
        Node current = root;
        for(int level = 0; level<s.length(); level++){
            char ch = s.charAt(level);
            if(current.children[ch - 'a']==null){
                current.children[ch -'a'] = new Node();
            }
            current = current.children[ch -'a'];
        }
        current.endOfWord = true;
    }

    public static boolean search(String s){
        Node current = root;
        for(int i=0; i<s.length(); i++){
            int indx = s.charAt(i)-'a';
            if(current.children[indx]==null){
                return false;
            }

            current = current.children[indx];
        }
        if(current.endOfWord!=true) return false;

        return true;
    }
    
    public static boolean startsWith(String preffix){
        Node curr = root;
        for(int i=0; i<preffix.length(); i++){
            int indx = preffix.charAt(i) -'a';

            if(curr.children[indx]==null){
                return false;
            }
            curr = curr.children[indx];
        }

        return true;
    }



    public static void main(String[] args) {
        String[] s = {"apple", "app", "mango", "man", "woman"};
        for(int i=0; i<s.length; i++){
            insert(s[i]);
        }

        System.out.println(startsWith("moon"));


        
    }
}
