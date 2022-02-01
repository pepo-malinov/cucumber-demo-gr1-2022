package uni.fmi.register.service;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import uni.fmi.models.User;

public class RegisterService {

	public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$",
			Pattern.CASE_INSENSITIVE);
	private static List<User> usersDb = new ArrayList<>();

	public static String register(final String username, final String firstPassword, final String secondPassword,
			final String email) {

		initDb();

		if (firstPassword.isBlank() || secondPassword.isBlank()) {
			return "Въведете парола!";
		}
		
		if (firstPassword.length() < 4) {
			return "Въведете парола с поне четери знака!";
		}

		final boolean isUsernameExists = usersDb.stream().anyMatch(u -> u.getUsername().equals(username));
		if (isUsernameExists) {
			return "Потребителското име е заето!";
		}
		final boolean isEmailExists = usersDb.stream().anyMatch(u -> u.getEmail().equals(email));
		if (isEmailExists) {
			return "Има регистриран потребител с тази поща!";
		}

		if (email.isBlank()) {
			return "Въведете електронна поща!";
		}
		if (username.isBlank()) {
			return "Въведете потребитеско име!";
		}
		
		if(!firstPassword.equals(secondPassword)) {
			return "Въведете еднакви пароли!";
		}

		if (!isEmailValid(email)) {

			return "Въведете валидна електронна поща!";
		}
		if (username.length() < 3) {
			return "Въведете име с поне три знака!";
		}

		final User newUser = new User(username, firstPassword, email);
		usersDb.add(newUser);
		return "Регистрирахте се успешно!";
	}

	private static void initDb() {
		usersDb.clear();
		usersDb.add(new User("Pesho1", "Pass123!", "pesho1@abv.bg"));
		usersDb.add(new User("Pesho3", "Pass123!", "pesho2@abv.bg"));
	}

	public static boolean isEmailValid(final String emailStr) {
		final Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
		return matcher.find();
	}

}
