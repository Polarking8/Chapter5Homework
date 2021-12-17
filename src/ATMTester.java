import java.util.Scanner;

public class ATMTester {
    public static void main(String[] args) {
        ATM machine;
        machine = new ATM();
        Scanner in = new Scanner(System.in);
        for (int i = 0; i<3;){
            System.out.print("Enter your PIN: ");
            int input = in.nextInt();
            machine.enterPinNumber(input);
            i++;
        }
        System.out.println("PIN should be 1234, if it's not, then ask again for 2 more times.");
        // alternatively you can have this iterate 3 times, like this:
        // System.out.print("Enter your PIN: ");
        // int input = in.nextInt();
        // machine.enterPinNumber(input);
        // System.out.print("Enter your PIN: ");
        // int input2 = in.nextInt();
        // machine.enterPinNumber(input2);
        // System.out.print("Enter your PIN: ");
        //int input3 = in.nextInt();
        // machine.enterPinNumber(input3);
    }
}
