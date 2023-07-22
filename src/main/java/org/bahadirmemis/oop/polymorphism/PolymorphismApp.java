package org.bahadirmemis.oop.polymorphism;

/**
 * @author bahadirmemis
 */
public class PolymorphismApp {

  public static void main(String[] args) {

    Animal animal = new Animal();
    animal.setName("animal1");

    //Cat cat = new Cat();
    Animal cat = new Cat();
    cat.setName("cat1");
    //cat.miyav();

    //System.out.println(cat.getName());
    printName(cat);
    //System.out.println(animal.getName());
    printName(animal);

    //Dog dog = new Dog();
    Animal dog = new Dog();
    dog.setName("dog1");
    printName(dog);
    //dog.hav();

    Dog dog2 = new Dog();
    dog2.setName("dog2");
    dog2.hav();

    Cat cat2 = new Cat();
    cat2.miyav();
    cat2.setName("cat1");

    printName(dog2);
    Animal animal2 = dog2;
    printName(animal2);

    System.out.println("------------------");
    cat2.makeNoise();
    dog2.makeNoise();
  }

  //private static void printName(Cat cat){
  //  System.out.println("catli");
  //  System.out.println(cat.getName());
  //}

  private static void printName(Animal animal){
    System.out.println("animallı");
    System.out.println(animal.getName());
  }

  //private static void printName(Dog dog){
  //  System.out.println("doglu");
  //  System.out.println(dog.getName());
  //}
}
