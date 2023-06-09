package com.eu.miscedautils.CommonUtils;

public class LicenseManager {

  private static LicenseManager self = null;

  private LicenseManager() {
  }

  public static LicenseManager init() {
    if (self == null) {
      self = new LicenseManager();
    }
    return self;
  }

  public boolean isLicenseEnabledForFeature(FeatureType feature) {
    return true;
  }

  public boolean isValidLicense() {
    return true;
  }

  public void printLicenseChecoutFailure(FeatureType feature) {
  }

}
