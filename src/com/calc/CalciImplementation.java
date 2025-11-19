package com.calc;

public class CalciImplementation  implements Calc{

	@Override
	public int add(int a, int b) {
		// Addition features
		
		return a+b;
	}

	@Override
	public double sub(int a, int b) {
// subtracted
		int c=a-b;
		return c;
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}

	@Override
	public double dev(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

}
