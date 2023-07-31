package org.bahadirmemis.oop.collections.map;

/**
 * @author bahadirmemis
 */
public class City {

  private String name;

  public City(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return name;
  }
}
