package exception;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class HttpError {
	
	public HttpError() {
		// TODO Auto-generated constructor stub
	}
	private String message;
	
	public String getMessage() {
		return message;
	}
	@Override
	public String toString() {
		return "HttpError [message=" + message + "]";
	}
	public void setMessage(String message) {
		this.message = message;
	}

}
