package org.bahadirmemis.springbase;

/**
 * @author bahadirmemis
 */
public class SpringApp2 {

  public static void main(String[] args) {

    JsonUtil jsonUtil = new JsonUtil();
    ConvertJsonToObjectService jsonToObjectService = new ConvertJsonToObjectService(jsonUtil);
    ConvertObjectToJsonService objectToJsonService = new ConvertObjectToJsonService(jsonUtil);


    // field injection
    //CalculatorWebService3 calculatorWebService3 = new CalculatorWebService3();
    //calculatorWebService3.objectToJsonService = objectToJsonService;
    //calculatorWebService3.jsonToObjectService = jsonToObjectService;

    // setter injection
    //CalculatorWebService3 calculatorWebService3 = new CalculatorWebService3();
    //calculatorWebService3.setObjectToJsonService(objectToJsonService);
    //calculatorWebService3.setJsonToObjectService(jsonToObjectService);

    // constructor injection
    //CalculatorWebService3 calculatorWebService3 = new CalculatorWebService3(jsonToObjectService, objectToJsonService);
  }
}
