package uni.fmi.post.model;

import uni.fmi.service.post.PostService;

public class PostScreenModel {

	private String title;
	private String content;
	private String message;

	public void setTitle(final String title) {
		this.title = title;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void clickCreatePostButton() {
		message= PostService.createPost(title, content);

	}

	public String getMessage() {
		return message;
	}

}
