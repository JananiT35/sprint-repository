
public class UserDefinedExceptionDemo {
	public static void main(String[] args) {
		        UserRegistration registration = new UserRegistration();
		        try {
		            registration.validateEmail("invalid-email");
		        } catch (InvalidEmailException e) {
		            System.out.println("Caught checked exception: ");
		        }
		        try {
		            registration.validatePassword("123");
		        } catch (InvalidPasswordException e) {
		            System.out.println("Caught unchecked exception ");
		        }
		    }
}
class UserRegistration {
    public void validateEmail(String email) throws InvalidEmailException {
        if (email ==null) {
            throw new InvalidEmailException("Invalid email address."+email);
        }
        System.out.println("Email is valid."+email);
    }

    public void validatePassword(String password) {
        if ( password.length() < 6) {
            throw new InvalidPasswordException("Password must be at least 6 characters long.");
        }
        System.out.println("Password is valid.");
    }
}
class InvalidEmailException extends Exception {
 public InvalidEmailException(String message) {
     super(message);
 }
}
class InvalidPasswordException extends RuntimeException {
 public InvalidPasswordException(String message) {
     super(message);
 }
}

