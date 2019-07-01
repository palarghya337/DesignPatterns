package com.designpatterns.creational.abstractfactory;

import com.designpatterns.utils.Log;

public class ProductB2 implements AbstractProductB {

  public ProductB2() {
    Log.logInfo("Object is creating for {0}", ProductB2.class.getSimpleName());
  }
  
  @Override
  public void operationB1() {
    Log.logInfo("Inside the method operationB1");
  }

  @Override
  public void operationB2() {
    Log.logInfo("Inside the method operationB2");
  }
}
