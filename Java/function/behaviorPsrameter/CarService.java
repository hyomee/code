package behaviorPsrameter;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class CarService {

  public List<Car> filterCar(List<Car> cars, CarPredicate carPredicate) {
    // 반환 값을 위한 반환 값
    List<Car> rnCars = new ArrayList<>();

    for ( Car car : cars) {
      if (carPredicate.test(car)) {
        rnCars.add(car);
      }
    }

    return rnCars;
  }


  public <T> List<T> filter(List<T> ts, Predicate<T> p) {
    List<T> rnCars = new ArrayList<>();

    for ( T e : ts) {
      if (p.test(e)) {
        rnCars.add(e);
      }
    }

    return rnCars;
  }
}
