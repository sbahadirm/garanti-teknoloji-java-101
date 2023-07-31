package org.bahadirmemis.oop.collections.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author bahadirmemis
 */
public class MapApp {

  /**
   * Ülkeler ve şehirleri:
   *
   * Türkiye
   * 01- Adana
   * 02- Adıyaman
   * 03 - Afyon
   * .........
   * 18 - Çankırı
   * ........
   * 81 - Düzce
   *
   * Almanya:
   * -
   *
   *
   *
   * Fransa:
   *
   *
   * @param args
   */
  public static void main(String[] args) {

    Country turkey = new Country("Türkiye");
    City adana = new City("Adana");
    City adiyaman = new City("Adıyaman");
    City duzce = new City("Düzce");
    List<City> turkeyCityList = Arrays.asList(adana, adiyaman, duzce);

    Country germany = new Country("Almanya");
    City berlin = new City("Berlin");
    City munich = new City("Munich");
    List<City> germanyCityList = new ArrayList<>();
    germanyCityList.add(berlin);
    germanyCityList.add(munich);

    Map<Country, List<City>> countryCitysMap = new HashMap<>();
    countryCitysMap.put(turkey, turkeyCityList);
    countryCitysMap.put(germany, germanyCityList);

    System.out.println(countryCitysMap);


















    for (Country country : countryCitysMap.keySet()) {
      List<City> cityList = countryCitysMap.get(country);
    }
  }
}
