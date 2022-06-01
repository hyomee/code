package behaviorPsrameter;

public class CaeCompanySamsung implements CarPredicate{
  @Override
  public boolean test(Car car) {
    return Constant.COMPANY_SAMSUNG.equals(car.getCompany());
  }
}
