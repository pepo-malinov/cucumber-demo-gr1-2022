package uni.fmi.login;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.login.model.LoginScreenModel;

public class LoginSteps {

	private LoginScreenModel model;

	@Given("^Потребителя отваря екрана за вход в системата$")
	public void openLoginScreen() {
		model = new LoginScreenModel();
	}

	@When("^Въведе \"([^\"]*)\" потребителско име$")
	public void addUserName(final String username) {
		model.setUsername(username);
	}

	@When("^въведе парола: \"([^\"]*)\"$")
	public void addPassword(final String password) {
		model.setPassword(password);
	}

	@When("^натисне бутона за вход в системата$")
	public void clickLoginButton() {
		model.clickLoginButton();
	}

	@Then("^Вижда съобщение: \"([^\"]*)\"$")
	public void checkMessage(final String expectedMessage) {
		assertEquals(expectedMessage, model.getMessage());
	}

}
