package function;

public class FunMain {

  public static void main(String[] args) {
    BeforeJava8 beforeJava8 = new BeforeJava8();
    beforeJava8.runBeforeJava8();

    AfterJava8 afterJava8 = new AfterJava8();
    System.out.println("-------------------------------");
    afterJava8.runAfterJava8();
    System.out.println("-------------------------------");
    afterJava8.afterJava8Method();
  }



}
