package com.corp.dao;

import com.corp.model.Numbers;

public interface Chain {

// Defines the next Object to receive the data if this Object can't process it
	
	public void setNextChain(Chain nextChain);
	
	// Either solves the problem or passes the data to the next Object in the chain
	
	public void calculate(Numbers request);
}
