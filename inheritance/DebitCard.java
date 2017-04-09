import java.beans.DesignMode;

public class DebitCard extends MoneyCard{
	public DebitCard(int amount) {
		balance = amount;
	}

	public void deposit(int amount) {
		balance = balance + amount;
	}
}