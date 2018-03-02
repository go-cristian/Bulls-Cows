package co.iyubinest.pikes_and_fixed;

import java.util.Objects;

final class PartialResult implements Result {

  private final int fixed;
  private final int pikes;

  private PartialResult(int fixed, int pikes) {
    this.fixed = fixed;
    this.pikes = pikes;
  }

  public static PartialResult with(int fixed, int pikes) {
    return new PartialResult(fixed, pikes);
  }

  @Override public boolean isWinner() {
    return false;
  }

  @Override public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    PartialResult result = (PartialResult) o;
    return fixed == result.fixed &&
        pikes == result.pikes;
  }

  @Override public int hashCode() {
    return Objects.hash(fixed, pikes);
  }

  @Override public String toString() {
    return "PartialResult{" +
        "fixed=" + fixed +
        ", pikes=" + pikes +
        '}';
  }
}
