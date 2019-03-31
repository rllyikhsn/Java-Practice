import java.util.*;

/**
 * loop
 */
public class loop {

    public static void main(String[] args) {
       for (int a=5;a>=1;a--){
           for(int b=5;b>=1;b--){
               System.out.print(b);
           }
           System.out.println();
       }

       System.out.println();
       int x = 5;
       while (x>=1) {
           System.out.println(x);       
           x--;    
       }

       System.out.println();


       /*looping segitiga 

       *
       * *
       * * * 
       * * * *
       * * *
       * *
       * 
       
       */
       for (int i = 1;i<=4;i++){
           for(int j = 1; j<=i;j++){
               System.out.print("* ");
           }
           System.out.println();
       }
       for (int i = 1; i<=3;i++){
           for(int j = 3; j>=i;j--){
               System.out.print("* ");
           }
           System.out.println();
       }

       System.out.println();

        /*

            *
          *   *
        *   *   *

        */
       int n = 5;
       for(int i = 1; i<=n;i++){
           for (int j=n; j>i; j--){
               System.out.print(" ");
           }
           for (int k = 1; k<=i; k++){
               System.out.print("* ");
           }
           System.out.println();
       }

       System.out.println();

       
    }
}