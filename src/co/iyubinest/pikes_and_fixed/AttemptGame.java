package co.iyubinest.pikes_and_fixed;

import java.util.ArrayList;
import java.util.List;

final class AttemptGame {
  private final int maxAttempts;
  private final List<Result> attempts;
  private final Game game;

  AttemptGame(int attempts, Game game) {
    this.maxAttempts = attempts;
    this.attempts = new ArrayList<>(attempts);
    this.game = game;
  }

  public Result attempt(Value value) {
    Result result = game.guess(value);
    attempts.add(result);
    if (result.isWinner()) {
      return new Wins();
    } else if (maxAttemptsReached()) {
      return new GameOver();
    } else {
      return result;
    }
  }

  private boolean maxAttemptsReached() {
    return attempts.size() == maxAttempts;
  }

  public boolean isPlayable() {
    return !maxAttemptsReached();
  }
}
