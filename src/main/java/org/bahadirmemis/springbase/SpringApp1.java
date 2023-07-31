package org.bahadirmemis.springbase;

/**
 * @author bahadirmemis
 */
public class SpringApp1 {

  public static void main(String[] args) {

    JsonUtil jsonUtil = new JsonUtil();
    ConvertJsonToObjectService jsonToObjectService = new ConvertJsonToObjectService(jsonUtil);
    ConvertObjectToJsonService objectToJsonService = new ConvertObjectToJsonService(jsonUtil);














    CalculatorWebService2 calculatorWebService2 = new CalculatorWebService2(jsonToObjectService, objectToJsonService);
  }
}
