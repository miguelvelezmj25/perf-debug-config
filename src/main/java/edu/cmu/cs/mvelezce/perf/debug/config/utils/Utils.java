package edu.cmu.cs.mvelezce.perf.debug.config.utils;

public class Utils {

  public static final int BLOCK_SIZE = 1;
  public static final int DEF_POOL_SIZE = 10;

  public static void clean() {
    try {
      Thread.sleep(700);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void incrementStorage() {
    try {
      Thread.sleep(500);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void write(int i) {
    try {
      Thread.sleep(300);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }

  public static void assertIterations(int threshold) {}
}
