package com.designpatterns.creational.abstractfactory;

import com.designpatterns.implementations.ProductATwo;
import com.designpatterns.implementations.ProductBTwo;
import com.designpatterns.interfaces.IProductA;
import com.designpatterns.interfaces.IProductB;

public class ConcreteFactoryTwo implements AbstractFactory {

  @Override
  public IProductA createProductA() {
    return new ProductATwo();
  }

  @Override
  public IProductB createProductB() {
    return new ProductBTwo();
  }

}
