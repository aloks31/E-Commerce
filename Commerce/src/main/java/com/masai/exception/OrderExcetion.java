package com.masai.exception;

public class OrderExcetion  extends RuntimeException{
	
	public OrderExcetion(){
		
	}
	
	public OrderExcetion(String message){
		super(message);
	}

}
