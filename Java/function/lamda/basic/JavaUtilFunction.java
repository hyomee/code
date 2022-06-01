package lamda.basic;



import behaviorPsrameter.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class JavaUtilFunction {

  public static void main(String... args) {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("소나타", "검정", "현대"));
    cars.add(new Car("SM5", "검정", "삼성"));
    cars.add(new Car("SM5", "흰색", "삼성"));

    Predicate<Car> pCar = (Car car)-> "검정".equals(car.getColor());
    List<Car> blackCar = filetr(cars, pCar);
    Runnable runnable = () -> System.out.println(blackCar.toString());
    runnable.run();
  }

  public static <T> List<T> filetr(List<T> ls, Predicate<T> p) {
    List<T> resuts = new ArrayList<>();

    for ( T e : ls) {
      if (p.test(e)) {
        resuts.add(e);
      }
    }

    return resuts;
  }
}
