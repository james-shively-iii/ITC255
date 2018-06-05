package IndividualCoding;
public class Login {

	public static void login(String user, String pw) {
		Admin a = new Admin();
		user = a.getUserName();
		pw = a.getHashPass();
	}
}
