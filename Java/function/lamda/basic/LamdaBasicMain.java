package lamda.basic;

public class LamdaBasicMain {
  public static void main(String[] args) {

    // 람다 사용
    Runnable r1 = () -> System.out.println("Hello 람다 사용 ");

    // 익명 클래스 사용
    Runnable r2 = new Runnable() {
      @Override
      public void run() {
        System.out.println("Hello 익명 클래스 사용");
      }
    };

    process(r1);
    process(r2);
    // 직접 전달
    process(() -> System.out.println("Hello 직접 전달 "));

  }

  public static void process(Runnable r) {
    r.run();
  }

}
