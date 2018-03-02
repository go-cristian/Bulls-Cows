package co.iyubinest.pikes_and_fixed;

final class Wins implements Result {
  @Override public boolean isWinner() {
    return true;
  }

  @Override public int hashCode() {
    return super.hashCode();
  }

  @Override public boolean equals(Object obj) {
    return obj instanceof Wins;
  }

  @Override public String toString() {
    return "co.iyubinest.pikes_and_fixed.Wins{}";
  }
}
