package co.iyubinest.pikes_and_fixed;

final class DefaultGame implements Game {

  private final Value value;

  private DefaultGame(Value value) {
    this.value = value;
  }

  public static Game with(Value value) {
    return new DefaultGame(value);
  }

  @Override
  public Result guess(Value value) {
    return this.value.compare(value);
  }
}
