package de.msg;

import java.util.ServiceLoader;

import de.msg.dependencies.Dependency;

import java.util.logging.Logger;

public class Main {
	
	private static final Logger logger = Logger.getLogger("Demo");

	public static void main(String[] args) {
		
		
		Dependency dependency = Dependency.create();
		
	
		
		dependency.foo();
		
		System.out.println(dependency.getName());
		
		//Bar bar = new Bar();
		logger.info("Hallo");

	}

}
