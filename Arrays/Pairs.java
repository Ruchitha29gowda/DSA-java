public class Pairs {

    public static void printPairs(int num[]){
        int count =0;
        for(int i=0; i<=num.length-1; i++){
            for(int j=i+1; j<=num.length-1; j++){
                System.out.print("("+ num[i]+","+num[j]+") ");
                count++;
            }
            System.out.println();
        }
        System.out.println("Total pairs: "+count);
        //Another way to print
        int n= num.length;
        System.out.println("Total pairs from Formula: "+(n*(n-1))/2);

    }
    public static void main(String[] args) {
        int num[]={2,4,6,8,10};
        printPairs(num);
    }
}
