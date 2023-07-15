package org.bahadirmemis.oop.banking;

/**
 * @author bahadirmemis
 */
public class Customer {

  int id;
  String name;
  String surname;
  String identityNo;
  String phoneNumber;
  String emailAddress;
  String birthDate;

  public Customer(){

  }

  public Customer(String fullName){

    String[] strings = fullName.split(" ");

    String name = strings[0];
    String surname = strings[1];

    this.name = name;
    this.surname = surname;
  }

  public Customer(String name, String surname){
    this.name = name;
    this.surname = surname;
  }

  /**
   * Customer(String, String, String)
   */
  public Customer(String name, String surname, String identityNo){
    this.name = name;
    this.surname = surname;
    this.identityNo = identityNo;
  }

  ///**
  // * üstteki ile aynı imzalı constructor -> Customer(String, String, String)
  // */
  //public Customer(String name, String surname, String phoneNumber){
  //  this.name = name;
  //  this.surname = surname;
  //  this.phoneNumber = phoneNumber;
  //}

  public Customer(int id, String name, String surname, String identityNo, String phoneNumber, String emailAddress, String birthDate){
    this.id = id;
    this.name = name;
    this.surname = surname;
    this.identityNo = identityNo;
    this.phoneNumber = phoneNumber;
    this.emailAddress = emailAddress;
    this.birthDate = birthDate;
  }

  public void openAccount(){

    System.out.println(name + " " + surname + " için hesap açıldı!");
    System.out.println("Kişi bilgileri: tc: " + identityNo + " --- mail: " + emailAddress);
  }

  public static void testStatic(){
    System.out.println("Static metot çağtıldı");
  }
}
