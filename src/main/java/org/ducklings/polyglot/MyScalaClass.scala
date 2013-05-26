package org.ducklings.polyglot

class MyScalaClass(x : Int) extends Displayable {

  def display() {
    println("MyScalaClass x = " + x)
    println("From MyJavaClass x = " + new MyJavaClass(x + 5).getX())
    println("From MyGroovyClass x = " + new MyGroovyClass(x + 5).getX)
  }

  def getX() : Int = {
    x
  }
}