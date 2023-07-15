package org.bahadirmemis.java101;

/**
 * @author bahadirmemis
 */
public class RecursiveMethods {

  public static void main(String[] args) {

    //int total = 0;
    //for (int i = 1; i < 10; i++){
    //  total = total + i;
    //}
    //

    int total = add(9);

    System.out.println(total);

  }

  public static int add(int i){

    if (i > 0){
      int k = i + add(i - 1);
      return k;
    } else {
      return 0;
    }
  }

  /**
   * add(9) = 9 + add(8)  -> 45
   * add(8) = 8 + add(7)  -> 36
   * add (7) = 7 + add(6) -> 28
   * ...                  ....
   * ...                  ....
   * ...                  -> 6
   * add(2) = 2 + add(1); -> 3
   * add(1) = 1 + add(0); -> 1
   * add(0) = 0;
   * */
}
