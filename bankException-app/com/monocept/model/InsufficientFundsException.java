package com.monocept.model;

public class InsufficientFundsException extends RuntimeException {

	private String message;
	public InsufficientFundsException(Account acc)
	{
	   this.message="Account no:"+acc.getAccno()+" Name:"+acc.getName()+" insufficient balance "+acc.getBalance(); 
	}
   @Override
   public String getMessage()
   {
	 return message;  
   }
}
