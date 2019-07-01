package com.designpatterns.creational.abstractfactory;

public interface AbstractFactory {

  enum FACTORY_TYPE {
    FACTORY1, FACTORY2;
  }
  AbstractProductA createProductA();
  AbstractProductB createProductB();
}
