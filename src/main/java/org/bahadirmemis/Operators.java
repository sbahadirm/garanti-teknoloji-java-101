package org.bahadirmemis;

/**
 * @author bahadirmemis
 */
public class Operators {

  public static void main(String[] args) {

    int n1 = 5;
    int n2 = 10;
    int n3 = 20;
    int n4 = 4;

    int result1 = n1 + n2 * n3 / n4;
    int result2 = n1 + (n2 * n3 / n4);
    int result3 = n1 * n1 + n2 * n3 - n3 / n4; // 25 + 200 + 5

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(result3);

    //int n5 = n1 + 1;
    int n5 = n1++;
    System.out.println(n5);
    System.out.println(n1);

    int n6 = ++n2;
    System.out.println(n6);
    System.out.println(n2);

    int n7 = --n3;
    System.out.println(n7);
    System.out.println(n3);

    n4 += 2;
    System.out.println(n4);

    int n9 = 9;
    int n10 = 10;

    int mod1 = n10 % n9;
    System.out.println(mod1);

    int mod2 = n10 % 2;
    System.out.println(mod2);

    // yorum satırı

    /*
    sjkdbsnçmd.sd
    sdbsjönds
    * */

    boolean b1 = result1 == result2;
    System.out.println(b1);

    boolean b2 = result1 == result3;
    System.out.println(b2);

    boolean b3  = result1 < result3;
    System.out.println(b3);

    boolean b4  = result1 > result3;
    System.out.println(b4);

    boolean b5  = result1 < result2;
    System.out.println(b5);

    boolean b6  = result1 > result2;
    System.out.println(b6);

    boolean b7  = result1 <= result2;
    System.out.println(b7);

    boolean b8  = result1 >= result2;
    System.out.println(b8);

    boolean b9 = result1 != result2;
    System.out.println(b9);

    boolean b10 = result1 != result3;
    System.out.println(b10);


  }
}
