package de.msg.dependencies.internal;

import de.msg.dependencies.Dependency;

public class DependencyImpl implements Dependency {
	
	private Bar bar = new Bar();
	
	
	public DependencyImpl() {
		System.out.println("ctor DependencyImpl");
	}
	
	@Override
	public void foo() {
		
		System.out.println("Hier ist foo");
	}

	@Override
	public String getName() {
		return "impl";
	}

}
