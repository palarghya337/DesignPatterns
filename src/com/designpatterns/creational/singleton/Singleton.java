package com.designpatterns.creational.singleton;

import java.util.Objects;

public class Singleton {

  private static Singleton instance;
  
  private Singleton() {
    /* As this is a singleton class
     * so we should not expose the
     * constructor to outside.
     **/
  }
  public static Singleton getInstance() {
    
    if (Objects.isNull(instance)) {
      instance = new Singleton();
    }
    return instance;
  }
}
