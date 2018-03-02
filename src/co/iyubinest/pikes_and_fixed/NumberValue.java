package co.iyubinest.pikes_and_fixed;

final class NumberValue implements Value {

  private final int[] numbers;

  NumberValue(int... numbers) {
    this.numbers = numbers;
  }

  @Override public int size() {
    return numbers.length;
  }

  @Override public int at(int index) {
    return numbers[index];
  }

  @Override
  public Result compare(Value value) {
    int pikes = pikesOn(value);
    int fixed = fixedOn(value);
    return PartialResult.with(fixed, pikes);
  }

  private int fixedOn(Value value) {
    return new ExactPositionComparision(this, value).value();
  }

  private int pikesOn(Value value) {
    return new DifferentPositionComparision(this, value).value();
  }
}
