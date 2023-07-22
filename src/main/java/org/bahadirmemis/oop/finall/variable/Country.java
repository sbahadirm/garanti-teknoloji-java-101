package org.bahadirmemis.oop.finall.variable;

/**
 * @author bahadirmemis
 */
public final class Country {

  private final String name; // globl variable
  private int population;

  public Country(String name) {
    this.name = name;
  }

  public void setPopulation(int population) {
    this.population = population;
  }

  // final olduğu için yapılamaz
  //public void setName(String name) {
  //  this.name = name;
  //}
}
