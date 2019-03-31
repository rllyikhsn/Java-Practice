import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class If_Else {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        //deklarasi variabel untuk mencetak hasil
        String hasil = "";
        //cek kondisi n harus positif int dan max 100
        if (n>=1 && n<=100){
            //cek kondisi untuk n bernilai ganjil
            if (n%2 == 1) {
                //membuat var hasil menjadi suatu nilai
                hasil = "Weird";
            }else{
                //jika hasil salah
                //cek kondisi nilai n>=2 dan kurang <=5
                if (n>=2 && n<=5) {
                    hasil = "Not Weird";
                }else if (n>=6 && n<=20) {
                    hasil = "Weird";
                }else if (n>20) {
                    hasil = "Not Weird";
                }
            }
        }

        //cetak var Hasil dari yang sudah dioperasikan oleh if
        System.out.println(hasil);
        scanner.close();
    }
}
