package org.bahadirmemis.oop.interfaces;

/**
 * @author bahadirmemis
 */
public class Dog implements Animal, Speakable{

  private String name;

  public void hav(){
    System.out.println(" -> hav hav");
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public void setName(String name) {
    this.name = name;
  }

  @Override
  public void makeNoise() {
    System.out.print(name);
    hav();
  }

  @Override
  public void feed() {
    System.out.println("feed dog");
  }
}
