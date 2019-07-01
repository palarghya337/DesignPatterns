package com.designpatterns.implementations;

import com.designpatterns.interfaces.IProductB;
import com.designpatterns.utils.Log;

public class ProductBOne implements IProductB {

  private static final String CLASS_NAME = ProductBOne.class.getSimpleName();

  @Override
  public void operationB1() {
    Log.logInfo("Inside method operationB1 of {0} class", CLASS_NAME);
  }

  @Override
  public void operationB2() {
    Log.logInfo("Inside method operationB2 of {0} class", CLASS_NAME);
  }
}
