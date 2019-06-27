package com.designpatterns.creational.singleton;

import java.util.Objects;

public class SingletonThreadSafe {
  
  private static SingletonThreadSafe instance;
  private SingletonThreadSafe() {
    /* As this is a singleton class
     * so we should not expose the
     * constructor to outside.
     **/
  }
  public static synchronized SingletonThreadSafe getInstance() {
    
    if (Objects.isNull(instance)) {
      instance = new SingletonThreadSafe();
    }
    return instance;
  }
}
