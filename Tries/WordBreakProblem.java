public class WordBreakProblem{
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


    //WORK BREAK FUNCTION CODE
    public static boolean wordBreak(String s){
        if(s=="") return true;

        Node curr = root;
        for(int i=0; i<s.length(); i++){
            int indx = s.charAt(i) - 'a';

            if(curr.children[indx]==null){
                return false;
            }
            
            curr = curr.children[indx];
            if(curr.endOfWord==true){
                return wordBreak(s.substring(i+1));
            }
        }

        if(curr.endOfWord==false) return false;
        
        return true;
    }

    //APNA COLLEGE LOGIC
    public static boolean apnaCollege(String s){
        if(s.length()==0) return true;
        for(int i=1; i<=s.length(); i++){
            
            String s1 = s.substring(0, i);
            String s2 = s.substring(i);
            if(search(s1) && apnaCollege(s2)) return true;
        }

        return false;
    }

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
    
    public static void main(String[] args) {
        String[] s = {"i", "like", "samsung", "mobile", "ice"};
        for(int i=0; i<s.length; i++){
            insert(s[i]);
        }

        System.out.println("INSERTION DONE!!!!! \n");
        System.out.println(wordBreak("ilike"));
        System.out.println(apnaCollege("ilike"));


        
    }
}
