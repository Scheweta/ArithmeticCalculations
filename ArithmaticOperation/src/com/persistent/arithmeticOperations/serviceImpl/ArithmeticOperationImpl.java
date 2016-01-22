package com.persistent.arithmeticOperations.serviceImpl;

import com.persistent.arithmaticOperations.service.ArithmaticOperationsService;

public class ArithmeticOperationImpl implements ArithmaticOperationsService{

	public int factorial(int n){
		if(n==0 || n==1)
			return 1;
		else
			return (n*factorial(n-1));
	}
}
