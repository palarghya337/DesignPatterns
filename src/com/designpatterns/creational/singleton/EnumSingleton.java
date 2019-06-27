package com.designpatterns.creational.singleton;

import com.designpatterns.utils.Log;

public enum EnumSingleton {

  INSTANCE;
  
  /**
   * This is just a dummy method.
   */
  public void displaySingleton() {
    Log.logInfo("Singleton object was already created for {0}",
        Thread.currentThread().getStackTrace()[1].getClassName());
  } 
}
