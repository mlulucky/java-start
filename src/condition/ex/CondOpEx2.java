package condition.ex;

public class CondOpEx2 {
  public static void main(String[] args) {
    // 홀수 짝수 찾기 : 삼항연산자
    int x = 25;
    String res = (x%2 == 0) ? "짝수" : "홀수";
    System.out.println("x = " + x + ", " + res);
  }
}
