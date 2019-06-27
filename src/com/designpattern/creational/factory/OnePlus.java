package com.designpattern.creational.factory;

public class OnePlus implements IMobile {
  
  private int ramSize;
  private int internalMemory;
  private String processorName;
  private String modelName;
  private double price;
  
  public OnePlus(int ramSize, int internalMemory, double price) {
    this.ramSize = ramSize;
    this.internalMemory = internalMemory;
    this.processorName = "OnePlusProcessor";
    this.modelName = "OnePlus";
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
