import java.util.Scanner;

class Cash extends PaymentStatus{
	int cashAmount;

	public int getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(int cashAmount) {
		this.cashAmount = cashAmount;
	}
	public boolean payAmount() {
		Scanner sc=new Scanner(System.in);
		
		
			System.out.println("Enter the cash amount");
			int cashAmount=sc.nextInt();
			if(dueAmount>cashAmount){
				super.payAmount();
				
			}
			else {
				System.out.println("Payment done successfully via cash");
				return true;
			}
		
	  return true;
	}
}



