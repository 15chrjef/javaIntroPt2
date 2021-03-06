public class CreditCard extends MoneyCard{
	private int creditLimit;

	public CreditCard(int amount){
		balance = 0;
		creditLimit = amount;
	}

	public void makePayment(int amount){
		balance = balance - amount;
	}

	public int getAvailableCredit(){
		return creditLimit - balance;
	}

	public void makePurchase(int amount) {
		if(amount > getAvailableCredit()){
			throw new IllegalArgumentException("Amount exceeds available credit");
		}
		balance = balance + amount;
	}
}