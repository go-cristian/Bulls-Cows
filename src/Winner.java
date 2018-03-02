final class Winner implements Result {

  public static Result create() {
    return new Winner();
  }

  @Override public int hashCode() {
    return super.hashCode();
  }

  @Override public boolean equals(Object obj) {
    return obj instanceof Winner;
  }

  @Override public String toString() {
    return "Winner{}";
  }
}
