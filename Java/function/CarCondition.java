/**
 * 파라메터로 함수를 전달 하기 위한 인터페이스
 * @param <T>
 */
interface CarCondition<T> {
  boolean isCondition(T t);
}
