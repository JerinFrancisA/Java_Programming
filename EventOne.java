import java.util.Scanner;

class DailyTransactionLimitException extends Exception {
	public String toString() {
		return "Daily Limit Exceeded (25,000)";
	}
}

class InsufficientAmountException extends Exception {
	public String toString() {
		return "Insufficient Balance";
	}
}

class Test {
	int balance;
	public Test() {}
	public Test(int initialBalance) {
		balance = initialBalance;
	}
	void withdraw(int amountToWithdraw) throws DailyTransactionLimitException, InsufficientAmountException {
		if(amountToWithdraw > 25000) {
			throw new DailyTransactionLimitException();
		}
		else if(amountToWithdraw > balance) {
			throw new InsufficientAmountException();
		}
		else {
			balance = balance - amountToWithdraw;
			System.out.println("WITHDRAWAL SUCCESSFUL !\n" + "Amount withdrawn : " + amountToWithdraw + "\nCurrent Balance : " + balance);
		}
	}
}

public class EventOne {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter initial balance : ");
		int initialBalanceEnteredByUser = in.nextInt();
		Test atm = new Test(initialBalanceEnteredByUser);
		System.out.print("Enter amount to withdraw (daily limit 25K) : ");
		int amountToWithdraw = in.nextInt();
		try {
			atm.withdraw(amountToWithdraw);
		} catch (DailyTransactionLimitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InsufficientAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

}
