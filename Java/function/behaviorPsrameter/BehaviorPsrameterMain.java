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
  }
}