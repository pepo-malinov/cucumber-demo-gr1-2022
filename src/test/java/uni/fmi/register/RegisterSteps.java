package uni.fmi.register;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import uni.fmi.register.model.HomeScreenModel;

public class RegisterSteps {

	private HomeScreenModel screenModel;
	public RegisterSteps(final HomeScreenModel homeScreenModel) {
		screenModel = homeScreenModel;
	}

	@Given("^Потребителя отваря екрана за регистрация на потребител$")
	public void openRegisterScreen() throws Throwable {
		//screenModel = new HomeScreenModel();
	}

	@When("^Въвежда потребитесло име: \"([^\"]*)\"$")
	public void addUsername(final String username) throws Throwable {
		screenModel.setUsername(username);
	}

	@When("^Въвежда първа парола: \"([^\"]*)\"$")
	public void addFirstPassword(final String password) throws Throwable {
		screenModel.setFirstPassword(password);
	}

	@When("^Въвежда втора парола: \"([^\"]*)\"$")
	public void addSecondPassword(final String password) throws Throwable {
		screenModel.setSecondPassword(password);
	}

	@When("^Въвежда електронна поща: \"([^\"]*)\"$")
	public void addEmail(final String email) throws Throwable {
		screenModel.setEmail(email);
	}

	@When("^Натиска бутона за регистрация$")
	public void clickRegisterButton() throws Throwable {
		screenModel.clickRegisterButton();
	}

}
