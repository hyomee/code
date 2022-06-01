package behaviorPsrameter;

public class CarBlankColor implements CarPredicate{
  @Override
  public boolean test(Car car) {
    return Constant.COLOR_BLACK.equals(car.getColor());
  }
}
