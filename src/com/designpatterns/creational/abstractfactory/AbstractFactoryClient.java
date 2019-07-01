package com.designpatterns.creational.abstractfactory;

import com.designpatterns.creational.abstractfactory.AbstractFactory.FACTORY_TYPE;
import com.designpatterns.interfaces.IProductA;
import com.designpatterns.utils.Log;

/**
 * https://www.oodesign.com/abstract-factory-pattern.html
 * @author apal
 *
 */
public class AbstractFactoryClient {

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
    AbstractFactory abstractFactoryOne = FactoryMaker.getFactory(FACTORY_TYPE.FACTORY_ONE);
    IProductA productA = abstractFactoryOne.createProductA();
    productA.productOperationA();
    Log.logInfo(productA.productOperationB());
    
    AbstractFactory abstractFactoryTwo = FactoryMaker.getFactory(FACTORY_TYPE.FACTORY_TWO);
    IProductA productATwo = abstractFactoryTwo.createProductA();
    productATwo.productOperationA();
    Log.logInfo(productATwo.productOperationB());
  }
}
