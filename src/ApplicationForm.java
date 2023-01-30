import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ApplicationForm extends OpeningAccount {
	
	ApplicationForm(){
	
	System.out.print("Enter your name: ");
	name = scanner.nextLine();
	System.out.print("Enter your age: ");
	age = scanner.nextInt();
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
	System.out.println("Pay the intial ammount above 1000");
	intialMoney = scanner.nextInt();
	
	
}
}
