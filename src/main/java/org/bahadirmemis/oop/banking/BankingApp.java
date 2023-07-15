package org.bahadirmemis.oop.banking;

/**
 * @author bahadirmemis
 */
public class BankingApp {

  public static void main(String[] args) {

    //Customer.openAccount(); // yapamayız!
    Customer.testStatic();

    Customer customerSbm = new Customer();
    customerSbm.id= 1;
    customerSbm.name = "bahadır";
    customerSbm.surname = "memiş";
    customerSbm.identityNo = "123232323";
    customerSbm.emailAddress = "sbahadirm@gmail.com";
    customerSbm.phoneNumber = "05468447654";
    customerSbm.birthDate = "05-10-1991";
    customerSbm.openAccount();
    //openAccount(customerSbm);

    Customer customerMaa = new Customer();
    customerMaa.id= 1;
    customerMaa.name = "mehmet ali";
    customerMaa.surname = "akar";
    customerMaa.identityNo = "5367836";
    customerMaa.emailAddress = "maa@gmail.com";
    customerMaa.phoneNumber = "05468111654";
    customerMaa.birthDate = "06-11-1999";
    customerMaa.openAccount();
    //openAccount(customerMaa);

    Customer customerBerat = new Customer("berat", "arslan");
    customerBerat.id= 1;
    customerBerat.identityNo = "55555555";
    customerBerat.emailAddress = "berat@gmail.com";
    customerBerat.phoneNumber = "05468111654";
    customerBerat.birthDate = "15-11-1999";
    customerBerat.openAccount();

    Customer customerZiya = new Customer(1, "ziya", "sarıcan", "132443", "054444444", "ziya@sarican.com", "03-03-2000");
    customerZiya.openAccount();

    Customer customerSumeyye = new Customer("Sümeyye Saban");
    customerSumeyye.openAccount();

    //for (int i = 1; i < 100; i ++){
    //  Customer customer = new Customer();
    //  customer.id= 1;
    //  customer.name = "ahmet" + i;
    //  customer.surname = "yılmaz" + i;
    //  customer.identityNo = (5367836 * i) + "2";
    //  customer.emailAddress = "maa" + i + "@gmail.com";
    //  customer.phoneNumber = "05468111" + i;
    //  customer.birthDate = "06-11-1999";
    //  customer.openAccount();
    //  //openAccount(customer);
    //}
  }

  //public void openAccount(Customer customer){
  //
  //  System.out.println(customer.name + " " + customer.surname + " için hesap açıldı!");
  //  System.out.println("Kişi bilgileri: tc: " + customer.identityNo + " --- mail: " + customer.emailAddress);
  //}
}
