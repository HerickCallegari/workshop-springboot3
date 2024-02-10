package com.educandoweb.course.services.exceptions;

public class DataBaseExcepetion extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public DataBaseExcepetion(String msg) {
		super(msg);
	}
}
