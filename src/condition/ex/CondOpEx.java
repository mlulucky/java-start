package condition.ex;

public class CondOpEx {
  public static void main(String[] args) {
    // 더 큰 숫자 찾기 : 삼항연산자
    int a = 30;
    int b = 20;
    int max = (a > b) ? a : b;
    System.out.println("더 큰 숫자는 " + max + "입니다.");
  }
}
