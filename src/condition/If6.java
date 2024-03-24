package condition;

public class If6 {
  public static void main(String[] args) {
    int price = 10000;
    int age = 10;
    int discount = 0;

    if (price >= 10000) {
      discount = discount + 1000;
      System.out.println("10000원 이상 구매시 1000원 할인");
    } else if (age <= 10) {
      discount = discount + 1000;
      System.out.println("어린이 1000원 할인");
    } else {
      System.out.println("할인 없음");
    }
    System.out.println("총 할인 금액 " + discount + "원");

    if(false) System.out.println("if 문에서 실행됨");
    System.out.println("if 문에서 실행 안됨");
  }
}

// if 문 다음에 실행할 명령어가 하나인 경우 {} 중괄호를 생략할 수 있다.
// if 문 안에 2개 이상 명령어를 포함하려면 {} 중괄호를 사용해야 한다.

