package org.bahadirmemis.oop.collections.map;

/**
 * @author bahadirmemis
 */
public class Country {

  private String name;

  public Country(String name) {
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
