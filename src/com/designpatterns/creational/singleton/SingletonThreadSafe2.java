package com.designpatterns.creational.singleton;

import java.util.Objects;

public class SingletonThreadSafe2 {
  
  private static SingletonThreadSafe2 instance;
  private SingletonThreadSafe2() {
    /* As this is a singleton class
     * so we should not expose the
     * constructor to outside.
     **/
  }
  public static SingletonThreadSafe2 getInstance() {

    if (Objects.isNull(instance)) {
      synchronized (SingletonThreadSafe2.class) {
        if (Objects.isNull(instance)) {
          
          instance = new SingletonThreadSafe2();
        }
      }
    }
    return instance;
  }
}
