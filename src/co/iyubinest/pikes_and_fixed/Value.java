package co.iyubinest.pikes_and_fixed;

interface Value {

  Value NOT_EQUALS = new Value() {
    @Override public int size() {
      return 0;
    }

    @Override public Result compare(Value value) {
      return Result.NOT_EQUAL;
    }

    @Override public int at(int index) {
      return 0;
    }
  };

  Value ALL_EQUAL = new Value() {
    @Override public int size() {
      return 0;
    }

    @Override public Result compare(Value value) {
      return Result.ALL_EQUAL;
    }

    @Override public int at(int index) {
      return 0;
    }
  };

  int size();

  Result compare(Value value);

  int at(int index);
}
