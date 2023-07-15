package org.bahadirmemis.java101;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author bahadirmemis
 */
public class ForeEachLoop {

  public static void main(String[] args) {

    //List<String> stringList = Arrays.asList("sadik", "bahadir", "memiş", "yusuf", "ugurcan", "erdinç", "berat");
    //System.out.println(stringList);
    List<String> stringList = new ArrayList<>();
    stringList.add("bahadir");
    stringList.add("sadik");

    /** for (int i = 0; i < 7; i++) {*/
    //for (int i = 0; i < stringList.size(); i++){
    //  String eachValue = stringList.get(i);
    //  System.out.println(eachValue);
    //}

    for (String eachValue : stringList) {
        System.out.println(eachValue);
    }

    List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
    /**
     * for
     * (
     * Data Type
     * data type a verilen değişken ismi
     * :
     * liste/array
     * )
     */
    for (Integer i : integerList) {
      System.out.println(i);
    }

    List<Boolean> booleanList = new ArrayList<>();
    booleanList.add(true);
    booleanList.add(false);
    for (Boolean berat : booleanList) {
      System.out.println(berat);
    }
  }
}
