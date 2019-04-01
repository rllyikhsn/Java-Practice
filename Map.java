import java.util.*;
import java.io.*;

/**
 * Map
 */
public class Map {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();

        // deklarasi objek hashmap
        HashMap<String, Integer> hm = new HashMap<String, Integer>();

        // looping sesuai banyaknya data
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            // menaruh name dan phone kedalam hashmap
            hm.put(name, phone);
            in.nextLine();
        }

        // loop sesuai banyaknya input in
        while (in.hasNext()) {
            // membaca data hashmap sesuai key
            String s = in.nextLine();
            // cek kondisi terdapat key atau tidak
            try {
                //mendapatkan value data sesuai dengan key s
                int data = hm.get(s);
                //cetak key = value
                System.out.println(s + "=" + data);
            } catch (NullPointerException e) {
                System.out.println("Not found");
            }
        }

    }
}