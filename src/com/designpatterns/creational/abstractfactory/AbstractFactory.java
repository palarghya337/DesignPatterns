package com.designpatterns.creational.abstractfactory;

import com.designpatterns.interfaces.IProductA;
import com.designpatterns.interfaces.IProductB;

public interface AbstractFactory {

  enum FACTORY_TYPE {
    FACTORY_ONE, FACTORY_TWO;
  }
  IProductA createProductA();
  IProductB createProductB();
}
