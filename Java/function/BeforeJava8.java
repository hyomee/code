import java.util.ArrayList;
import java.util.List;

public class BeforeJava8 {


  public  void runBeforeJava8() {
    List<Car> cars = new ArrayList<>();
    cars.add(new Car("소나타", "검정", "현대"));
    cars.add(new Car("SM5", "검정", "삼성"));
    cars.add(new Car("SM5", "흰색", "삼성"));

    List<Car> blackCars = filterCarColor(cars);
    System.out.println(blackCars.toString());
    List<Car> companyCars = filterCarCompany(cars);
    System.out.println(companyCars.toString());
  }

  private  List<Car> filterCarColor(List<Car> cars) {
    // 반환 값을 위한 반환 값
    List<Car> rnCars = new ArrayList<>();

    for ( Car car : cars) {
      if (Constant.COLOR_BLACK.equals(car.getColor())) {
        rnCars.add(car);
      }
    }

    return rnCars;
  }

  private  List<Car> filterCarCompany(List<Car> cars) {
    // 반환 값을 위한 반환 값
    List<Car> rnCars = new ArrayList<>();

    for ( Car car : cars) {
      if (Constant.COMPANY_SAMSUNG.equals(car.getCompany())) {
        rnCars.add(car);
      }
    }

    return rnCars;
  }
}
