import java.util.Scanner;

/**
 * AtmAccount
 */
class DailyTransactionLimitException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Daily Transaction Limit Exceeded";
    }
}
class InsufficientAmountException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    @Override
    public String toString() {
        return "Insufficient Amount";
    }
}

class AtmDetails {
    double balance = 0;
    double withdraw;
    AtmDetails() {}
    AtmDetails(double a) {
        balance = a;
    }
    void withdrawAmount(double x) throws DailyTransactionLimitException, InsufficientAmountException{
        if(x>25000) {
            throw new DailyTransactionLimitException();
        }
        else if(x > balance) {
            throw new InsufficientAmountException();
        }
        else {
            balance -= x;
            System.out.println("balance : " + balance);
        }
    }
}
public class AtmAccount {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter balance and amount to withdraw : ");
        double a = in.nextDouble(), b = in.nextDouble();
        AtmDetails atm = new AtmDetails(a);
        try {
            atm.withdrawAmount(b);
        } catch (Exception e) {
            e.printStackTrace();
        }
        in.close();
    }
}