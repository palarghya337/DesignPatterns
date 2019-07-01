package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.AbstractFactory.FACTORY_TYPE;

public class FactoryMaker {

  private FactoryMaker() {
    /* This is a factory class so not providing
     * any way to create an Object.
     **/
  }
  public static AbstractFactory getFactory(FACTORY_TYPE type) {
    
    if (FACTORY_TYPE.FACTORY_ONE.equals(type)) {
      return new ConcreteFactoryOne();
    } else if (FACTORY_TYPE.FACTORY_TWO.equals(type)) {
      return new ConcreteFactoryTwo();
    }
    return null;
  }
}
