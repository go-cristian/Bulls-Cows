final class DefaultGame implements Game {
  static final int DEFAULT_ATTEMPS = 10;
  private final String value;
  private int attempts;

  public static Game with(String value, int attempts) {
    return new DefaultGame(value, attempts);
  }

  public static DefaultGame with(String value) {
    return new DefaultGame(value, DEFAULT_ATTEMPS);
  }

  private DefaultGame(String value, int attempts) {
    this.value = value;
    this.attempts = attempts;
  }

  @Override
  public Result guess(String value) {
    int fixed = 0;
    int pikes = 0;
    for (int index = 0; index < this.value.length(); index++) {
      char toFind = value.charAt(index);
      if (toFind == this.value.charAt(index)) {
        fixed++;
      } else if (contains(toFind)) {
        pikes++;
      }
    }
    if (fixed == this.value.length()) {
      return Winner.create();
    } else {
      attempts--;
      if (attempts == 0) {
        return GameOver.create();
      } else {
        return PartialResult.with(fixed, pikes);
      }
    }
  }

  private boolean contains(char character) {
    return this.value.contains(String.valueOf(character));
  }
}
