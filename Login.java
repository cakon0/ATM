package calculator;

import java.util.Scanner;

public class Login {

	public boolean login (Calculation calculation) {
		Scanner scanner = new Scanner(System.in);
		String username;
		String password;
		
		System.out.println("Username: ");
		username = scanner.nextLine();
		System.out.println("Password: ");
		password = scanner.nextLine();
		
		if(calculation.getUsername().equals(username) && calculation.getPassword().equals(password)) {
			return true;
		}  
		else {			
			return false;
		}
	}
}
