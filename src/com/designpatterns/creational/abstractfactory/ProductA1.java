package com.designpatterns.creational.abstractfactory;

import com.designpatterns.utils.Log;

public class ProductA1 implements AbstractProductA {

  public ProductA1() {
    Log.logInfo("Object is creating for {0}", ProductA1.class.getSimpleName());
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
