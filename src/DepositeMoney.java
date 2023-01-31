
public class DepositeMoney extends ApplicationForm{
	
	public void depositeMoney(){
		System.out.print("Enter how much money to deposite: ");
		deposite = scanner.nextInt();
		System.out.println("RS."+deposite+" has been credited to you account");
		intialMoney = intialMoney + deposite;
		
	}

}
