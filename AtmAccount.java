import java.util.Scanner;

/**
 * AtmAccount
 */
class DailyTransactionLimitException extends Exception {
    @Override
    public String toString() {
        return "Daily Transaction Limit Exceeded";
    }
}
class InsufficientAmountException extends Exception {
    @Override
    public String toString() {
        return "Insufficient Amount";
    }
}
public class AtmAccount {
    
    public static void main(String[] args) {
        double balance = 0;
        double withdraw;
        Scanner in = new Scanner(System.in);
        withdraw = in.nextDouble();
        if()
    }
}