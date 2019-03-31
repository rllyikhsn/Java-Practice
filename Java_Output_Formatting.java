import java.util.Scanner;

public class Java_Output_Formatting{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("================================");
        for(int i=0;i<3;i++){
            String s1=scanner.next();
            int x=scanner.nextInt();
            System.out.printf("%-15s%03d%n",s1,x);
            /*penjelasan extract value
            - = untuk memberikan indent left
            15 = maksimal karakter 15
            s = untuk var bertipe string
            03 = untuk memberikan 3 angka
            d = untuk var bertipe int
            */
        }
        System.out.println("================================");
    }
}