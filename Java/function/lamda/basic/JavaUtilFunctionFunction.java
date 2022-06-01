package lamda.basic;

import behaviorPsrameter.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;

public class JavaUtilFunctionFunction {

  public static void main(String... args) {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("소나타", "검정", "현대"));
    cars.add(new Car("SM5", "검정", "삼성"));
    cars.add(new Car("쏘렌토", "흰색", "기아"));

    Function<Car, String> pFunction = (Car car)-> car.getCompany();
    List<String> result = map(cars, pFunction);
    System.out.println(result.toString());
  }

  public static <T, R> List<String> map(List<T> ls, Function<T, R> c) {
    List<String> result = new ArrayList<>();
    for ( T e : ls) {
      result.add((String) c.apply(e));
    }
    return result;
  }
}
