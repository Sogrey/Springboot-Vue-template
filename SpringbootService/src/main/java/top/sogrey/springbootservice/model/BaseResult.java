package top.sogrey.springbootservice.model;

public class BaseResult {
	private int code = 0;
	private String message = "";

	public BaseResult(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "BaseResult [code=" + code + ", message=" + message + "]";
	}
}
