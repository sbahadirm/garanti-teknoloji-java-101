package org.bahadirmemis.oop.finall.variable;

/**
 * @author bahadirmemis
 */
public class CountryApp {

  public static void main(String[] args) {

    Country country = new Country("Türkiye");
    country.setPopulation(85000000);

    country.setPopulation(85000001);

    //country.setName("Almanya"); // final olduğu için yapılamaz

    String phoneNumber = "344343433";
    System.out.println(phoneNumber);
    phoneNumber = "6347883";
    System.out.println(phoneNumber);

    // local variable
    final String email = "sbahadirm@gmail.com";
    //email = "sdskdsds@sdsd.com";// final olduğu için yapılamaz
  }
}
