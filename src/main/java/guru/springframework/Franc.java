package guru.springframework;

public class Franc extends Money {

  public Franc(int amount, String currency) {
    super(amount, currency);
  }

  public Money times(int multipler) {
    return Money.franc(multipler * amount);
  }
}
