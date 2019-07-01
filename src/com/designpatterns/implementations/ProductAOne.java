package com.designpatterns.implementations;

import com.designpatterns.interfaces.IProductA;
import com.designpatterns.utils.Log;

public class ProductAOne implements IProductA {

  private static final String CLASS_NAME = ProductAOne.class.getSimpleName();
  
  @Override
  public void productOperationA() {
    Log.logInfo("Operation A for product {0} is running...", CLASS_NAME);
  }

  @Override
  public String productOperationB() {
    return "Operation B for product " + CLASS_NAME + " returned.";
  }
  
}
