import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

public class ATMTester {
    public static void main(String[] args) {
        ATM machine;
        machine = new ATM();
        System.out.println("PIN should be 1234, if it's not, then ask again for 2 more times.");
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3;){
            System.out.print("Enter your PIN: ");
            double input = in.nextInt();
            machine.enterPinNumber(input);
            if (machine.accessGranted){
                System.exit(0);
            } else if (machine.blocked){
                System.exit(0);
            }
            i++;
        }

    }


}
