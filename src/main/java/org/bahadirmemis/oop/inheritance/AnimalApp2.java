package org.bahadirmemis.oop.inheritance;

/**
 * @author bahadirmemis
 */
public class AnimalApp2 {

  public static void main(String[] args) {

    Crocodile crocodile = new Crocodile();
    crocodile.name = "timsah fiko";
    crocodile.birthDate = "01.01.2010";
    crocodile.print();

    ButterFly butterFly = new ButterFly();
    butterFly.name = "lucky";
    butterFly.birthDate = "01.07.2023";
    butterFly.print();
  }
}
