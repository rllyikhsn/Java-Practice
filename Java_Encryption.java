import java.io.*;
import java.util.*;
import java.math.*;
import java.security.*;

public class Java_Encryption{
    public static String generateMD5(String teks){
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] hashBytes = md.digest(teks.getBytes());
            StringBuilder sb = new StringBuilder();
            for(byte b : hashBytes){
                sb.append(String.format("%02x",b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
    public static String generateSHA256(String teks){
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashBytes = md.digest(teks.getBytes());
            StringBuilder sb = new StringBuilder();
            for(byte b : hashBytes){
                sb.append(String.format("%02x",b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        System.out.println("Hasil MD5 : ");
        System.out.println(generateMD5(input));
        System.out.println("Hasil SHA256 : ");
        System.out.println(generateSHA256(input));
    }
}