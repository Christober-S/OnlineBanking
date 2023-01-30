
public class PassBook extends ApplicationForm{

	PassBook(){
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("||||THE BANK||||");
		System.out.println("NAME: "+name);
		System.out.println("ACCOUNT NUMBER: "+accNum);
		System.out.println("ADDRESS: "+address);
		System.out.println("DATE OF OPENING: "+java.time.LocalDate.now());
		System.out.println("BANK NAME: THE BANK");
		System.out.println("PHONE : 04144 225142");
		System.out.println("EMAIL : chennai@thebank.com");
		System.out.println("BANK ADDRESS: D.NO.3/43 GHANDHI NAGAR,\nCHENNAI EGMORE, \nCHENNAI,\nPIN CODE - 600001");
		System.out.println("IFSI CODE - THEB0000321");
		System.out.println("MICR CODE - 6050600083");
		System.out.println("------------------------------------------------------------------------------------------------------------------");
		System.out.println("To Back press '1'");
		int ch = scanner.nextInt();
		if (ch ==1 ) {
			Main main = new Main();
		}
	}

}
