import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class PaymentStatus{
	public static int dueAmount;
	private String mode;
	Scanner sc=new Scanner(System.in);
	public int getDueAmount() {
		return dueAmount;
	}

	public void setDueAmount(int dueAmount) {
		this.dueAmount = dueAmount;
	}
	
	public void accept() {
		//super();
		System.out.println("Enter the due amount:");
		
		dueAmount=sc.nextInt();
	}

	public boolean payAmount() {
		System.out.println("Payment not done and your due amount is "+dueAmount);
		return false;
		
	}
}


