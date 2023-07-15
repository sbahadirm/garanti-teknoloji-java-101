package org.bahadirmemis.oop.arrays;

/**
 * @author bahadirmemis
 */
public class Arrays1 {

  public static void main(String[] args) {

    int[] ageArray = new int[40];
    ageArray[0] = 32;
    ageArray[9] = 55;

    //for (int age : ageArray) {
    //  System.out.println(age);
    //}

    for (int i = 0; i < ageArray.length; i++){
      int age = ageArray[i];
      System.out.println((i+ 1) + ". index: " +  age);
    }
  }
}
