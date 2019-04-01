import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Static_Initializer_Block
 */
public class Static_Initializer_Block {

    // deklarasi statik
    static boolean flag = true;
    static Scanner scanner = new Scanner(System.in);
    static int H = scanner.nextInt();
    static int B = scanner.nextInt();

    static {
        try {

            if (B <= 0 || H <= 0) {
                flag = false;
                throw new Exception("Breadth and height must be positive");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        if(flag){
            int area = B*H;
            System.out.print(area);
        }
    }
}