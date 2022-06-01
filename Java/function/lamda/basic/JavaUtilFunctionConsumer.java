package lamda.basic;

import behaviorPsrameter.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class JavaUtilFunctionConsumer {

  public static void main(String... args) {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("소나타", "검정", "현대"));
    cars.add(new Car("SM5", "검정", "삼성"));
    cars.add(new Car("SM5", "흰색", "삼성"));

    Consumer<Car> pCar = (Car car)-> System.out.println(car.toString());
    forEach(cars, pCar);
  }

  public static <T> void forEach(List<T> ls, Consumer<T> c) {
     for ( T e : ls) {
      c.accept(e);
    }
  }
}
