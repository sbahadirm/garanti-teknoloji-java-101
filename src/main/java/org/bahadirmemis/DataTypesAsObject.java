package org.bahadirmemis;

/**
 * @author bahadirmemis
 */
public class DataTypesAsObject {

  public static void main(String[] args) {

    String str1 = "Bahadır";
    String str2 = "Bahadır 12345 ,!/(+%";
    System.out.println(str1);
    System.out.println(str2);

    Integer int1 = 34;
    Integer int2 = Integer.valueOf(35);
    Integer int3 = new Integer(36); // deprecated
    System.out.println(int1);
    System.out.println(int2);
    System.out.println(int3);

    Long long1 = 37L;
    Long long2  = Long.valueOf(38L);
    Long long3 = new Long(39L);
    System.out.println(long1);
    System.out.println(long2);
    System.out.println(long3);

    Boolean b1 = true;
    Boolean b2 = Boolean.valueOf(false);
    Boolean b3 = new Boolean(true);

    System.out.println(b1);
    System.out.println(b2);
    System.out.println(b3);
  }
}
