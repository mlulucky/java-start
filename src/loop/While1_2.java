package loop;

public class While1_2 {
  public static void main(String[] args) {
    int count = 0;
    while (count < 3) { // count 가 3보다 작을때까지 반복실행 -> 조건문이 거짓인 경우 반복문 종료
      count++; // 1, 2, 3
      System.out.println("현재 숫자는 " + count);
    }
  }
}
