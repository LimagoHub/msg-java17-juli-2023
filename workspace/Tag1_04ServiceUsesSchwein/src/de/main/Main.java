package de.main;

import java.lang.reflect.Method;

import de.tiere.Schwein;

public class Main {
	
	public static void main(String[] args) throws Exception{
		Class<?> clazz;
		
		// 1. M�glichkeit
		clazz = Schwein.class;
		
		// 2. M�glichkeit
		Schwein piggy = new Schwein("Miss Piggy");
		clazz = piggy.getClass();
		
		// 3. M�glichkeit
		clazz = Class.forName("de.tiere.Schwein");
		
		System.out.println(clazz.getSimpleName());
		System.out.println("--------------------");
		
		Method [] methods = clazz.getMethods();
		for(Method m: methods) {
			System.out.println(m.getName());
		}
		
		System.out.println("--------------------");
		methods = clazz.getDeclaredMethods();
		for(Method m: methods) {
			System.out.println(m.getName());
		}
		
		System.out.println("--------------------");
		Object object = clazz.getConstructor().newInstance();
		System.out.println(object);
		
		Method m = clazz.getMethod("fuettern");
		m.invoke(object);
		System.out.println(object);
		
		m = clazz.getDeclaredMethod("setGewicht", int.class);
		m.setAccessible(true);
		m.invoke(object, -100);
		System.out.println(object);
	}

}
