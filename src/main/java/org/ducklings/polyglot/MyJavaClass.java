package org.ducklings.polyglot;

public class MyJavaClass implements Displayable {

	private final int x;
	
	public MyJavaClass(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	@Override
	public void display() {
		System.out.println("MyJavaClass x = " + x);
        System.out.println("From MyGroovyClass x = " + new MyGroovyClass(x + 5).getX());
        System.out.println("From MyScalaClass x = " + new MyScalaClass(x + 5).getX());
	}
}
