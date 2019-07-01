package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.AbstractFactory.FACTORY_TYPE;

/**
 * https://www.oodesign.com/abstract-factory-pattern.html
 * @author apal
 *
 */
public class Client {

  public static void main(String[] args) {
    /*
     * We should use the Abstract Factory design pattern when:
     * • the system needs to be independent from the way the
     * products it works with are created.
     * • the system is or should be configured to work with
     * multiple families of products.
     * • a family of products is designed to work only all together.
     * • the creation of a library of products is needed, for
     * which is relevant only the interface, not the implementation, too.
     * */
    AbstractFactory abstractFactory = FactoryMaker.getFactory(FACTORY_TYPE.FACTORY1);
    AbstractProductA productA = abstractFactory.createProductA();
    productA.operationA1();
    productA.operationA2();
  }
}
