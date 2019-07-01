package com.designpatterns.creational.factory;

import com.designpatterns.creational.factory.IMobile.BRAND;
import com.designpatterns.utils.Log;

public class Client {

  public static void main(String[] args) {
    IMobile mobile = MobileFactory.createMobile(BRAND.ONE_PLUS);
    Log.logInfo("Model Name: {0}", mobile.modelName());
    Log.logInfo("Internal Memory: {0}", mobile.internalMemory());
    Log.logInfo("RAM: {0}", mobile.ramSize());
    Log.logInfo("Processor: {0}", mobile.processorName());
  }
}
