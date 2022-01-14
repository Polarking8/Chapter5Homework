import java.util.Scanner;
public class WaterBoilerTester {
    public static void main(String[] args) {
        boolean isFahrenheit = false;
        boolean isFeet = false;
        WaterBoiler kettle;
        kettle = new WaterBoiler();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        double temp = in.nextInt();
        System.out.print("Enter the altitude: ");
        double alt = in.nextInt();
        System.out.println("Enter F for Fahrenheit or C for Celsius:");
        String tempFC = in.next();
        if(tempFC.equals("F")){
            isFahrenheit = true;
        } else if(tempFC.equals("C")){
            isFahrenheit = false;
        }
        System.out.println("Enter M for Meters or F for Feet:");
        String altFM = in.next();
        if(altFM.equals("F")){
            isFeet = true;
        } else if(tempFC.equals("M")){
            isFeet = false;
        }
        kettle.getState(temp, alt, isFahrenheit, isFeet);
    }
}
