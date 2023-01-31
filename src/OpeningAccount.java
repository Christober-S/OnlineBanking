import java.util.Random;
import java.util.Scanner;

public class OpeningAccount {
	
	public String name;
	public int age;
	public long phno;
	public String dob;
	public String address;
	public int typeOfAcc;
	public long accNum;
	public String dateOfOpening;
	public int intialMoney;
	public int deposite;
	public int withdraw;
	
	Scanner scanner = new Scanner(System.in);
	 public void openacc() {
		System.out.println("Enter type of account: (1=>Current Accout) (2=>Savings Account) (3=>RD Account)");
		typeOfAcc = scanner.nextInt();
		if (typeOfAcc == 1) {
			CurrentAccount current = new CurrentAccount();
			current.currentAccount();
			
		}
		else if (typeOfAcc == 2) {
			SavingsAccount savings =new SavingsAccount();
			savings.savingsAccount();
		}
		else if (typeOfAcc == 3) {
			RDAccount rd =new RDAccount();
			rd.rdAccount();
		}
		else {
			System.out.println("Please! Enter correct option..");
		
		
	}
	 }
}
