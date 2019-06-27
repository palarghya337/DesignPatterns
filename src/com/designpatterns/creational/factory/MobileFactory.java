package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.IMobile.BRAND;

public class MobileFactory {

  private MobileFactory() {
    /* This is a factory class so we are not
     * providing a way to create an Object.
     **/
  }
  public static IMobile createMobile(BRAND brand) {
    
    IMobile mobile = null;
    if (IMobile.BRAND.IPHONE.equals(brand)) {
      mobile = new IPhone(4, 64, "IOSProcessor", "iPhoneSE", 16999);
    } else if (BRAND.ONE_PLUS.equals(brand)) {
      mobile = new OnePlus(8, 128, 32999);
    }
    return mobile;
  }
}
