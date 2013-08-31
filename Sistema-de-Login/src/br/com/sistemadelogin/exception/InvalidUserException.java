package br.com.sistemadelogin.exception;

import javax.servlet.ServletException;

public class InvalidUserException extends ServletException {
	  public InvalidUserException(String message){
		  super(message);
	  }

}
