package co.iyubinest.pikes_and_fixed;

import java.util.Scanner;

public class Client {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int size = scanner.nextInt();
    int[] values = new int[size];
    for (int i = 0; i < size; i++) {
      values[i] = scanner.nextInt();
    }
    AttemptGame game = new AttemptGame(5, DefaultGame.with(new NumberValue(values)));
    Result result;
    while (game.isPlayable()) {
      String guess = scanner.nextLine();
      result = game.attempt(new NumberValue(toInts(guess)));
      System.out.println("your result is: " + result.toString());
    }
  }

  private static int[] toInts(String guess) {
    int[] result = new int[guess.length()];
    for (int i = 0; i < guess.length(); i++) {
      result[i] = Integer.parseInt(String.valueOf(guess.charAt(i)));
    }
    return result;
  }
}
