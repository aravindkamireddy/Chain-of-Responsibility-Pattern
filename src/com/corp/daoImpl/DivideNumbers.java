package com.corp.daoImpl;

import com.corp.dao.Chain;
import com.corp.model.Numbers;

public class DivideNumbers implements Chain{

	private  Chain nextInChain;
	
	@Override
	public void setNextChain(Chain nextChain) {
		
		nextInChain = nextChain;
		
	}

	@Override
	public void calculate(Numbers request) {
		
		if(request.getCalcWanted().equals("div")){
			
			System.out.println(request.getNumber1() + " / " + request.getNumber2() + " = "+
					(request.getNumber1()/request.getNumber2()));
			
		} else {
			
			System.out.print("Only works for add, sub, mult, and div");
			
		}
	}
}
