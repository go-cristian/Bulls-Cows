import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameShould {

  @Test public void findOneFixed() {
    assertThat(
        DefaultGame.with("1234").guess("1567"),
        is(
            PartialResult.with(1, 0)
        )
    );
  }

  @Test public void findTwoFixed() {
    assertThat(
        DefaultGame.with("1234").guess("1267"),
        is(
            PartialResult.with(2, 0)
        )
    );
  }

  @Test public void findThreeFixed() {
    assertThat(
        DefaultGame.with("1234").guess("1237"),
        is(
            PartialResult.with(3, 0)
        )
    );
  }

  @Test public void findOnePike() {
    assertThat(
        DefaultGame.with("1234").guess("5671"),
        is(
            PartialResult.with(0, 1)
        )
    );
  }

  @Test public void findAllPikes() {
    assertThat(
        DefaultGame.with("1234").guess("4321"),
        is(
            PartialResult.with(0, 4)
        )
    );
  }

  @Test public void findTwoFixedTwoPikes() {
    assertThat(
        DefaultGame.with("1234").guess("1243"),
        is(
            PartialResult.with(2, 2)
        )
    );
  }

  @Test public void winner() {
    assertThat(
        DefaultGame.with("1234").guess("1234"),
        is(
            Winner.create()
        )
    );
  }

  @Test public void loseWithOnAttempt() {
    assertThat(
        DefaultGame.with("1234", 1).guess("1235"),
        is(
            GameOver.create()
        )
    );
  }

  @Test public void loseWithTwoAttempt() {
    Game game = DefaultGame.with("1234", 2);
    game.guess("1235");
    assertThat(
        game.guess("1235"),
        is(
            GameOver.create()
        )
    );
  }
}
