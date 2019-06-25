import java.util.*;

public class Recursive{
    public static void main(String[] args){
        
        /*
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        System.out.println("ini adalah string" + string);

        int x=1;
        for (; x<=20; x++){
            System.out.println(x);
        }

        int y=1;
        while (y<=20) {
            System.out.println(y);
            y++;
        }*/

        ArrayList<String> daftarString = new ArrayList<String>();
        //daftarString.clear();
        daftarString.add("nol");
        daftarString.add("satu");
        daftarString.add("dua");
        daftarString.add("tiga");
        daftarString.add("empat");

        //System.out.println(daftarString.get(4));
        Collections.rotate(daftarString,5);
        for(int a=0;a<daftarString.size();a++){
            System.out.println(daftarString.get(a));
        }
    }
}