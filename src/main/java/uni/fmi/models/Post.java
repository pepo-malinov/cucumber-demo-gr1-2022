package uni.fmi.models;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Post {

	private String title;
	private String content;
	private User owner;
	private Set<Comment> comments;

	/**
	 * Default constructor
	 */
	public Post() {
	}

	/**
	 * @param content
	 * @return
	 */
	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param title
	 * @return
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param owner
	 * @return
	 */
	public void setOwner(User owner) {
		this.owner = owner;
	}

	/**
	 * @return
	 */
	public User getOwner() {
		return owner;
	}

	/**
	 * @param comments
	 * @return
	 */
	public void setComments(Set<Comment> comments) {
		if (null != comments) {
			this.comments = comments;
		}
	}

	/**
	 * @return
	 */
	public Set<Comment> getComments() {
		if (null == comments) {
			comments = new HashSet<Comment>();
		}
		return comments;
	}

}