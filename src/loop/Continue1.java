package loop;

public class Continue1 {
  public static void main(String[] args) {
    int i =1;
    while(i<=5) { // 1,2,3,4,5
      if(i == 3) {
        i++;
        continue; // 다시 반복문의 조건식으로 이동. 이후 코드는 실행x
      }
      System.out.println(i);
      i++;
    }
  }
}
