package edu.cmu.cs.mvelezce.perf.debug.config.core;

public class Main {

  public static void main(String[] args) {
    boolean CLEAN = edu.cmu.cs.mvelezce.optionhotspot.sources.Sources.getClean(false);
    int DATA_SIZE = edu.cmu.cs.mvelezce.optionhotspot.sources.Sources.getDataSize(10);
    int ROUNDS = edu.cmu.cs.mvelezce.optionhotspot.sources.Sources.getRounds(2);

    TaskHandler taskHandler = new TaskHandler(CLEAN, DATA_SIZE, ROUNDS);
    taskHandler.work();
  }
}
