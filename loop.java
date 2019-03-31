import java.util.*;

/**
 * loop
 */
public class loop {

    public static void main(String[] args) {

        /*
        
        *
        * *
        * * *
        * *
        *

        */
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        /*

             *
            * *
           * * *
          * * * *

        */

        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        /*
        
        *****
        ****
        ***
        **
        *
        
        */

        for (int i = 1; i <= 5; i++) {
            for (int j = i + 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /*

        *****
         ****
          ***
           **
            *

        */

        for (int i = 1; i <= 5; i++) {
            for (int j = 2; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 5; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        /*

             *
            **
           ***
          ****
         *****
        
        */
        int x1 = 5;
        for (int x2 = 1; x2 <= x1; x2++) {
            for (int z1 = 4; z1 >= x2; z1--) {
                System.out.print(" ");
            }
            for (int z2 = 1; z2 <= x2; z2++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();

        /*

             *
            **
           ***
          ****
         *****
          ****
           ***
            **
             *
        
        */

        //segitiga atas
        for (int x2 = 1; x2 <= 5; x2++) {
            for (int z1 = 4; z1 >= x2; z1--) {
                System.out.print(" ");
            }
            for (int z2 = 1; z2 <= x2; z2++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //segitiga bawah
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println();


        /*

             *
            * *
           * * *
          * * * *
           * * *
            * *
             *

        */
        //segitiga atas
        for (int x2 = 1; x2 <= 5; x2++) {
            for (int z1 = 4; z1 >= x2; z1--) {
                System.out.print(" ");
            }
            for (int z2 = 1; z2 <= x2; z2++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        //segitiga bawah
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 4; k >= i; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }



    }
}