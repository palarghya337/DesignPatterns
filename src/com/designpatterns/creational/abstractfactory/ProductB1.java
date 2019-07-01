package com.designpatterns.creational.abstractfactory;

import com.designpatterns.utils.Log;

public class ProductB1 implements AbstractProductB {

  public ProductB1() {
    Log.logInfo("Object is creating for {0}", ProductB1.class.getSimpleName());
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
