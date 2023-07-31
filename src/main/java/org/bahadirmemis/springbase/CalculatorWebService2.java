package org.bahadirmemis.springbase;

/**
 * @author bahadirmemis
 */
public class CalculatorWebService2 {

  private ConvertJsonToObjectService jsonToObjectService;
  private ConvertObjectToJsonService objectToJsonService;

  public CalculatorWebService2(ConvertJsonToObjectService jsonToObjectService,
                               ConvertObjectToJsonService objectToJsonService) {
    this.jsonToObjectService = jsonToObjectService;
    this.objectToJsonService = objectToJsonService;
  }

  public String calculate(String jsonValue){

    CalculateRequest calculateRequest = jsonToObjectService.convert(jsonValue);

    Integer result = 0;
    Integer firstValue = calculateRequest.getFirstValue();
    Integer secondValue = calculateRequest.getSecondValue();
    if ("ADD".equals(calculateRequest.getOperation())){
      result = firstValue + secondValue;
    }

    CalculateResponseDTO calculateResponseDTO = new CalculateResponseDTO(result);

    String responseStr = objectToJsonService.convert(calculateResponseDTO);

    return responseStr;
  }
}
