package chapter8;



public class CheckingAccount extends BankAccount {
	
	private SavingsAccount protectedBy;

	public CheckingAccount(int balance) {
		super(balance);
	}
	
	public CheckingAccount(int balance, SavingsAccount protectedBy) {
		super(balance);
		this.protectedBy = protectedBy;
	}
	

	@Override
	public boolean withdraw(int amount) {
		if (amount > balance) {
			protectedBy.withdraw(amount - balance);
			balance = 0;
			return true;
		}
		return super.withdraw(amount);
	}
	public String getAccountType() {
		return "λΉμ’μν";
	}
}
