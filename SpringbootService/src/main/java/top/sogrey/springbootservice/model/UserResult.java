package top.sogrey.springbootservice.model;

public class UserResult extends BaseResult{
	
	private AppUser appUser;

	public UserResult(int code, String message) {
		super(code, message);
	}

	public AppUser getAppUser() {
		return appUser;
	}

	public void setAppUser(AppUser appUser) {
		this.appUser = appUser;
	}

	@Override
	public String toString() {
		return "UserResult [appUser=" + appUser + "]";
	}

	
}
