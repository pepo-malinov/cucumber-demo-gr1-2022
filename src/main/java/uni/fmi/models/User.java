package uni.fmi.models;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class User {

	private String username;
	private String password;
	private Set<Role> roles;
	private Set<Post> posts;
	private Set<Comment> comments;
	private String email;

	/**
	 * Default constructor
	 */
	public User() {
		this(null, null, null);
	}

	public User(final String username, final String password) {
		this(username, password, null);
	}

	public User(String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}

	/**
	 * @return
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username
	 * @return
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 * @return
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return
	 */
	public Set<Role> getRoles() {
		return roles;
	}

	/**
	 * @param roles
	 * @return
	 */
	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}

	/**
	 * @param posts
	 * @return
	 */
	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	/**
	 * @return
	 */
	public Set<Post> getPosts() {
		if (null == posts) {
			posts = new HashSet<Post>();
		}
		return posts;
	}

	/**
	 * @param newPost
	 * @return
	 */
	public void addPost(Post newPost) {
		if (null != newPost) {
			getPosts().add(newPost);
		}
	}

	/**
	 * @param post
	 * @return
	 */
	public void removePost(Post post) {
		if (post != null) {
			getPosts().remove(post);
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

	/**
	 * @param comments
	 * @return
	 */
	public void setCommnets(Set<Comment> comments) {
		if (null != comments) {
			this.comments = comments;
		}
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

}