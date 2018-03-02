package co.iyubinest.pikes_and_fixed;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GameShould {

  @Test public void findOneFixed() {
    assertThat(
        DefaultGame.with(new NumberValue(1, 2, 3, 4))
            .guess(new NumberValue(1, 5, 6, 7)),
        is(
            PartialResult.with(1, 0)
        )
    );
  }

  @Test public void findTwoFixed() {
    assertThat(
        DefaultGame.with(new NumberValue(1, 2, 3, 4))
            .guess(new NumberValue(1, 2, 6, 7)),
        is(
            PartialResult.with(2, 0)
        )
    );
  }

  @Test public void findOnePike() {
    assertThat(
        DefaultGame.with(new NumberValue(1, 2, 3, 4))
            .guess(new NumberValue(5, 6, 1, 8)),
        is(
            PartialResult.with(0, 1)
        )
    );
  }

  @Test public void findTwoPikes() {
    assertThat(
        DefaultGame.with(new NumberValue(1, 2, 3, 4))
            .guess(new NumberValue(5, 6, 1, 2)),
        is(
            PartialResult.with(0, 2)
        )
    );
  }

  @Test public void findTwoPikesTwoFixed() {
    assertThat(
        DefaultGame.with(new NumberValue(1, 2, 3, 4))
            .guess(new NumberValue(1, 2, 4, 3)),
        is(
            PartialResult.with(2, 2)
        )
    );
  }

  @Test public void findAllPikes() {
    assertThat(
        DefaultGame.with(new NumberValue(1, 2, 3, 4))
            .guess(new NumberValue(4, 3, 2, 1)),
        is(
            PartialResult.with(0, 4)
        )
    );
  }

  @Test public void findAllFixed() {
    assertThat(
        DefaultGame.with(new NumberValue(1, 2, 3, 4))
            .guess(new NumberValue(1, 2, 3, 4)),
        is(
            PartialResult.with(4, 0)
        )
    );
  }
}
