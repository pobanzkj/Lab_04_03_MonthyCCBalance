public class Main { public static void main(String[] args) {
    double balance = 5000;
    double interestrate = .17;
    double monthlypayment1 = balance * interestrate;
    double x = monthlypayment1 * interestrate;
    double monthlypayment2 = monthlypayment1 + monthlypayment1 + x;
        System.out.println("Your interest due after one month is $" + monthlypayment1);
        System.out.println("Your interest due after two months is $" + monthlypayment2);
    }
}