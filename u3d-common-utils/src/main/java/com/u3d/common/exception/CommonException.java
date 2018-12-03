package com.u3d.common.exception;

public class CommonException extends RuntimeException {

	private static final long serialVersionUID = 2451304492176776847L;

	private Integer code = 1;
	
	private String message;
	
	@SuppressWarnings("unused")
	private CommonException() {
	}
	
	public CommonException(String message) {
		this.message = message;
	}
	
	public CommonException(Integer code, String message) {
		this.code = code;
		this.message = message;
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
