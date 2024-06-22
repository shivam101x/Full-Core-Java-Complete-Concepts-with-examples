package Exception;

public class HandleUserException {
	public static void main(String[] args) {
		 
		try {
			
			throw new UserException("User Exception");
		} catch (UserException e) {
			e.printStackTrace();
		}
	}
}
