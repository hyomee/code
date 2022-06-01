package behaviorPsrameter;


import java.util.ArrayList;
import java.util.List;

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
}
