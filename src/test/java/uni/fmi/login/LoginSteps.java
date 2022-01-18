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

	@When("^Въведе валидно потребителско име$")
	public void addUserName() throws Throwable {
		model.setUsername("Ivan");
	}

	@When("^въведе валидна парола$")
	public void addPassword() throws Throwable {
		model.setPassword("pass1234");
	}

	@When("^натисне бутона за вход в системата$")
	public void clickLoginButton() throws Throwable {
		model.clickLoginButton();
	}

	@Then("^Вижда съобщение за успех$")
	public void checkMessage() throws Throwable {
		assertEquals("Влязохте успешно!", model.getMessage());
	}
	
	@Then("^Вижда съобщение за липса на данни$")
	public void checkForMissingData() throws Throwable {
		assertEquals("Въведете име и парола!", model.getMessage());
	}

}
