package com.eight.result;

import java.util.HashMap;

public class Result {

	public final static HashMap<String, Object> ERROR = new HashMap<String, Object>() {
		{
			put("result_code", -1);
			put("result", "unknown error");
		}
	};
	public final static HashMap<String, Object> SUCCESS = new HashMap<String, Object>() {
		{
			put("result_code", 0);
			put("result", "ok");
		}
	};
	public static final HashMap PARAMETER_ERROR = new HashMap<String, Object>() {
		{
			put("result_code", 1);
			put("result", "parameter error");
		}
	};
	public static final HashMap UNSATISFIED_CONDITION = new HashMap<String, Object>() {
		{
			put("result_code", 2);
			put("result", "unsitisfied condition");
		}
	};
	public static final HashMap TIMEOUT = new HashMap<String, Object>() {
		{
			put("result_code", 3);
			put("result", "timeout error");
		}
	};
	public final static HashMap<String, Object> NO_SUCH_USER = new HashMap<String, Object>() {
		{
			put("result_code", 4);
			put("result", "no user found");
		}
	};
	public final static HashMap<String, Object> NO_SUCH_RESERVATION = new HashMap<String, Object>() {
		{
			put("result_code", 5);
			put("result", "no reservation found");
		}
	};
	public final static HashMap<String, Object> NO_SUCH_REVIEW = new HashMap<String, Object>() {
		{
			put("result_code", 6);
			put("result", "no review found");
		}
	};
	public final static HashMap<String, Object> NO_SUCH_RESOURCE = new HashMap<String, Object>() {
		{
			put("result_code", 7);
			put("result", "no resource found");
		}
	};
	public final static HashMap<String, Object> NO_SUCH_BUSINESS_ITEM = new HashMap<String, Object>() {
		{
			put("result_code", 8);
			put("result", "no business item found");
		}
	};

	
	public static final HashMap SIGNUP_ERROR_EXISTING_ID = new HashMap<String, Object>() {
		{
			put("result_code", 1000);
			put("result", "existing id");
		}
	};
	
	public static HashMap<String, Object> LOGIN_ERROR_NO_USER(String id) {
		HashMap LOGIN_ERROR_NO_USER = new HashMap<String, Object>() {
			{
				put("result_code", 2000);
				put("result", "wrong id - " + id);
			}
		};
		return LOGIN_ERROR_NO_USER;
	}

	public static final HashMap WRONG_PASSWORD_ERROR = new HashMap<String, Object>() {
		{
			put("result_code", 2001);
			put("result", "wrong password");
		}
	};
	
	public static final HashMap INVALID_AUTO_LOGIN_TOKEN_ERROR = new HashMap<String, Object>() {
		{
			put("result_code", 2002);
			put("result", "invalid auto login token");
		}
	};
	
	public static final HashMap DEACTIVATED_USER = new HashMap<String, Object>() {
		{
			put("result_code", 2003);
			put("result", "deactivated user");
		}
	};
	
	public static final HashMap INVALID_ACCESS = new HashMap<String, Object>() {
		{
			put("result_code", 3000);
			put("result", "invalid access");
		}
	};
	
	public static final HashMap NO_AUTHENTICATION = new HashMap<String, Object>() {
		{
			put("result_code", 3001);
			put("result", "access without authentications");
		}
	};
	
	public static final HashMap BUSINESS_LOGIC_ERROR = new HashMap<String, Object>() {
		{
			put("result_code", 4000);
			put("result", "bisiness logic error");
		}
	};
	
	public static final HashMap PAYMENT_ERROR = new HashMap<String, Object>() {
		{
			put("result_code", 5000);
			put("result", "payment error");
		}
	};
	
	public static final HashMap IRREVOCABLE_RESERVATION_ERROR = new HashMap<String, Object>() {
		{
			put("result_code", 6000);
			put("result", "IRREVOCABLE_RESERVATION_ERROR");
		}
	};
	
	public static final HashMap SMS_ERROR = new HashMap<String, Object>() {
		{
			put("result_code", 8000);
			put("result", "sms error");
		}
	};
	
	public static final HashMap NETWORK_ERROR = new HashMap<String, Object>() {
		{
			put("result_code", 9000);
			put("result", "network error");
		}
	};
	
	public static HashMap<String, Object> INVALID_ACCESS(Object result) {
		HashMap<String, Object>r = (HashMap<String, Object>) INVALID_ACCESS.clone();
		r.put("result", result);
		return r;
	}
	
	public static HashMap<String, Object> SUCCESS(Object result) {
		HashMap<String, Object>r = (HashMap<String, Object>) SUCCESS.clone();
		r.put("result", result);
		return r;
	}
	
	public static HashMap PARAMETER_ERROR(Object result) {
		HashMap<String, Object>r = (HashMap<String, Object>) PARAMETER_ERROR.clone();
		r.put("result", result);
		return r;
	}
	
	public static HashMap<String, Object> NO_SUCH_RESOURCE(Object result) {
		HashMap<String, Object>r = (HashMap<String, Object>) NO_SUCH_RESOURCE.clone();
		r.put("result", result);
		return r;
	}
	
	public static HashMap UNSATISFIED_CONDITION(Object result) {
		HashMap<String, Object>r = (HashMap<String, Object>) UNSATISFIED_CONDITION.clone();
		r.put("result", result);
		return r;
	}
	
	public static HashMap TIMEOUT(Object result) {
		HashMap<String, Object>r = (HashMap<String, Object>) TIMEOUT.clone();
		r.put("result", result);
		return r;
	}
	
	public static HashMap NETWORK_ERROR(Object result) {
		HashMap<String, Object>r = (HashMap<String, Object>) NETWORK_ERROR.clone();
		r.put("result", result);
		return r;
	}
	
	public static HashMap WRONG_PASSWORD_ERROR(Object result) {
		HashMap<String, Object>r = (HashMap<String, Object>) WRONG_PASSWORD_ERROR.clone();
		r.put("result", result);
		return r;
	}
	
	public static HashMap BUSINESS_LOGIC_ERROR(Object result) {
		HashMap<String, Object>r = (HashMap<String, Object>) BUSINESS_LOGIC_ERROR.clone();
		r.put("result", result);
		return r;
	}
	
	public static HashMap PAYMENT_ERROR(Object result) {
		HashMap<String, Object>r = (HashMap<String, Object>) PAYMENT_ERROR.clone();
		r.put("result", result);
		return r;
	}
	
	public static HashMap IRREVOCABLE_RESERVATION_ERROR(Object result) {
		HashMap<String, Object>r = (HashMap<String, Object>) IRREVOCABLE_RESERVATION_ERROR.clone();
		r.put("result", result);
		return r;
	}
	
	public static HashMap SMS_ERROR(Object result) {
		HashMap<String, Object>r = (HashMap<String, Object>) SMS_ERROR.clone();
		r.put("result", result);
		return r;
	}
	
	
	
}
