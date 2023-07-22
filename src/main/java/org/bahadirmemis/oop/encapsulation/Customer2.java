package org.bahadirmemis.oop.encapsulation;

/**
 * @author bahadirmemis
 */
public class Customer2 {

  private int id;
  private String name;
  private String surname;
  private String identityNo;
  private String phoneNumber;
  private String emailAddress;
  private String birthDate;

  public Customer2 testThis(){
    return this;
  }

  public Customer2(int id, String name, String surname, String identityNo, String phoneNumber, String emailAddress,
                   String birthDate) {
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.identityNo = identityNo;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
    this.birthDate = birthDate;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
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

  public void setName(String name) {
    this.name = name;
  }
}
