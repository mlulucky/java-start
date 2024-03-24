package loop;

public class Break2 {
  public static void main(String[] args) {
    int sum = 0;
    int i = 1;
    for(;;) {
      sum += i;
      if(sum >= 10) {
        System.out.println("합이 10보다 크면 종료: i=" + i + " sum=" + sum);
        break; // 반복문 종료
      }
      i++;
    }
    // for 문의 초기식,조건식,증감식은 모두 선택사항. 없어도 됨. 단 ; 세미클론으로 구분하기. -> while(true) 와 같은 무한 반복문이다.
  }
}
