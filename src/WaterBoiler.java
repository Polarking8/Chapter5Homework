public class WaterBoiler {
    /**
     * Gets the state of matter of the water based on altitude and current temperature, in meters and celsius, respectively
     * @param temperature The temperature in celsius
     * @param altitude The altitude in meters
     */
    public void getState(int temperature, int altitude){
        if (temperature > 0 && temperature < (100 - altitude / 300)){
            System.out.println("The water is liquid");
        } else if (temperature <= 0){
            System.out.println("The water is frozen");
        } else {
            System.out.println("The water is boiling");
        }
    }
}
