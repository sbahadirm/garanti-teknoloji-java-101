package org.bahadirmemis.oop.interfaces;

/**
 * @author bahadirmemis
 */
public class Cat implements Animal, Speakable{

  private String name;

  public void miyav(){
    System.out.println(" -> miyav miyav");
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
    miyav();
  }

  @Override
  public void feed() {
    System.out.println("feed cat");
  }
}
