package com.vs.application;

import java.util.function.Function;

public class Hello  implements Function<String, String>{

	@Override
	public String apply(String t) {
	
		return "Hello"+t;
	}

}
