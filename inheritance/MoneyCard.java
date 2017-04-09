public class MoneyCard{
	protected int balance;
	public int getBalance(){
		return balance;
	}
	public void makePurchase(int amount){
		if(balance < amount){
			throw new IllegalArgumentException("Amount exceeds balance");
		}
		
		balance = balance - amount;
	}
}