package org.bahadirmemis.oop.exceptions.helper;

/**
 * @author bahadirmemis
 */
public class Customer {

  private String name;
  private String surname;
  private Phone phone;

  public Customer(String name, String surname, Phone phone) {
    this.name = name;
    this.surname = surname;
    this.phone = phone;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Phone getPhone() {
    return phone;
  }

  public void setPhone(Phone phone) {
    this.phone = phone;
  }
}
