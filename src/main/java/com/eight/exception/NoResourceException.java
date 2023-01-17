package com.eight.exception;

import com.eight.result.Result;

import java.util.HashMap;

public class NoResourceException extends EightTypeException {
	
	public NoResourceException(String message) {
		super(message);
	}
	
	public NoResourceException(String className, Object id) {
		super(new StringBuilder("No ").append(className).append(" with id ").append(id).toString());
	}

	@Override
	public HashMap toResult() {
		return Result.NO_SUCH_RESOURCE(getMessage());
	}

}
