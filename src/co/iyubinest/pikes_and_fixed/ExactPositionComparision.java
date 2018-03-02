package co.iyubinest.pikes_and_fixed;

final class ExactPositionComparision extends ValueComparision {

  ExactPositionComparision(Value first, Value second) {
    super(first, second);
  }

  public int value() {
    int counter = 0;
    for (int i = 0; i < second.size(); i++) {
      if (first.at(i) == second.at(i)) {
        counter++;
      }
    }
    return counter;
  }
}
