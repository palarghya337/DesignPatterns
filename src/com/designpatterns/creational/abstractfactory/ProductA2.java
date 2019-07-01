package com.designpatterns.creational.abstractfactory;

import com.designpatterns.utils.Log;

public class ProductA2 implements AbstractProductA {

  public ProductA2() {
    Log.logInfo("Object is creating for {0}", ProductA2.class.getSimpleName());
  }
  
  @Override
  public void operationA1() {
    Log.logInfo("Inside method operationA1");
  }

  @Override
  public void operationA2() {
    Log.logInfo("Inside method operationA2");
  }

}
