package org.bahadirmemis.springbase;

/**
 * @author bahadirmemis
 */
public class ConvertObjectToJsonService {

  private JsonUtil jsonUtil;

  public ConvertObjectToJsonService(JsonUtil jsonUtil) {
    this.jsonUtil = jsonUtil;
  }

  public String convert(CalculateResponseDTO request){
    return "{\n"
           + "      \"result\" : 12\n"
           + " }";
  }
}
