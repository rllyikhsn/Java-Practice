import java.util.*;

class Handling{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan nilai A : ");
        int a = input.nextInt();
        System.out.println("Masukkan nilai B : ");
        int b = input.nextInt();
        try {
            int hasil = a/b;
            System.out.println("Hasilnya adalah : "+hasil);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}