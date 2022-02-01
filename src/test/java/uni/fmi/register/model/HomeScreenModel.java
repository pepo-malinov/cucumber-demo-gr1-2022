package uni.fmi.register.model;

import uni.fmi.register.service.RegisterService;
import uni.fmi.service.login.LoginService;

public class HomeScreenModel {
	private String username;
	private String password;
	private String firstPassword;
	private String secondPassword;
	private String email;
	private String message;

	public void setUsername(final String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void clickLoginButton() {
		message = LoginService.login(username, password);
	}

	public String getMessage() {
		return message;
	}
	
	public void setFirstPassword(final String password) {
		this.firstPassword = password;

	}

	public void setSecondPassword(final String password) {
		this.secondPassword = password;

	}

	public void setEmail(final String email) {
		this.email = email;

	}

	public void clickRegisterButton() {
		this.message = RegisterService.register(username, firstPassword, secondPassword, email);
	}

}
