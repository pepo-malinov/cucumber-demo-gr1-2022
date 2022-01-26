package uni.fmi.service.post;

import java.util.ArrayList;
import java.util.List;

import uni.fmi.models.Post;

public class PostService {

	private static final List<Post> posts = new ArrayList<>();

	public static String createPost(String title, String content) {

		if (content == null || "".equals(content)) {
			return "Въведете съдържание!";
		}

		final Post newPost = new Post();
		newPost.setContent(content);
		newPost.setTitle(title);
		posts.add(newPost);
		return "Успешна публикация";
	}

}
