package org.bahadirmemis.oop.finall.method;

/**
 * @author bahadirmemis
 */
public class Shape {

  protected String name;

  public Shape(String name) {
    this.name = name;
  }

  public final void print(){
    System.out.println(name);
  }
}
