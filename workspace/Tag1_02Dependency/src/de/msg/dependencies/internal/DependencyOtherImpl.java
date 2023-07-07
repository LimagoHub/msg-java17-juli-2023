package de.msg.dependencies.internal;

import de.msg.dependencies.Dependency;

public class DependencyOtherImpl implements Dependency {
	
	
	public DependencyOtherImpl() {
		System.out.println("ctor DependencyImpl");
	}
	
	@Override
	public void foo() {
		
		System.out.println("Hier ist foo");
	}
	
	@Override
	public String getName() {
		return "other";
	}

}
