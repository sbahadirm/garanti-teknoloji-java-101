package org.bahadirmemis.springbase;

/**
 * @author bahadirmemis
 */
public class CalculateRequest {

  private Integer firstValue;
  private Integer secondValue;
  private String operation;

  public CalculateRequest() {
  }

  public CalculateRequest(Integer firstValue, Integer secondValue, String operation) {
    this.firstValue = firstValue;
    this.secondValue = secondValue;
    this.operation = operation;
  }

  public Integer getFirstValue() {
    return firstValue;
  }

  public void setFirstValue(Integer firstValue) {
    this.firstValue = firstValue;
  }

  public Integer getSecondValue() {
    return secondValue;
  }

  public void setSecondValue(Integer secondValue) {
    this.secondValue = secondValue;
  }

  public String getOperation() {
    return operation;
  }

  public void setOperation(String operation) {
    this.operation = operation;
  }
}
