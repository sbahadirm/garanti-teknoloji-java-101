package org.bahadirmemis.oop.encapsulation;

/**
 * @author bahadirmemis
 */
public class Customer {

  private String surname;
  private String identityNo;
  private String phoneNumber;
  private String emailAddress;
  private String birthDate;
  private int id;
  private String name;

  public String getName(){
    return name;
  }

  public void setName(String name){
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getSurname() {
    return surname;
  }

  public String getIdentityNo() {
    return identityNo;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public String getEmailAddress() {
    return emailAddress;
  }

  public String getBirthDate() {
    return birthDate;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setIdentityNo(String identityNo) {
    this.identityNo = identityNo;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void setEmailAddress(String emailAddress) {
    this.emailAddress = emailAddress;
  }

  public void setBirthDate(String birthDate) {
    this.birthDate = birthDate;
  }
}
