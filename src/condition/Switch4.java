package condition;

public class Switch4 {
  public static void main(String[] args) {
    int grade = 2;

    int coupon = switch (grade) {
      case 1 -> 1000; // 결과값이 변수 coupon 에 대입된다.
      case 2 -> 2000;
      case 3 -> 3000;
      default -> 500;
    };
    System.out.println("발급받은 쿠폰 " + coupon);
  }
}

// 자바 14 부터 새로운 switch 문