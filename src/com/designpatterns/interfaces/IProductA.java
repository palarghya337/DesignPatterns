package com.designpatterns.interfaces;

public interface IProductA {

  public enum ProductType {
    PRODUCT_AONE, PRODUCT_ATWO, PRODUCT_ATHREE
  }
  void productOperationA();
  String productOperationB();
}
