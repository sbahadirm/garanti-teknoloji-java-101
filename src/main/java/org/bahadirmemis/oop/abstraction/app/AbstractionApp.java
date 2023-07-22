package org.bahadirmemis.oop.abstraction.app;

import org.bahadirmemis.oop.abstraction.OldPhone;
import org.bahadirmemis.oop.abstraction.Phone;
import org.bahadirmemis.oop.abstraction.SmartPhone;
import org.bahadirmemis.oop.abstraction.ZfoldPhone;

/**
 * @author bahadirmemis
 */
public class AbstractionApp {

  public static void main(String[] args) {

    Phone phone1 = new SmartPhone("Apple", "Iphone 14");
    //phone1.setBrandName("Apple");
    //phone1.setModelName("Iphone 14");
    Phone phone2 = new OldPhone("Nokia", "3310");
    //phone2.setBrandName("Nokia");
    //phone2.setModelName("3310");

    phone1.makeCall("5468447654");
    phone1.press1();
    phone1.printBrandAndModelInfo();

    phone2.makeCall("5468447654");
    phone2.press1();
    phone2.printBrandAndModelInfo();

    ZfoldPhone zfoldPhone = new ZfoldPhone("Samsung/zfold");
    zfoldPhone.press1();
    zfoldPhone.printBrandAndModelInfo();
  }
}
