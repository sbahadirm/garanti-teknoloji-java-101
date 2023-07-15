package org.bahadirmemis.oop.arrays;

/**
 * @author bahadirmemis
 */
public class Arrays2 {

  public static void main(String[] args) {

    //String[] students = new String[5];
    //students[0] = "Ali";
    //students[1] = "Veli";
    //students[2] = "Hasan";
    //students[3] = "Hüseyin";
    //students[4] = "Ahmet";

    String[] students = {"Ali", "Veli", "Hasan", "Hüseyin", "Ahmet"};

    for (String student : students) {
      System.out.println(student);
    }
  }
}
