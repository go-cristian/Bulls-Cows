package co.iyubinest.pikes_and_fixed;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class AttemptGameShould {
  @Test public void endsOnMaxAttempts() {
    assertThat(
        new AttemptGame(1, Game.FAILURE).attempt(Value.NOT_EQUALS),
        is(
            new GameOver()
        )
    );
  }

  @Test public void notEndsWithSingleAttempt() {
    assertThat(
        new AttemptGame(2, Game.FAILURE).attempt(Value.NOT_EQUALS),
        not(
            new GameOver()
        )
    );
  }

  @Test public void endsWithMultipleAttempts() {
    AttemptGame game = new AttemptGame(2, Game.FAILURE);
    game.attempt(Value.NOT_EQUALS);
    Result result = game.attempt(Value.NOT_EQUALS);
    assertThat(
        result,
        is(
            new GameOver()
        )
    );
  }

  @Test public void bePlayable() {
    AttemptGame game = new AttemptGame(2, Game.FAILURE);
    game.attempt(Value.NOT_EQUALS);
    assertThat(
        game.isPlayable(),
        is(
            true
        )
    );
  }

  @Test public void beNotPlayable() {
    AttemptGame game = new AttemptGame(1, Game.FAILURE);
    game.attempt(Value.NOT_EQUALS);
    assertThat(
        game.isPlayable(),
        is(
            false
        )
    );
  }

  @Test public void win() {
    assertThat(
        new AttemptGame(2, Game.SUCCESS).attempt(Value.ALL_EQUAL),
        is(
            new Wins()
        )
    );
  }
}
