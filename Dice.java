public class Dice {
  public static void main(String[] args) {
    byte twoCount = 0;
    byte fourCount = 0;
    byte sixCount = 0;
    byte sevenCount = 0;
    for (byte i = 0; i < 20; i++) {
      double diceRoll = (roll() + roll());
      System.out.println(diceRoll);
      if (diceRoll == 2) {
        twoCount++;
      } else if (diceRoll == 4) {
        fourCount++;
      } else if (diceRoll == 6) {
        sixCount++;
      } else if (diceRoll == 7) {
        sevenCount++;
      }
    }
    System.out.println("");
    System.out.println(String.format("2: %d", twoCount));
    System.out.println(String.format("4: %d", fourCount));
    System.out.println(String.format("6: %d", sixCount));
    System.out.println(String.format("7: %d", sevenCount));
  }

  private static double roll() {
    return Math.floor((Math.random() * 6 + 1));
  }
}
