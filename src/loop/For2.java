package loop;

public class For2 {
  public static void main(String[] args) {
    int sum = 0;
    int endNum = 3;
    // 1+2+3 = 6
    for(int i=1; i<= endNum; i++) {
      sum += i;
      System.out.println("i=" + i + " sum=" + sum);
    }
    // 1. 초기식 실행
    // 2. 조건식 참/거짓 확인
    // 3. 코드 실행
    // 4. 증감식 실행
    // 2,3,4 순서를 반복실행
    // -> 2 조건식이 거짓인 경우 반복문 종료
  }
}
