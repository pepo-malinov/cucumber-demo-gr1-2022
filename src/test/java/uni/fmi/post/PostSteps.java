package uni.fmi.post;

import static org.junit.Assert.assertEquals;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.post.model.PostScreenModel;

public class PostSteps {

	private PostScreenModel postScreenModel;

	@Given("^Потребителя отваря екрана за управление на публикациите$")
	public void openPostScreen() throws Throwable {
		postScreenModel = new PostScreenModel();
	}

	@When("^Добавя заглавие: \"([^\"]*)\"$")
	public void addTitle(final String title) throws Throwable {
		postScreenModel.setTitle(title);
	}

	@When("^Добавя съдържание: \"([^\"]*)\"$")
	public void addContent(final String content) throws Throwable {
		postScreenModel.setContent(content);
	}

	@When("^Натиска бутона публикувай$")
	public void clickCreatePostButton() throws Throwable {
		postScreenModel.clickCreatePostButton();
	}

	@Then("^Вижда съобщение: \"([^\"]*)\"$")
	public void checkMessage(final String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, postScreenModel.getMessage());
	}
}
