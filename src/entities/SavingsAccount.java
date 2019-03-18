package entities;

public final class SavingsAccount extends Account{  //"final" define que a classe n�o pode ser herdada
	
	private Double interestRate;
	
	public SavingsAccount() {
		super();
	}

	public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
		super(number, holder, balance);
		this.interestRate = interestRate;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}
	
	public void updateBalance() {
		balance += balance * interestRate;
	}
	
	@Override								//sobreposi��o
	public final void withdraw(double amount) { //esse m�todo com "final" n�o pode ser sobreposto
		balance -= amount;
	}
}
