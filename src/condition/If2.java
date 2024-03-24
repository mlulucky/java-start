package condition;

public class If2 {
  public static void main(String[] args) {
    int age = 15;
    if (age >= 18) { // 참일때 실행
      System.out.println("성인입니다.");
    } else { // 만족하는 조건이 없을때 실행
      System.out.println("미성년자입니다.");
    }
  }
}
