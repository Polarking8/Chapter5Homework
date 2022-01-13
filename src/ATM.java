public class ATM {
    private int numberOfTries = 0;
    boolean blocked = false;
    boolean accessGranted = false;
    public ATM(){

    }
    /**
     * checks if input is the PIN, if it's not, then check if number of tries is less than 2
     * (3 because java counts from 0)
     * otherwise will block bank card.
     * @param input is the PIN the user gives
     * @return
     */
    public void enterPinNumber(double input) {
        if (input == 1234) {
            System.out.println("Your PIN is correct");
            accessGranted = true;
        } else if (numberOfTries >= 2) {
            System.out.println("Your bank card is blocked");
            blocked = true;
        } else{
            System.out.println("Your PIN is incorrect");
            numberOfTries++;
        }
    }
}
