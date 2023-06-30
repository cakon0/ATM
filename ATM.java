package calculator;

import java.util.Scanner;

public class ATM {

	public void initialize(Calculation calculation) {
		int max_trial = 3;

		Login login = new Login();
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome on board!");

		while (true) {
			if (login.login(calculation)) {
				System.out.println("Successfully logged in!");
				break;
			} else {
				System.out.println("Unsuccessful trial!");
				max_trial -= 1;
			}

			if (max_trial == 0) {
				System.out.println("Maximum login trial exceeded.");
				return;
			}
		}

		System.out.println("-----");
		String transactions = "1- View the deposit available\n" + "2- Deposit money\n" + "3- Withdraw money\n"
				+ "4- Transfer money.\n" + "Press Q to exit.";
		System.out.println(transactions);
		System.out.println("-----");

		while (true) {
			System.out.println("Type the transaction code (number)!");
			String code = scanner.nextLine();

			switch (code) {
			case "Q": {
				break;
			}
			case "1": {
				calculation.viewBalance();
				break;
			}
			case "2": {
				System.out.println("Enter the amount you want to deposit.");
				int amount = scanner.nextInt();
				scanner.nextLine();
				calculation.deposit(amount);
				break;
			}
			case "3": {
				System.out.println("Enter the amount you want to withdraw.");
				int amount = scanner.nextInt();
				scanner.nextLine();
				calculation.withdraw(amount);
				break;
			}
			case "4": {
				System.out.println("Enter the full name of the recipient.");
				String recipient = scanner.nextLine();
				System.out.println("Enter the amount you want to withdraw.");
				int amount = scanner.nextInt();
				scanner.nextLine();
				calculation.transfer(recipient, amount);
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + code);
			}
		}

	}

}
