package guru.springframework;

public class Dollar extends Money {

  public Dollar(int amount) {
    this.amount = amount;
  }

  Dollar times(int multipler) {
    return new Dollar(multipler * amount);
  }
}
