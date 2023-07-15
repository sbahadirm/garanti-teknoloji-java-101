package org.bahadirmemis.java101;

/**
 * @author bahadirmemis
 */
public class Overloading {

  public static void main(String[] args) {

    int i1 = 5;
    int i2 = 10;

    int total1 = add(i1, i2);
    System.out.println(total1);

    double d1 = 5.5;
    double d2 = 4.2;

    double total2 = add(d1,d2);
    System.out.println(total2);

    add(i1, i2);
  }

  public static int add(int i1, int i2){
    return i1 + i2;
  }

  //
  //public static double add(int i1, int i2){
  //  return i1 + i2;
  //}

  /**
   * f(x)
   * f(x,y,z)
   */
  public static double add(double d1, double d2){
    return d1 + d2;
  }

  public static int add(int d1, double d2){
    return d1 + (int) d2;
  }

  // bu şekilde olmaz.
  //public static int add(double d1, double d2){
  //  return (int) d1 + (int) d2;
  //}
}
