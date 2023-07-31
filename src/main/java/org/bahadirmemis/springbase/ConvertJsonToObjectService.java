package org.bahadirmemis.springbase;

/**
 * @author bahadirmemis
 */
public class ConvertJsonToObjectService {

  private JsonUtil jsonUtil;

  public ConvertJsonToObjectService(JsonUtil jsonUtil) {
    this.jsonUtil = jsonUtil;
  }

  public CalculateRequest convert(String str){
    return new CalculateRequest(10, 2, "ADD");
  }
}
