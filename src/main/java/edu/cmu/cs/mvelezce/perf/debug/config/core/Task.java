package edu.cmu.cs.mvelezce.perf.debug.config.core;

import edu.cmu.cs.mvelezce.perf.debug.config.utils.Utils;

public class Task {

  public void clean(boolean clean) {
    if (clean) {
      Utils.clean(); // INTERNAL ONLY
    }
  }

  public void allocateSpace(int blocksNeeded) {
    for (int i = 0; i < blocksNeeded; i++) {
      Utils.incrementStorage(); // INTERNAL ONLY
    }
  }

  public void populate(int iterations) {
    for (int i = 0; i < iterations; i++) {
      Utils.write(i); // INTERNAL ONLY
    }
  }
}
