package behaviorPsrameter;

public class Car {
  private String name;
  private String color;
  private String company;

  public Car(String name, String color, String company) {
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


  @Override
  public String toString() {
    return "Car{" +
            "name='" + name + '\'' +
            ", color='" + color + '\'' +
            ", company='" + company + '\'' +
            '}';
  }
}