package com.javasampleapproach.jqueryajax.message;

public class Response2 {
	private String status;
	private Object data;
	private String message;

	public Response2(){

	}

	public Response2(String status, Object data, String message) {
		this.status = status;
		this.data = data;
		this.message = message;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
