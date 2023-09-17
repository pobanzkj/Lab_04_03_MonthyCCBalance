public class Main {
    static double balance = 5000;
    static double interestrate = .17;
    static double monthlypayment1 = balance * interestrate;
static double x = monthlypayment1 * interestrate;
    static double monthlypayment2 = monthlypayment1 + monthlypayment1 + x;

    public static void main(String[] args) {
        System.out.println("Your interest due after one month is $" + monthlypayment1);
        System.out.println("Your interest due after two months is $" + monthlypayment2);
    }
}