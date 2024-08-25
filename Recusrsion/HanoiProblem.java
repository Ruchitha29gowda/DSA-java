import java.util.Arrays;

public class HanoiProblem {

    public static void hanoi(int n,String A, String B, String C){
        if(n==1){
            System.out.println(n+" from "+A+"  --> "+C);
            return;
        }
        //shift n-1 disks to B using C.....hence, B is destination and C is helper
        hanoi(n-1, A, C, B);

        //print what is transfered from A to B
        System.out.println(n+" from "+A+"  --> "+C);

        //Transfer back from B to A
        hanoi(n-1, B, A, C);
    }

    // public static void towerApnaCollege(int n, String src, String help, String dest){
    //     if(n==1){
    //         System.out.println(n+" from "+src+" --> "+dest);
    //         return;
    //     }
    //     else{
    //         towerApnaCollege(n-1, src, dest, help);
    //         System.out.println(n+" from "+src+" --> "+dest);
    //         towerApnaCollege(n-1, help, src, dest);
    //     }
    // }

    public static void main(String[] args) {
        int n=3;
        //Source --> A
        //Helper --> B
        //Destination --> C
        // hanoi(n, "A", "B", "C");

        // System.out.println();
        // hanoi(n, "S", "H", "D");

        int a[] ={5,4,6,2,1,8,9};
        Arrays.sort(a);
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
