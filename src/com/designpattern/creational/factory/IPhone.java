package com.designpattern.creational.factory;

public class IPhone implements IMobile {

  private int ramSize;
  private int internalMemory;
  private double price;
  private String processorName;
  private String modelName;
  
  public IPhone(int ramSize, int internalMemory, String processorName,
      String modelName, double price) {
    
    this.ramSize = ramSize;
    this.internalMemory = internalMemory;
    this.processorName = processorName;
    this.modelName = modelName;
    this.price = price;
  }
  @Override
  public int ramSize() {
    return ramSize;
  }

  @Override
  public int internalMemory() {
    return internalMemory;
  }

  @Override
  public String processorName() {
    return processorName;
  }

  @Override
  public double price() {
    return price;
  }

  @Override
  public String modelName() {
    return modelName;
  }
}
