import java.util.Scanner;

class Credit extends PaymentStatus{
	int creditCardNo;
	String cardType;
	int creditCardAmount;
	public int getCreditCardNo() {
		return creditCardNo;
	}
	public void setCreditCardNo(int creditCardNo) {
		this.creditCardNo = creditCardNo;
	}
	public String getCardType() {
		return cardType;
	}
	public void setCardType(String cardType) {
		this.cardType = cardType;
	}
	public int getCreditCardAmount() {
		return creditCardAmount;
	}
	public void setCreditCardAmount(int creditCardAmount) {
		this.creditCardAmount = creditCardAmount;
	}
	public boolean payAmount() {
		//super.payAmount();
		Scanner ps=new Scanner(System.in);
		int res=0;
		System.out.println("Enter the credit card number");
		creditCardNo=ps.nextInt();
		System.out.println("Enter the cardType(silver,gold,platinum):");
		cardType=ps.next();
		if(cardType.equals("silver")) {
			creditCardAmount=10000;
			res=(int)(2*dueAmount/100);
			//System.out.println(dueAmount);
			//System.out.println(res);
		}
		else if(cardType.equals("gold"))
		{
			creditCardAmount=50000;
			res=(int)5/100*(dueAmount);
		}
		else if(cardType.equals("platinum"))
		{
			creditCardAmount=100000;
			res=(int)10/100*(dueAmount);
		}
		
		if(dueAmount>creditCardAmount){
			super.payAmount();
		}
		else {
			creditCardAmount=creditCardAmount-dueAmount-res;
			System.out.println("Payment done successfully via credit card.Remaining amount in your "+cardType+"card is "+creditCardAmount );
			return true;
		
	}
	return true;
}
}


