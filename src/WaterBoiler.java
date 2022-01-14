public class WaterBoiler {
    /**
     * Gets the state of matter of the water based on altitude and current temperature, in meters and celsius, respectively
     * @param temperature The temperature
     * @param altitude The altitude
     * @param isFahrenheit boolean for if its fahrenheit or celsius
     * @param isFeet boolean for if its feet or meters
     */
    //1000 feet for 1 celsius, 300 meters for 1 centigrade
    // 1 celsius is 1.8 fahrenheit
    public String getState(double temperature, double altitude, boolean isFahrenheit, boolean isFeet){
        String state;
        if (isFeet){
            if (isFahrenheit){
                if (temperature > 0 && temperature < (212 - 1.8*(altitude / 1000))){
                    System.out.println("The water is liquid");
                    state = "liquid";
                } else if (temperature <= 32){
                    System.out.println("The water is frozen");
                    state = "frozen";
                } else {
                    System.out.println("The water is boiling");
                    state = "boiling";
                }
            } else{
                if (temperature > 0 && temperature < (100 - altitude / 1000)){
                    System.out.println("The water is liquid");
                    state = "liquid";
                } else if (temperature <= 0){
                    System.out.println("The water is frozen");
                    state = "frozen";
                } else {
                    System.out.println("The water is boiling");
                    state = "boiling";
                }
            }
        } else{
            if (!isFahrenheit){
                if (temperature > 0 && temperature < (100 - altitude / 300)){
                    System.out.println("The water is liquid");
                    state = "liquid";
                } else if (temperature <= 0){
                    System.out.println("The water is frozen");
                    state = "frozen";
                } else {
                    System.out.println("The water is boiling");
                    state = "boiling";
                }
            } else{
                if (temperature > 0 && temperature < (212 - 1.8*(altitude / 300))){
                    System.out.println("The water is liquid");
                    state = "liquid";
                } else if (temperature <= 32){
                    System.out.println("The water is frozen");
                    state = "frozen";
                } else {
                    System.out.println("The water is boiling");
                    state = "boiling";
                }
            }
        }
        return state;
    }
}

