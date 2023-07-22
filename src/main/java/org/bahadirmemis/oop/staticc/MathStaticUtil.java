package org.bahadirmemis.oop.staticc;

/**
 * @author bahadirmemis
 */
public class MathStaticUtil {

  private static final Double PI;

  static {
    PI = 3.14;
  }

  public static Double add(Double value1, Double value2){
    //static Double invalid = 2.2;
    return value1 + value2;
  }

  public static Double subtract(Double value1, Double value2){
    return value1 - value2;
  }

  public static Double multiply(Double value1, Double value2){
    return value1 * value2;
  }

  public static Double divide(Double value1, Double value2){
    return value1 / value2;
  }

  public static Double getPi() {
    return PI;
  }
}
