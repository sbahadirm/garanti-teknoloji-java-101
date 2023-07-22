package org.bahadirmemis.oop.abstraction;

/**
 * @author bahadirmemis
 */
public abstract class Phone {

  private String brandName;
  private String modelName;

  public Phone(String brandName, String modelName) {
    this.brandName = brandName;
    this.modelName = modelName;
  }

  public void makeCall(String phoneNumber){
    System.out.println("calling to -> " + phoneNumber);
  }

  public abstract void press1();

  public void printBrandAndModelInfo(){
    System.out.println("Brand: " + brandName + " & Model: " + modelName);
  }

  public String getBrandName() {
    return brandName;
  }

  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }

  public String getModelName() {
    return modelName;
  }

  public void setModelName(String modelName) {
    this.modelName = modelName;
  }
}
