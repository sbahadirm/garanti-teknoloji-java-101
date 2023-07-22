package org.bahadirmemis.oop.polymorphism;

/**
 * @author bahadirmemis
 */
public class Dog extends Animal{

  public void hav(){
    System.out.println("hav hav");
  }

  @Override
  public void makeNoise(){
    hav();
  }
}
