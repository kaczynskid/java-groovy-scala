package org.ducklings.polyglot

class MyGroovyClass implements Displayable {

	final int x;
	
	MyGroovyClass(int x) {
		this.x = x;
	}

	void display() {
		System.out.println("MyGroovyClass x = " + x)
        System.out.println("From MyJavaClass x = " + new MyJavaClass(x + 5).getX())
        System.out.println("From MyScalaClass x = " + new MyScalaClass(x + 5).getX())
	}

    int getX() {
        x
    }
}
