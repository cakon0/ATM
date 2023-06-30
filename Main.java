package calculator;

public class Main {
	public static void main(String [] args) {
		ATM atm = new ATM();
		Calculation calculation = new Calculation("Alex", "123", 10000);
		
		atm.initialize(calculation);
		System.out.println("You are exiting from our system. Thanks for your visit!\n" + "See you!");
	}
}
