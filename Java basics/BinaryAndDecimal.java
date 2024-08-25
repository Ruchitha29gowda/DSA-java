public class BinaryAndDecimal {

    public static int binaryToDecimal(int B){
        int power =0;
        int decimal =0;

        if(B==0){
            return 0;
        } 
        while(B>0){
            int lastDigit = B % 10;
            decimal = decimal + lastDigit*(int)Math.pow(2, power);
            B=B/10;
            power++;
        }   
        return decimal;
    }


    public static int decimalToBinary(int n){
        int binary=0;
        int remainder=0;
        int power =0;

        while(n>0){
            remainder = n%2;
            n/=2;
            binary = binary + remainder*(int)Math.pow(10, power);
            power++;
        }
        return binary;

    }
    public static void main(String args[]){
        
        System.out.println(binaryToDecimal(10100));
        System.out.println(decimalToBinary(20));
    }
}
