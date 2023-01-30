import java.util.Random;
import java.util.Scanner;

public class OpeningAccount {
	
	String name;
	int age;
	long phno;
	String dob;
	String address;
	int typeOfAcc;
	long accNum;
	String dateOfOpening;
	int intialMoney;
	int deposite;
	int withdraw;
	
	Scanner scanner = new Scanner(System.in);
	OpeningAccount(){
		System.out.println("Enter type of account: (1=>Current Accout) (2=>Savings Account) (3=>RD Account)");
		typeOfAcc = scanner.nextInt();
		if (typeOfAcc == 1) {
			new CurrentAccount();
		}
		else if (typeOfAcc == 2) {
			new SavingsAccount();
		}
		else if (typeOfAcc == 3) {
			new RDAccount();
		}
		else {
			System.out.println("Please! Enter correct option..");
		}
		
		
	}
}
