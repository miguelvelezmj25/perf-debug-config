package edu.cmu.cs.mvelezce.perf.debug.config.core;

public class Main {

  public static void main(String[] args) {
    boolean clean = false;
    int dataSize = 10;
    int rounds = 2;

    TaskHandler taskHandler = new TaskHandler(clean, dataSize, rounds);
    taskHandler.work();
  }
}
