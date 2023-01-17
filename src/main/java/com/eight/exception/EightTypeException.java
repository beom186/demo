package com.eight.exception;

import java.util.HashMap;

public abstract class EightTypeException extends Throwable {
	public EightTypeException(String message) {
		super(message);
	}
	
	public abstract HashMap toResult();
}
