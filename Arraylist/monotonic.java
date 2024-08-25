import java.util.ArrayList;

public class monotonic {
    
    public static void mono(ArrayList<Integer> l){
        int a=0, b=0;
        for(int i=1; i<l.size(); i++){
            if(l.get(i)<=l.get(i-1)) a+=1;//decreasing
            if(l.get(i)>=l.get(i-1)) b+=1;//increasing
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(l.size()-1);


        if(a==l.size()-1 || b==l.size()-1){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        l.add(5);
        l.add(3);
        l.add(4);

        mono(l);
    }
}
