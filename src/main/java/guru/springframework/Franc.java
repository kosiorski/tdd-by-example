package guru.springframework;

public class Franc extends Money {

  public Franc(int amount) {
    this.amount = amount;
  }

  public Money times(int multipler) {
    return new Franc(multipler * amount);
  }
}
