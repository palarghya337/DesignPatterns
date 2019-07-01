package com.designpatterns.implementations;

import com.designpatterns.interfaces.IProductB;
import com.designpatterns.utils.Log;

public class ProductBTwo implements IProductB {

  private static final Object CLASS_NAME = ProductBTwo.class.getSimpleName();

  @Override
  public void operationB1() {
    Log.logInfo("Inside method operationB1 of {0} class", CLASS_NAME);
  }

  @Override
  public void operationB2() {
    Log.logInfo("Inside method operationB2 of {0} class", CLASS_NAME);
  }

}
