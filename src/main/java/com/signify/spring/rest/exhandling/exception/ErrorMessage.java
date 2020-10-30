package com.signify.spring.rest.exhandling.exception;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ErrorMessage {
	
	private int statusCode;
	private Date timestamp;
	private String message;
	private String description;

}
