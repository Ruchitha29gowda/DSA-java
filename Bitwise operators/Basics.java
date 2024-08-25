public class Basics{

    //basic functions

    //1. even or odd
    public static void evenOrOdd(int n){
        int bitmask =1;
        if((n & bitmask)==1){
            System.out.println("odd");
        }
        else{
            System.out.println("even");
        }
    }


    //2. Get ith bit
    public static void getith(int n, int i){
        int bitmask= 1<<i;
        //doubt!!
        // System.out.println(n&bitmask);

        if((n&bitmask)==0){
            System.out.println("bit at "+i+" is : "+0);
        }
        else{
            System.out.println("bit at "+i+" is : "+1);
        }
    }

    //3. set ith bit
    public static void setith(int n, int i){
        System.out.println("Number given: "+n);
        getith(n, i);
            
        int bitmask= 1<<i;
        //doubt!!
        // System.out.println(n&bitmask);
        
        n=n|bitmask;
        getith(n, bitmask);
        System.out.println("New number now: "+n);
    }


    //4. clear ith bit
    public static void clearith(int n, int i){
        System.out.println("Number given: "+n);
        getith(n, i);
            
        int bitmask= ~(1<<i);
        //doubt!!
        // System.out.println(n&bitmask);
        
        n=n&bitmask;
        System.out.println("cleared!");
        getith(n, i);
        System.out.println("New number now: "+n);
    }


    //5. update ith bit
    public static void updateith(int n, int val, int pos){
        if(val==1){
            setith(n, pos);
        }
        else if(val==0){
            clearith(n, pos);
        }
    }

    //2nd approach to update
    public static void updateith2(int n, int val, int pos){
        clearith(n, pos);
        int bitmask = val<<pos;
        System.out.println((n|bitmask));
    }

    //6. clear last ith bit
    public static void clearLastbits(int n,int i){
        int bitmask = (~0)<<i;
        System.out.println(n & bitmask);
    }


    //7. clear range of bits
    //i and j are counted from right to left
    public static void clearRangeOfBits(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (i<<i)-1;

        int bitmask = a|b;
        int res = n & bitmask;
        System.out.println(res);
    }





    public static void main(String args[]){
        evenOrOdd(0);
        // getith(2, 1);

        // setith(2, 0);
        // clearith(3, 0);
        // updateith2(2, 0, 1);


        // clearLastbits(15, 2);
        clearRangeOfBits(10, 2, 7);
        
    }
}