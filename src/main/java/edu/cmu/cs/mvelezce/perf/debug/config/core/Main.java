package edu.cmu.cs.mvelezce.perf.debug.config.core;

public class Main {

  public static void main(String[] args) {
    boolean clean = true;
    int dataSize = 5;
    int rounds = 1;

    TaskHandler taskHandler = new TaskHandler(clean, dataSize, rounds);
    taskHandler.work();
  }
}
