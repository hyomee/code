package behaviorPsrameter;

import java.util.ArrayList;
import java.util.List;

public class BehaviorPsrameterMain {
  public static void main(String[] args) {

    List<Car> cars = new ArrayList<>();
    cars.add(new Car("소나타", "검정", "현대"));
    cars.add(new Car("SM5", "검정", "삼성"));
    cars.add(new Car("SM5", "흰색", "삼성"));


    CarService carService = new CarService();

    List<Car> carBlacks = carService.filterCar(cars, new CarBlankColor());
    System.out.println("-------------------------------");
    System.out.println(carBlacks.toString());

    List<Car> carSamsungs = carService.filterCar(cars, new CaeCompanySamsung());
    System.out.println("-------------------------------");
    System.out.println(carSamsungs.toString());

    // 익명 함수 사용
    List<Car> aonymousCar = carService.filterCar(cars, new CarPredicate() {
      @Override
      public boolean test(Car car) {
        return "소나타".equals(car.getName());
      }
    });

    System.out.println("-------------------------------");
    System.out.println(aonymousCar.toString());

    // 람다 사용
    List<Car> lamdaCar = carService.filterCar(cars, (Car car)->"소나타".equals(car.getName()));
    System.out.println("-------------------------------");
    System.out.println(lamdaCar.toString());
  }
}