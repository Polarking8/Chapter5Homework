import java.util.Scanner;
public class WaterBoilerTester {
    public static void main(String[] args) {
        WaterBoiler kettle;
        kettle = new WaterBoiler();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        int temp = in.nextInt();
        System.out.print("Enter the altitude in meters: ");
        int alt = in.nextInt();
        kettle.getState(temp, alt);
        System.out.print("A temperature of over 100 or below zero would be boiling or freezing, respectively.\n" +
                "Altitude would also make the boiling point lower, for every 300 meters the boiling point lowers 1 Celsius.");
    }
}
