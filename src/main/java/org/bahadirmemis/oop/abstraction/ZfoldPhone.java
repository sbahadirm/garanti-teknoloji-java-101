package org.bahadirmemis.oop.abstraction;

/**
 * @author bahadirmemis
 */
public class ZfoldPhone extends Phone{

  /**
   * Apple/iphone14
   * @param brandAndModelInfo
   */
  public ZfoldPhone(String brandAndModelInfo) {
    super(brandAndModelInfo.split("/")[0], brandAndModelInfo.split("/")[1]);
  }

  @Override
  public void press1() {
    System.out.println("touched 1");
  }
}
