package com.eu.miscedautils.CommonUtils;

public class ToolUsage {
  private static ToolUsage self = null;

  private ToolUsage() {
  }

  public static ToolUsage instance() {
    if (self == null) {
      self = new ToolUsage();
    }
    return self;
  }

  public int registerCompletionUsage(String toolOrFeatureName, String body) {
    return 0;
  }

  public int registerUsage(String toolOrFeatureName) {
    return 0;
  }

  public int sendMessage(String usageTxt, String msgBody) {
    return 0;
  }

  public int submitCrash(String toolName, String stk) {
    return 0;
  }

  public void closeAll() {
  }
}
