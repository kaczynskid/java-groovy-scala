package org.ducklings.polyglot;

public class Main {

	public static void main(String[] args) {
		int x = 1;
		
		new MyJavaClass(x++).display();
		new MyGroovyClass(x++).display();
		new MyScalaClass(x++).display();
	}
}
