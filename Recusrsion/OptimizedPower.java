public class OptimizedPower {

    public static int optimizedPower(int x, int n){
        if(n==0){
            return 1;
        }
        else{
            if(n%2==0){
                return optimizedPower(x, n/2)*optimizedPower(x, n/2);
            }
            else{
                return x*optimizedPower(x, n/2)*optimizedPower(x, n/2);
            }
        }
    }


    public static int optimizedPower2(int x, int n){
        if(n==0){
            return 1;
        }
        else{
            int ans =optimizedPower2(x, n/2)*optimizedPower2(x, n/2);
            if(n%2!=0){
                return x*ans;
            }
            return ans;
        }
    }



    public static void main(String[] args) {
        System.out.println(optimizedPower(2, 10));
        System.out.println(optimizedPower2(2, 10));
    }
}
