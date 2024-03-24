package loop;

public class DoWhile2 {
  public static void main(String[] args) {
    int i = 10;
    do {
      System.out.println("현재 숫자는:" + i);
      i++;
    }
    while (i < 3);
  }
}
// do while 문 : while 문 조건식 상관없이 do 문은 무조건 1번은 실행된다.
// do 문이 1번 실행 된 후, whilw 문의 조건식을 확인하여, 조건식이 거짓인 경우는 종료된다. 조건식이 참인 경우는 do 문을 반복 실행한다.

// do-while 문은 최초 한번은 코드 블럭을 꼭 실행해야 하는 경우 사용하면 된다.
