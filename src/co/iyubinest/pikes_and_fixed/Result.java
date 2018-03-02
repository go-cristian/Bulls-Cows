package co.iyubinest.pikes_and_fixed;

interface Result {
  Result NOT_EQUAL = new Result() {
    @Override public boolean isWinner() {
      return false;
    }
  };
  Result ALL_EQUAL = new Result() {
    @Override public boolean isWinner() {
      return true;
    }
  };

  boolean isWinner();
}
