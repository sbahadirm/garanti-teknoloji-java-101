package org.bahadirmemis.springbase;

/**
 * @author bahadirmemis
 */
public class CalculatorWebService3 {

  private ConvertJsonToObjectService jsonToObjectService;
  private ConvertObjectToJsonService objectToJsonService;

  public CalculatorWebService3(ConvertJsonToObjectService jsonToObjectService,
                               ConvertObjectToJsonService objectToJsonService) {
    this.jsonToObjectService = jsonToObjectService;
    this.objectToJsonService = objectToJsonService;
  }

  public void setJsonToObjectService(ConvertJsonToObjectService jsonToObjectService) {
    this.jsonToObjectService = jsonToObjectService;
  }

  public void setObjectToJsonService(ConvertObjectToJsonService objectToJsonService) {
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
