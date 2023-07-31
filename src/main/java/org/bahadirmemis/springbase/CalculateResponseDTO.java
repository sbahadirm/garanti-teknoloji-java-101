package org.bahadirmemis.springbase;

/**
 * @author bahadirmemis
 */
public class CalculateResponseDTO {

  private Integer result;

  public CalculateResponseDTO(Integer result) {
    this.result = result;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }
}
