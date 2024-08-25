public class Tromino {

    

    public static int MOD = (int)Math.pow(10,9)+7;


    public static int numTilings(int n) {
        if(n==0||n==1){
            return 1;
        }
        if(n>=2 && n<3){
            return n;
        }
        if(n==3) return 5;

        else{
            int opt1 = numTilings(n-1)%MOD;
            int opt2 = numTilings(n-3)%MOD;

            return (2*opt1%MOD +opt2%MOD)%MOD;
            
        }
    
    }
    public static int plusOne(int n) {
        int v[] = new int[n+1];
        v[0]=1;
        v[1]=1;
        v[2]=2;
        v[3]=5;
        
        
        for(int i=4; i<=n; i++){
            v[i]= 2*v[i-1]%MOD + v[i-3]%MOD;
            v[i]=v[i]%MOD;
        }

        System.out.println();
        return v[n];
    }

   
    public static void main(String[] args) {
        System.out.println("Tromino ");
        System.out.println(numTilings(45));
        //we cam't use recursion for large values......it'll take considerable ammount of time....here especially after 45


        System.out.println(plusOne(45));
    }
}