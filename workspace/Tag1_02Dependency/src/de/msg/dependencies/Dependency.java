package de.msg.dependencies;

import java.util.ServiceLoader;

import de.msg.dependencies.internal.Bar;

public interface Dependency {

	
	String getName();
	void foo();
	
	default Bar getBar() {
		return new Bar();
	}

	static Dependency create() {
		ServiceLoader<Dependency> loader = ServiceLoader.load(Dependency.class);
		return loader.findFirst().get();
	
	}
}