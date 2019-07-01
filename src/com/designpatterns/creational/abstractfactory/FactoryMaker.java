package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.AbstractFactory.FACTORY_TYPE;

public class FactoryMaker {

  public static AbstractFactory getFactory(FACTORY_TYPE type) {
    
    if (FACTORY_TYPE.FACTORY1.equals(type)) {
      return new ConcreteFactory1();
    } else if (FACTORY_TYPE.FACTORY2.equals(type)) {
      return new ConcreteFactory2();
    }
    return null;
  }
}
