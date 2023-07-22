package org.bahadirmemis.oop.interfaces;


/**
 * @author bahadirmemis
 */
public class InterfaceApp {

  public static void main(String[] args) {

    Cat cat = new Cat();
    cat.setName("cat");

    Dog dog = new Dog();
    dog.setName("dog");

    printNameFeedAndMakeNoise(cat);
    printNameFeedAndMakeNoise(dog);

    makeNoise(cat);
    makeNoise(dog);
  }


  private static void printNameFeedAndMakeNoise(Animal animal){
    System.out.println(animal.getName());
    animal.feed();
    animal.makeNoise();
  }

  private static void makeNoise(Speakable speakable){
    speakable.makeNoise();
  }
}
