package co.iyubinest.pikes_and_fixed;

final class GameOver implements Result {

  @Override public int hashCode() {
    return super.hashCode();
  }

  @Override public boolean equals(Object obj) {
    return obj instanceof GameOver;
  }

  @Override public String toString() {
    return "GameOver{}";
  }

  @Override public boolean isWinner() {
    return false;
  }
}
