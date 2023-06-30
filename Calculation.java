package calculator;

public class Calculation {
	
	private String username;
	private String password;
	private int deposit;

	public Calculation(String username, String password, int deposit) {
		this.username = username;
		this.password = password;
		this.deposit = deposit;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getDeposit() {
		return deposit;
	}

	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	
	
	// Financial Transactions
	
	public void withdraw (int amount) {
		if ((deposit-amount) > 0) {			
			deposit -= amount;
		}
		else {
			System.out.println("Not enough deposit to proceed this process.");
		}
	}
	
	public void deposit (int amount) {
		deposit += amount;
	}
	
	public void transfer (String recipient, int amount) {
		if ((deposit-amount) > 0) {					
			deposit -= amount;
			System.out.println("Transaction successfully completed. Recipient: " + recipient +"\nAmount transferred: " + amount);
		}
		else {
			System.out.println("Not enough deposit to proceed this process.");
		}
	}
	
	public void viewBalance () {
		System.out.println(deposit);
	}
	
}
