package top.sogrey.springbootservice.model;

import java.util.List;

public class UserListResult extends BaseResult {

	private List<AppUser> appUsers;

	public UserListResult(int code, String message) {
		super(code, message);
	}

	public List<AppUser> getAppUsers() {
		return appUsers;
	}

	public void setAppUsers(List<AppUser> appUser) {
		this.appUsers = appUser;
	}

	@Override
	public String toString() {
		return "UserListResult [appUsers=" + appUsers + "]";
	}

}
