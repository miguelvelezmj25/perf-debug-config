package edu.cmu.cs.mvelezce.perf.debug.config.core;

public class Main {

  public static void main(String[] args) {
    boolean CLEAN = true;
    int DATA_SIZE = 5;
    int ROUNDS = 2;

    TaskHandler taskHandler = new TaskHandler(CLEAN, DATA_SIZE, ROUNDS);
    taskHandler.work();
  }
}
