package org.bahadirmemis.java101;

import java.util.Scanner;

/**
 * @author bahadirmemis
 */
public class Methods2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Kullanıcı adını giriniz:");
    String username = scanner.nextLine();

    if ("admin".equals(username)){ // "admin" == username
      //System.out.println("admin kullanıcı ile sisteme giriş yapılmaya çalışıldı ve izin verildi. "
      //                   + "Şu anda kullanıcı sisteme girdi.");
      printUserAction(username);
    } else if ("user".equals(username)){
      //System.out.println("user kullanıcı ile sisteme giriş yapılmaya çalışıldı ve izin verildi."
      //                   + "Şu anda kullanıcı sisteme girdi.");
      printUserAction(username);
    } else {
      System.out.println("Yetkisiz kullanıcı");
    }


  }

  public static void printUserAction(String username){
    String action = username + " kullanıcı ile sisteme giriş yapılmaya çalışıldı ve izin verildi. "
                    + "Şu anda kullanıcı sisteme girdi.";
    System.out.println(action);
  }
}
