import java.sql.Date;
import java.util.Scanner;

class Cheque extends PaymentStatus{
	String chequeNo;
	int chequeAmount;
	Date dateOfIssue;
	public String getChequeNo() {
		return chequeNo;
	}
	public void setChequeNo(String chequeNo) {
		this.chequeNo = chequeNo;
	}
	public int getChequeAmount() {
		return chequeAmount;
	}
	public void setChequeAmount(int chequeAmount) {
		this.chequeAmount = chequeAmount;
	}
	public Date getDateOfIssue() {
		return dateOfIssue;
	}
	public void setDateOfIssue(Date dateOfIssue) {
		this.dateOfIssue = dateOfIssue;
	}
	public boolean payAmount() {
		Scanner ss=new Scanner(System.in);
		System.out.println("Enter the cheque number");
		chequeNo=ss.next();
		System.out.println("Enter the cheque amount");
		chequeAmount=ss.nextInt();
		System.out.println("Enter the date of issue:");
		String dateOfIssue=ss.next();
		//dateOfIssue=new SimpleDateFormat("dd/MM/yyyy").parse(dateOfIssuedd);
		//System.out.println("Enter the cash amount");
		//int cashAmount=sc.nextInt();
		if(dueAmount>chequeAmount){
			super.payAmount();
			
		}
		else {
			System.out.println("Payment done successfully via cheque");
			return true;
		}
		return true;
	}
}

