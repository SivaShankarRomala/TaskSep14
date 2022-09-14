import java.util.Scanner;

public class Main {
	//public static int dueAmount=0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner cc=new Scanner(System.in);
		PaymentStatus p=new PaymentStatus();
		p.accept();
		/*System.out.println("Enter the due amount:");
		
		dueAmount=cc.nextInt();*/
		System.out.println("Enter the mode of payment(cheque/cash/credit):");
		String mode=cc.next();
		if(mode.equals("cash")) {
			Cash c=new Cash();
			c.payAmount();
		} 
		else if(mode.equals("cheque")) {
			Cheque ch=new Cheque();
			ch.payAmount();
		}
		else if(mode.equals("credit")) {
			Credit cr=new Credit();
			cr.payAmount();
		}
	}
}


