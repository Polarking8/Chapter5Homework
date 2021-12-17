import java.util.Scanner;
public class GradeTester {
    public static void main(String[] args) {
        Grade studentGrade;
        studentGrade = new Grade();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the GPA: ");
        double studentGPA = in.nextDouble();
        studentGrade.getNumericGrade(studentGPA);
        System.out.println("This should get the student's letter grade based on the CollegeBoard letter to GPA system " +
                "For example, 4.0 is A, 3.7 and above is A-, 3.3 and above is B+, etc.");
    }
}
