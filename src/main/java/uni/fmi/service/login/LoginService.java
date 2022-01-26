package uni.fmi.service.login;

import java.util.Collections;
import java.util.List;

import uni.fmi.models.User;

public class LoginService {

	private static List<User> userDb = Collections.singletonList(new User("Ivan", "pass1234"));

	public static String login(String username, String password) {

		if (username == null || password == null) {
			return "Въведете име и парола!";
		}
		boolean isUserExists = userDb.stream()
				.anyMatch(u -> u.getUsername().equals(username) && u.getPassword().equals(password));
		
		
		//if(null.equals(user.getUsername()))->NPE
		//if(user.getUsername().equals(null))->false	
		//"Ivan".equals(username)	
		//username.equals("Ivan")	->NPE
		
			
		
		//boolean isUserExists2 = false;
		//for(User u:userDb) {
		//	if(username.equals(u.getUsername()) && password.equals(u.getPassword())) {
		//		isUserExists2 = true;
		//		break;
		//	}
		//}
		

		return isUserExists ? "Влязохте успешно!" : "Въвели стегрешни данни!";
	}

}
