package condition;

public class If5 {
  public static void main(String[] args) {
    int price = 10000;
    int age = 10;
    int discount = 0;

    if (price >= 10000) {
      discount = discount + 1000;
      System.out.println("10000원 이상 구매시 1000원 할인");
    }
    if (age <= 10) {
      discount = discount + 1000;
      System.out.println("어린이 1000원 할인");
    }
    System.out.println("총 할인 금액 " + discount + "원");
  }
}
// 독립된 if 문
// 서로 관련없는 조건인 경우
// 조건이 모두 실행되야 하는 경우