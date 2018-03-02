package co.iyubinest.pikes_and_fixed;

final class DifferentPositionComparision extends ValueComparision {

  DifferentPositionComparision(Value first, Value second) {
    super(first, second);
  }

  public int value() {
    int counter = 0;
    for (int secondIndex = 0; secondIndex < second.size(); secondIndex++) {
      int number = second.at(secondIndex);
      for (int firstIndex = 0; firstIndex < first.size(); firstIndex++) {
        if (first.at(firstIndex) == number && secondIndex != firstIndex) {
          counter++;
        }
      }
    }
    return counter;
  }
}
