package org.bahadirmemis.oop.inheritance;

/**
 * @author bahadirmemis
 */
public class AnimalApp {

  public static void main(String[] args) {

    Cat cat = new Cat();
    cat.name = "erol";
    cat.birthDate = "01.01.2014";

    Dog dog = new Dog();
    dog.name = "sarı";
    dog.birthDate = "01.01.2006";

    System.out.println(cat.name);
    System.out.println(dog.name);

    cat.print();
    dog.print();
  }
}
