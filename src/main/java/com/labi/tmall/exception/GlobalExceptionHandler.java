package com.labi.tmall.exception;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ControllerAdvice
public class GlobalExceptionHandler {
	@ExceptionHandler(value=Exception.class)
	public String defaultErrorHandler(HttpServletRequest req, Exception e)throws Exception{
		e.printStackTrace();
		Class constrainViolationException = Class.forName("org.hibernate.exception.ConstrainViolationException");
		if(null!=e.getCause() && constrainViolationException == e.getCause().getClass()){
			return "违反了约束，多半是外键约束";
		}
		return e.getMessage();
	}

}
