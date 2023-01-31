import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApplicationForm extends OpeningAccount {
	
	public void applicationForm() {
		System.out.print("Enter your name: ");
		name = scanner.nextLine();
		System.out.print("Enter your age: ");
		age = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter your Date Of Birth: ");
		dob = scanner.nextLine();
		System.out.print("Enter your phone number: ");
		phno = scanner.nextLong();
		scanner.nextLine();
		
		
		System.out.print("Enter your address: ");
		
		address = scanner.nextLine();
		Random random = new Random();
		long accNum = 0;
		for (int i =0; i<=10; i++) {
			accNum= random.nextInt();
		}
		System.out.println("Pay the intial deposite ammount above 1000");
		System.out.print("Enter how much money you want to deposite: ");
		intialMoney = scanner.nextInt();
		System.out.println("Intial amount "+intialMoney+"Rs has been deposited");
		System.out.println("||To go back press '1'");
		int ch = scanner.nextInt();
		if (ch == 1) {
			Display dis = new Display();
			dis.display();
		}
		

		
	}
}
