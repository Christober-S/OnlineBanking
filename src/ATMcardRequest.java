
public class ATMcardRequest extends OpeningAccount{
	
	public void atmcardRequest(){
		System.out.println("TO APPLY FOR A DEBIT/CREDIT CARD ");
		System.out.println("THE FOLLOWING TO BE NEEDED,");
		System.out.println("1. APPLY LETTER");
		System.out.println("2. PASSPORT SIZE PHOTO");
		System.out.println("3. ADDHAAR XEROX");
		System.out.println("4. PANCARD XEROX");
		System.out.println("PRESS 1 TO SUMBIT");
		int ch = scanner.nextInt();
		if (ch == 1) {
			System.out.println("SUCCESSFULLY APPLIED FOR DEBIT/CREDIT CARD.\nWITHIN 15 BUSSINESS DAYS CARD WILL REACH YOUR HOME");
		}
		System.out.println("To back press '1'");
		int back = scanner.nextInt();
		if (back == 1) {
			Display dis = new Display();
			dis.display();
		}
	}

}
