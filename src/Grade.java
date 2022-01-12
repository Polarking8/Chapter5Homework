public class Grade {
    public Grade() {}
    /**
     * gets the GPA and then rounds it by multiplying by 10, rounding that, and then dividing by ten and going on with the logic.
     * @param scaleGrade the input GPA that the user puts in.
     */
    public void getNumericGrade(double scaleGrade) {
        //RoundedGPA is the input rounded up to the nearest tens place. 
        double roundedGPA = scaleGrade * 10;
        roundedGPA = Math.round(roundedGPA);
        roundedGPA = roundedGPA / 10;
        // checks if what roundedGPA is based on what value it is above, and then prints based on that.
        if (roundedGPA == 4.0){
            System.out.println("A");
        } else if (roundedGPA >= 3.7){
            System.out.println("A-");
        } else if (roundedGPA >= 3.3){
            System.out.println("B+");
        } else if (roundedGPA >= 3.0) {
            System.out.println("B");
        } else if (roundedGPA >= 2.7) {
            System.out.println("B-");
        } else if (roundedGPA >= 2.3) {
            System.out.println("C+");
        } else if (roundedGPA >= 2.0) {
            System.out.println("C");
        } else if (roundedGPA >= 1.7) {
            System.out.println("C-");
        } else if (roundedGPA >= 1.3) {
            System.out.println("D+");
        } else if (roundedGPA >= 1.0) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
