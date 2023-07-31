package org.bahadirmemis.oop.collections.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @author bahadirmemis
 */
public class MapApp2 {

  public static void main(String[] args) {

    Map<String, String> usernamePasswordMap = new HashMap<>();
    usernamePasswordMap.put("sbahadirm", "123");
    usernamePasswordMap.put("yusuf", "077");
    System.out.println(usernamePasswordMap);
    usernamePasswordMap.put("yusuf", "018");

    System.out.println(usernamePasswordMap);
  }
}
