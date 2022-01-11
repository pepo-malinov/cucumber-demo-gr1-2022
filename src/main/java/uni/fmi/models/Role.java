package uni.fmi.models;

import java.util.HashSet;
import java.util.Set;

/**
 * 
 */
public class Role {

	private String roleCode;
	private Set<User> users;

	/**
	 * Default constructor
	 */
	public Role() {
	}

	/**
	 * @param code
	 * @return
	 */
	public void setRoleCode(String code) {
		this.roleCode = code;
	}

	/**
	 * @return
	 */
	public String getRoleCode() {
		return roleCode;
	}

	/**
	 * @return
	 */
	public Set<User> getUsers() {
		if (null == users) {
			users = new HashSet<User>();
		}
		return users;
	}

	/**
	 * @param users
	 * @return
	 */
	public void setUsers(Set<User> users) {
		if (null != users) {
			this.users = users;
		}
	}

}