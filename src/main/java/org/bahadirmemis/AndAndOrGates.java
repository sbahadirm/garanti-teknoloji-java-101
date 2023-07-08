package org.bahadirmemis;

/**
 *
 * true and true = true
 * true and false = false
 * false and true = false
 * false and false = false

 * true or true = true
 * true or false = true
 * false or true = true
 * false or false = false
 *
 * @author bahadirmemis
 */
public class AndAndOrGates {

  public static void main(String[] args) {

    boolean dt = true;
    boolean df  = false;

    boolean r1 = dt && dt;
    System.out.println(r1);

    boolean r2 = dt && df;
    System.out.println(r2);

    boolean r3 = df && dt;
    System.out.println(r3);

    boolean r4 = df && df;
    System.out.println(r4);

    boolean r5 = dt || dt;
    System.out.println(r5);

    boolean r6 = dt || df;
    System.out.println(r6);

    boolean r7 = df || dt;
    System.out.println(r7);

    boolean r8 = df || df;
    System.out.println(r8);
  }
}
