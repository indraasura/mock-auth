package com.mockauth;

import android.app.Application;

import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.soloader.SoLoader;

import java.util.List;

import com.facebook.react.shell.MainReactPackage;

import com.reactnativenavigation.NavigationApplication;
import com.reactnativenavigation.react.NavigationReactNativeHost;
import com.reactnativenavigation.react.ReactGateway;

import java.util.Arrays;

public class MainApplication extends NavigationApplication {



  protected ReactGateway createReactGateway() {
    ReactNativeHost
    host = new NavigationReactNativeHost(this, isDebug(), createAdditionalReactPackages()) {



      protected String getJSMainModuleName() {
         return "index";

      }

    };
     return new ReactGateway(this, isDebug(), host);

  }




  public boolean isDebug() {
    return BuildConfig.DEBUG;

  }

  protected List<ReactPackage> getPackages() {
           // Add additional packages you require here
                  // No need to add RnnPackage and MainReactPackage
                    return Arrays.<ReactPackage>asList(
                       // eg. new VectorIconsPackage()
                    );

  }




  public List<ReactPackage> createAdditionalReactPackages() {
     return getPackages();

  }
}