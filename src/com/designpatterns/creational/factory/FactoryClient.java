package com.designpatterns.creational.factory;

import com.designpatterns.interfaces.IProductA;
import com.designpatterns.interfaces.IProductA.ProductType;
import com.designpatterns.utils.Log;

public class FactoryClient {

  public static void main(String[] args) {
    IProductA product = ProductFactory.createProductA(ProductType.PRODUCT_AONE);
    product.productOperationA();
    Log.logInfo(product.productOperationB());
    
    IProductA product2 = ProductFactory.createProductA(ProductType.PRODUCT_ATWO);
    product2.productOperationA();
    Log.logInfo(product2.productOperationB());
  }
}
