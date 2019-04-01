import java.util.*;
import java.security.*;

/**
 * Int_to_String
 */
public class Int_to_String {

    public static void main(String[] args) {
        DoNotTerminate.forbidExit();
        try {
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            in.close();

            // Value Integer n to String
            String s = Integer.toString(n);

            // cek kondisi untuk hasil akhir
            if (n == Integer.parseInt(s)) {
                System.out.println("Good Job");
            } else {
                System.out.println("Wrong answer.");
            }

        } catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unseccessful Termination !!");
        }
    }
}

// The following class will prevent you from terminating the code using exit(0)!
class DoNotTerminate {

    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1;
    }

    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}