package com.hulkstore.dto;

public class SuccessResponseDTO {

    private String message;

    public SuccessResponseDTO(String message) {
        this.message = message;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
    
    
}
