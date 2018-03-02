package co.iyubinest.pikes_and_fixed;

abstract class ValueComparision {

  final Value first;
  final Value second;

  ValueComparision(Value first, Value second) {
    this.first = first;
    this.second = second;
  }

  abstract int value();
}
