package org.bahadirmemis.oop.polymorphism;

/**
 * @author bahadirmemis
 */
public class Animal {

  protected String name;

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void makeNoise(){
    System.out.println(name + " -> ---");
  }
}
