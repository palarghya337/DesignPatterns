package com.designpatterns.creational.factory;

import com.designpatterns.implementations.ProductAOne;
import com.designpatterns.implementations.ProductATwo;
import com.designpatterns.interfaces.IProductA;
import com.designpatterns.interfaces.IProductA.ProductType;

/**
 * • The client needs a product, but instead of creating it directly
 * using the new operator, it asks the factory object for a new
 * product, providing the information about the type of object it
 * needs.
 * • The factory instantiates a new concrete product and then
 * returns to the client the newly created product(casted to
 * abstract product class).
 * • The client uses the products as abstract products without being
 * aware about their concrete implementation.
 * @author apal
 *
 */
public class ProductFactory {

  private ProductFactory() {
    /* This is a factory class so we are not
     * providing a way to create an Object.
     **/
  }
  public static IProductA createProductA(ProductType productType) {
    
    IProductA product = null;
    if (ProductType.PRODUCT_AONE.equals(productType)) {
      product = new ProductAOne();
    } else if (ProductType.PRODUCT_ATWO.equals(productType)) {
      product = new ProductATwo();
    }
    return product;
  }
}
