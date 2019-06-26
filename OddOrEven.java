import java.util.*;

/**
 * OddOrEven
 */
public class OddOrEven {

    public static void main(String[] args) {
        int check;
        System.out.println("Please Enter Integer to check if it is odd or eve");
        Scanner scan = new Scanner(System.in);
        check = scan.nextInt();
        
        if (check % 2 == 0) {
            System.out.printf("The number %d is even(genap).%n",check);
        } else {
            System.out.printf("The number %d is odd(ganjil).%n",check);
        }

        int a[] = {1,2,3,4,5,6};
        System.out.println("Daftar No Ganjil dari array : " + Arrays.toString(a));
        for(int i = 0;i<a.length;i++){
            if(a[i]%2 != 0){
                System.out.print(a[i] + " ");
            }
        }
        System.out.println();
        
        System.out.println("Daftar No Genap dari array : " + Arrays.toString(a));
        for(int i = 0;i<a.length;i++){
            if(a[i]%2 == 0){
                System.out.print(a[i] + " ");
            }
        }
    }
}