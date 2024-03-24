package condition;

public class If3 {
  public static void main(String[] args) {
    int age = 20;
    // if 문 나열 -> 조건을 만족해도 불필요한 다음 조건을 계속 검사한다.
    // 모든 if 문 검사

    if(age <= 7) {
      System.out.println("미취학");
    }
    if(age>= 8 && age<=13) {
      System.out.println("초등학생");
    }
    if(age>=14 && age<=16) {
      System.out.println("중학생");
    }
    if(age>=17 && age<=19) {
      System.out.println("고등학생");
    }
    if(age>=20) {
      System.out.println("성인");
    }
  }
}
