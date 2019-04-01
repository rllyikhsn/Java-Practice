import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * List
 */
public class List {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //memasukkan berapa list yang akan diinput
        System.out.print("Masukkan Jumlah List yang akan Di Input : ");
        int n = scan.nextInt();
        //membuat Linked list
        LinkedList<Integer> daftar = new LinkedList<>();
        //looping pemasukkan list
        for (int a = 0; a < n; a++){
            System.out.println("Masukkan Daftar List");
            //memasukkan list sesuai banyaknya data
            System.out.printf("List %d : ",a);
            int value = scan.nextInt();
            daftar.add(value);
        }

        //membuat masukkan banyaknya operasi query pada linkedlist
        System.out.print("Masukkan Jumlah operasi yang akan dilakukan : ");
        int query = scan.nextInt();
        System.out.println("Operasi yang tersedia Insert/Delete");
        //loop sesuai dengan banyaknya operasi
        for (int o = 0; o < query; o++){
            //membuat perintah query
            System.out.printf("Operasi %d : ",o);
            String perintah = scan.next();
            //cek kondisi sesuai dengan perintah
            if (perintah.equals("Insert")){
                System.out.print("Masukkan Indeks List yang akan ditambahkan : ");
                int indeks = scan.nextInt();
                System.out.print("Masukkan value yang ingin ditambahkan : ");
                int value = scan.nextInt();
                //menambah list sesuai index dan value
                daftar.add(indeks,value);
            } else { //perintah delete
                System.out.print("Masukkan Indeks yang akan dihapus : ");
                int indeks = scan.nextInt();
                daftar.remove(indeks);
            }
        }
        //menutup masukkan
        scan.close();

        //print linked list terbaru

        System.out.println("Daftar List Setelah Operasi : ");
        for (Integer numList : daftar){
            System.out.print(numList + " ");
        }
        System.out.println();
    }
}