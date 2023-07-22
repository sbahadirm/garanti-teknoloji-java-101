package org.bahadirmemis.oop.staticc;

import java.math.BigDecimal;

/**
 * @author bahadirmemis
 */
public class CalculationApp {

  public static void main(String[] args) {

    //static Double invalidDouble = 5.5;
    Double value1 = 5.5;
    Double value2 = 0.5;

    //MathUtil.add(value1, value2);
    MathUtil mathUtil = new MathUtil();
    Double result1 = mathUtil.add(value1, value2);
    Double result2 = mathUtil.subtract(value1, value2);

    System.out.println(result1);
    System.out.println(result2);
    System.out.println(mathUtil.getPi());

    Double result3 = MathStaticUtil.add(value1, value2);
    Double result4 = MathStaticUtil.subtract(value1, value2);
    System.out.println(result3);
    System.out.println(result4);
    System.out.println(MathStaticUtil.getPi());

  }
}
