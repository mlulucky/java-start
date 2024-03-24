package loop;

public class DoWhile1 {
  public static void main(String[] args) {
    int i = 10;
    while (i <3) {
      System.out.println("현재 숫자는:" + i);
      i++;
    }
    // while 문은 조건식이 참이 아닌 경우는 while 문 내부 코드는 실행되지 않는다.
  }
}
