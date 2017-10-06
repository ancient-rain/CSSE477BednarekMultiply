package edu.rosehulman.csse477.calculator.bednartd;

import edu.rosehulman.csse477.calculator.api.IOp;

public class Multiply implements IOp {

	@Override
	public double execute(double... args) {
		if(args == null || args.length == 0)
			return 0;
		double product = 1;
		for(double arg: args) {
			product *= arg;
		}
		return product;
	}

}
