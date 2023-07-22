package org.bahadirmemis.oop.polymorphism;

/**
 * @author bahadirmemis
 */
public class Cat extends Animal {

  public void miyav(){
    System.out.println("miyav miyav");
  }

  @Override
  public void makeNoise() {
    miyav();
  }
}
