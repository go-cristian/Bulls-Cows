package co.iyubinest.pikes_and_fixed;

interface Game {
  Game FAILURE = value -> Result.NOT_EQUAL;
  Game SUCCESS = value -> Result.ALL_EQUAL;

  Result guess(Value value);
}
