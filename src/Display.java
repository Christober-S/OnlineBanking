import java.util.Scanner;

public class Display extends ApplicationForm{

	public void display() {

		Scanner scanner = new Scanner(System.in);
		System.out.println("---|||WELCOME TO THE BANK|||---");
		System.out.println("1. Opening new account");
		System.out.println("2. Deposite money");
		System.out.println("3. Withdraw money");
		System.out.println("4. To check Balance");
		System.out.println("5. PassBook");
		System.out.println("6. ATM card request");
		System.out.print("Enter your choice : ");
		
		OpeningAccount openingAccount = new OpeningAccount();
		DepositeMoney depositeMoney = new DepositeMoney();
		WithdrawMoney withdrawMoney = new WithdrawMoney();
		PassBook passBook = new PassBook();
		ATMcardRequest atmcardRequest = new ATMcardRequest();
		
		
		int ch = scanner.nextInt();
		if (ch == 1) {
			OpeningAccount opening = new OpeningAccount();
			opening.openacc();
		}
		else if (ch == 2) {
			DepositeMoney deposite =new DepositeMoney();
			deposite.depositeMoney();
			
		}
		else if (ch == 3) {
			WithdrawMoney withdraw =new WithdrawMoney();
			withdraw.withdrawMoney();
		}
		else if ( ch == 4) {
			Balance bal = new Balance();
			bal.balance();
		}
		else if (ch == 5) {
			PassBook passbook = new PassBook();
			passbook.passBook();
		}
		else if (ch == 6) {
			ATMcardRequest atm = new ATMcardRequest();
			atm.atmcardRequest();
		}
		else {
			System.out.println("Invalid choice");
		}
	}
	}

