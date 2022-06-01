class Car {
  private String name;
  private String color;
  private String company;

  Car(String name, String color, String company) {
    this.name = name;
    this.color = color;
    this.company = company;
  }

  public String getName() {
    return name;
  }

  public String getColor() {
    return color;
  }

  public String getCompany() {
    return company;
  }

  public static boolean isColorBlack(Car car) {
    return Constant.COLOR_BLACK.equals(car.getColor());
  }

  public static boolean isCompanySamsung(Car car) {
    return Constant.COMPANY_SAMSUNG.equals(car.getCompany());
  }

  @Override
  public String toString() {
    return "Car{" +
            "name='" + name + '\'' +
            ", color='" + color + '\'' +
            ", company='" + company + '\'' +
            '}';
  }
}