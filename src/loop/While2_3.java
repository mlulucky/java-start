package loop;

public class While2_3 {
  public static void main(String[] args) {
    int sum=0;
    int i=1;
    int endNum = 10;
    // i=1, endNum=3 -> 3번 반복
    while(i<=endNum)  { // 조건식이 참인경우, while 문안의 코드를 실행한다.
      sum = sum+i;
      System.out.println("i=" + i + " sum=" + sum);
      i++; // while 문 실행식이 끝나면 다시 while 문으로 돌아간다.
      // while 문의 조건식이 거짓인 경우는 while 문은 종료되고, while 문 바깥 코드가 실행된다.
    }

  }
}
