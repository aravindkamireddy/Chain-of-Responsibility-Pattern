package com.corp.daoImpl;

import com.corp.dao.Chain;
import com.corp.model.Numbers;

public class SubtractNumbers implements Chain{

	private  Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getCalcWanted().equals("sub")){
			
			System.out.println(request.getNumber1() + " - " + request.getNumber2() + " = "+
					(request.getNumber1()-request.getNumber2()));
			
		} else {
			
			nextInChain.calculate(request);
			
		}
		
	}

	
	
}
