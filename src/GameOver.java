final class GameOver implements Result {
  public static Result create() {
    return new GameOver();
  }

  @Override public int hashCode() {
    return super.hashCode();
  }

  @Override public boolean equals(Object obj) {
    return obj instanceof GameOver;
  }

  @Override public String toString() {
    return "GameOver{}";
  }
}
