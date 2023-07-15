package org.bahadirmemis.java101;

/**
 * @author bahadirmemis
 */
public class Method3 {

  public static void main(String[] args) {

    double dValue1 = 5.5d;
    double dValue2 = 15.4d;
    double dValue3 = 56.59d;

    String intParts = getIntParts(dValue1, dValue2, dValue3);

    System.out.println(intParts);
  }

  public static String getIntParts(double x, double y, double z){

    int xi = convertToInt(x);
    int yi = convertToInt(y);
    int zi = convertToInt(z);

    String intParts = "" + xi + yi + zi;

    return intParts;
  }

  public static int convertToInt(double x){
    int xi = (int) x;
    return xi;
  }

}
