package p1;

import java.util.Scanner;

public class LoginTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		Login log = new Login();
		
		System.out.print("Enter username:");
		String enteredusername = sc.nextLine();
		
		//userName validation
		try {
			log.validateUsername(enteredusername);
		}catch(InvalidUsernameException e) {
			System.out.println(e.getMessage());
			return ;
		}
		//Password validation
		int attempts = 3;
		while(attempts > 0) {
			System.out.print("Enter Password:");
			String enteredPassword = sc.nextLine();
		try {
			log.validatePassword(enteredPassword);
			System.out.println("Login Successfully!!");
			return;
		}catch(InvalidPasswordException e) {
			attempts--;
			System.out.println(e.getMessage());
			if(attempts > 0) {
				System.out.println("remaining attempts : "+attempts);
			}
			
		}
	}
	System.out.println("Account Locked!!");
	sc.close();
 }
}
