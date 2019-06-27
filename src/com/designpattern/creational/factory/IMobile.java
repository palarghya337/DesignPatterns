package com.designpattern.creational.factory;

public interface IMobile {

  public enum BRAND {
    IPHONE, ONE_PLUS, SAMSUNG
  }
  int ramSize();
  int internalMemory();
  String processorName();
  double price();
  String modelName();
}
