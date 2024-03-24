package condition;

public class If4 {
  public static void main(String[] args) {
    int age = 15;

    if (age <= 7) {
      System.out.println("미취학");
    } else if (age <= 13) { // 첫번째 조건이 false 이고 현재 조건이 true 일때 실행
      System.out.println("초등학생");
    } else if (age <= 16) {
      System.out.println("중학생");
    } else if (age <= 19) {
      System.out.println("고등학생");
    } else { // 20~ 성인
      System.out.println("성인");
    }
  }
}

// else if, else
// 서로 연관된 조건일때, if 문을 하나로 묶는 것!
// 참인 조건 하나만 실행된다
// 2개의 조건을 만족하는 경우라도, 위에서 부터 참인 조건 하나만 실행된다

// 위에서부터 조건을 체크
// 조건이 거짓인 경우 다음 조건으로 넘어간다.
// 조건이 참인 경우 조건문 실행후 전체 if 문 밖으로 나간다.
