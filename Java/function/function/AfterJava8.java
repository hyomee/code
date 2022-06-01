package function;

import java.util.ArrayList;
import java.util.List;

public class AfterJava8 {

  public  void runAfterJava8() {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("소나타", "검정", "현대"));
    cars.add(new Car("SM5", "검정", "삼성"));
    cars.add(new Car("SM5", "흰색", "삼성"));

    List<Car> blackCars = filterCar(cars, Car :: isColorBlack);
    System.out.println(blackCars.toString());
    List<Car> companyCars = filterCar(cars, Car :: isCompanySamsung);
    System.out.println(companyCars.toString());
  }


  public  void afterJava8Method() {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("소나타", "검정", "현대"));
    cars.add(new Car("SM5", "검정", "삼성"));
    cars.add(new Car("SM5", "흰색", "삼성"));

    List<Car> blackCars = filterCar(cars, (Car car) -> Constant.COLOR_BLACK.equals(car.getColor()));
    System.out.println(blackCars.toString());
    List<Car> companyCars = filterCar(cars, (Car car) -> Constant.COMPANY_SAMSUNG.equals(car.getCompany()));
    System.out.println(companyCars.toString());
  }

  private  List<Car> filterCar(List<Car> cars, CarCondition<Car> carCondition) {
    // 반환 값을 위한 반환 값
    List<Car> rnCars = new ArrayList<>();

    for ( Car car : cars) {
      if (carCondition.isCondition(car)) {
        rnCars.add(car);
      }
    }

    return rnCars;
  }



}
