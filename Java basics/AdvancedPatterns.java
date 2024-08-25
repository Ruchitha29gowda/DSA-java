public class AdvancedPatterns {

    public static void print_Hollow_rectangle(int rows , int cols){
        System.out.println("HOLLOW RECTANGLE \n");
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void print_invertedPyramid_Numbers(int n){
        System.out.println("INVERTED PYRAMID OF NUMBERS");
        int columns = n;

        // MY LOGIC

        // for(int i=1; i<=n; i++){
        //     int num = 1;
        //     for(int j=1; j<=columns; j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     columns--;
        //     System.out.println();
        // }

        //APNA COLLEGE LOGIC
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }

    public static void print_invertedPyramid(int n){
        System.out.println("INVERTED PYRAMID \n");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print("  ");
            }
            // for(int j=n-i+1; j<=cols;j++){
            //     System.out.print("* ");
            // }
            
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void print_FloydsTringale(int n){
        System.out.println("FLOYD'S TRIANGLE");
        int num=1;
        for(int i =1; i<=n;i++){
            for(int j=1; j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }

    public static void print_01Tringale(int n){
        System.out.println("0-1 TRINAGLE");
        
        boolean one= true;
        for(int i =1; i<=n;i++){
            for(int j=1; j<=i;j++){
                //APNA COLLEGE LOGIC
                // if((i+j)%2 ==0){
                //     System.out.print("1 ");
                // }
                // else{
                //     System.out.print("0 ");
                // }

                //MY LOGIC
                if(one){
                    System.out.print("1 ");
                    one=!one;
                }
                else{
                    System.out.print("0 ");
                    one=!one;
                }

                
            }
            System.out.println();
        }
    }

    public static void print_Butterfly(int half){
        System.out.println("BUTTERFLY PATTERN");
        for(int i=1; i<=half; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=(half*2)-(2*i); j++){
                System.out.print("  ");
            }
            for(int j =1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i=half; i>=1; i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=(half*2)-2*i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    } 

    public static void print_solidRhombus(int n){
        System.out.println("SOLID RHOMBUS");
        
        //My Logic
        // for(int h=n; h>=1; h--){
        //     for(int i=h; i>=1; i--){
        //         System.out.print("  ");
        //     }
        //     for(int i=1; i<=n; i++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //APNA COLLEGE LOGIC
        for(int i = 1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("  ");
            }
            for(int j =1; j<=n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }

    public static void print_Hollow_Rhombus(int n){
        System.out.println("HOLLOW RHOMBUS");
        for(int i =1; i<=n;i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=n;j++){
                if(j==1|| i==1|| i==n|| j==n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

    public static void print_DiamondPattern(int n){

        //MY LOGIC
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i+1; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=i; j>1; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void main(String args[]){
        print_Hollow_rectangle(5, 5);
        System.out.println("\n\n");

        print_invertedPyramid(5);
        System.out.println("\n\n");

        print_invertedPyramid_Numbers(5);
        System.out.println("\n\n");

        print_FloydsTringale(5);
        System.out.println("\n\n");

        print_01Tringale(5);
        System.out.println("\n\n");

        print_Butterfly(4);
        System.out.println("\n\n");

        print_solidRhombus(5);
        System.out.println("\n\n");

        print_Hollow_Rhombus(5);
        System.out.println("\n\n");

        print_DiamondPattern(5);
    }
}
