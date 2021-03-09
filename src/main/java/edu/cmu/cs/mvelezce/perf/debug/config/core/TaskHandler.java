package edu.cmu.cs.mvelezce.perf.debug.config.core;

import edu.cmu.cs.mvelezce.perf.debug.config.utils.Utils;

public class TaskHandler {

  private final boolean clean;
  private final int dataSize;
  private final int rounds;
  private final Task task = new Task();

  public TaskHandler(boolean clean, int dataSize, int rounds) {
    this.clean = clean;
    this.dataSize = dataSize;
    this.rounds = rounds;
  }

  public void work() {
    this.task.clean(this.clean);

    int blocksNeeded = this.dataSize / Utils.BLOCK_SIZE;
    this.task.allocateSpace(blocksNeeded);

    int iterations = blocksNeeded * this.rounds;
    this.populate(iterations);
    if (iterations > Utils.DEF_POOL_SIZE) {
      this.validate(iterations);
    }
  }

  private void validate(int iterations) {
    Utils.assertIterations(iterations);
    this.populate(iterations);
  }

  private void populate(int iterations) {
    this.task.populate(iterations);
  }
}
