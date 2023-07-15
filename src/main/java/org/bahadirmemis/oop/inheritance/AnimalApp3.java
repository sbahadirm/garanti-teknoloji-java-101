package org.bahadirmemis.oop.inheritance;

/**
 * @author bahadirmemis
 */
public class AnimalApp3 {

  public static void main(String[] args) {

    Bird bird = new Bird();
    bird.name = "Sirin";
    bird.birthDate = "01.01.2023";
    bird.print();
    bird.fly();

    Cat cat = new Cat();
    cat.name = "Erol";
    cat.birthDate = "01.01.2020";
    cat.print();
    //cat.fly(); flying animal değil!
  }
}
