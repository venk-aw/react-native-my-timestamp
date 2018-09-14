
package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNMyTimestampModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNMyTimestampModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNMyTimestamp";
  }

  @ReactMethod
  public void getTimeStamp(Callback successCallback, Callback failureCallback) {
    try {
      Long tsLong = System.currentTimeMillis()/1000;
      successCallback.invoke(tsLong.toString());
    } catch (Exception e) {
      failureCallback.invoke(e.getMessage());
    }
  }
}