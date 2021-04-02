package edu.cmu.cs.mvelezce.perf.debug.config.core;

import edu.cmu.cs.mvelezce.perf.debug.config.utils.Utils;

public class Task {

  public void prep(boolean reset) {
    if (reset) { // Influenced by: CLEAN
      Utils.reset();
    }
  }

  public void allocateSpace(int blocksNeeded) {
    for (int i = 0; i < blocksNeeded; i++) { // Influenced by: DATA_SIZE
      Utils.incrementStorage();
    }
  }

  public void populate(int iterations) {
    for (int i = 0; i < iterations; i++) { // Influenced by: DATA_SIZE, ROUNDS
      Utils.write(i);
    }
  }
}
