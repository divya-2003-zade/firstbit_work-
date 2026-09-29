package p1;

public class Login {
	String username="admin";
	String password="12345";
	
	public void validateUsername(String enteredUsername) 
		throws  InvalidUsernameException{
			if(!username.equals(enteredUsername)) {
				throw new InvalidUsernameException("Invalid username.");
			}
					}
		public void validatePassword(String enteredPassword) 
			throws  InvalidPasswordException{
				if(!password.equals(enteredPassword)) {
					throw new InvalidPasswordException("Invalid Password.");
					}
			}
}
	