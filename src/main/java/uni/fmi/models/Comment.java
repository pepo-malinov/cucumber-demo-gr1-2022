package uni.fmi.models;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Comment {

	private String content;
	private Post post;
	private User owner;
	private Set<Comment> children;
	private Comment mainComent;

	/**
	 * Default constructor
	 */
	public Comment() {
	}

	/**
	 * @return
	 */
	public Comment getMainComment() {
		return mainComent;
	}

	/**
	 * @param comment
	 * @return
	 */
	public void setMainComment(Comment comment) {
		this.mainComent = comment;
	}

	/**
	 * @param children
	 * @return
	 */
	public void setChildren(Set<Comment> children) {
		if (null != children) {
			this.children = children;
		}
	}

	/**
	 * @return
	 */
	public Set<Comment> getChildren() {
		if (null == children) {
			children = new HashSet<Comment>();
		}
		return children;
	}

	/**
	 * @return
	 */
	public Post getPost() {
		return post;
	}

	/**
	 * @param post
	 * @return
	 */
	public void setPost(Post post) {
		this.post = post;
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
	 * @return
	 */
	public String getContent() {
		return content;
	}

	/**
	 * @param newContent
	 * @return
	 */
	public void setContent(String newContent) {
		this.content = newContent;
	}

}