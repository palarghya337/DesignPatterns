package com.designpatterns.creational.abstractfactory;

import com.designpatterns.implementations.ProductAOne;
import com.designpatterns.implementations.ProductBOne;
import com.designpatterns.interfaces.IProductA;
import com.designpatterns.interfaces.IProductB;

public class ConcreteFactoryOne implements AbstractFactory {

  @Override
  public IProductA createProductA() {
    return new ProductAOne();
  }

  @Override
  public IProductB createProductB() {
    return new ProductBOne();
  }

}
