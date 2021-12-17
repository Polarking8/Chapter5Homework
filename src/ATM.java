public class ATM {
    private int numberOfTries;
    public ATM(){
    }
    /**
     * checks if input is the PIN, if it's not, then check if number of tries is less than 2
     * (3 because java counts from 0)
     * otherwise will block bank card.
     * @param input is the PIN the user gives
     */
    public void enterPinNumber(int input){
        if (input == 1234) {
            System.out.println("Your PIN is correct");
            System.exit(0);
        } else if (numberOfTries < 2) {
            System.out.println("Your PIN is incorrect");
            numberOfTries++;
        } else {
            System.out.println("Your bank card is blocked");
            System.exit(0);
        }
    }
}
