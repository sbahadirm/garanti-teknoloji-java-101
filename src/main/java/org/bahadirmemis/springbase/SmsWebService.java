package org.bahadirmemis.springbase;

/**
 * @author bahadirmemis
 */
public class SmsWebService {

  private ConvertJsonToObjectService jsonToObjectService;
  private ConvertObjectToJsonService objectToJsonService;

  public SmsWebService() {
    JsonUtil jsonUtil = new JsonUtil();
    jsonToObjectService = new ConvertJsonToObjectService(jsonUtil);
    objectToJsonService = new ConvertObjectToJsonService(jsonUtil);
  }

  public String sendSms(String jsonValue){

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
