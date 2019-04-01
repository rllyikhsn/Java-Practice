import java.util.*;
import java.text.*;

/**
 * Currency_Formatter
 */
public class Currency_Formatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        
        //declare numberforat region
        Locale indns = new Locale("in","ID");
        Locale india = new Locale("es","IN");

        NumberFormat idr = NumberFormat.getCurrencyInstance(indns);
        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        NumberFormat rupe = NumberFormat.getCurrencyInstance(india);

        System.out.println("Indonesia: "+idr.format(payment));
        System.out.println("US: "+us.format(payment));
        System.out.println("China: "+china.format(payment));
        System.out.println("France: "+france.format(payment));
        System.out.println("India: "+rupe.format(payment));
        

    }
}