package condition;

public class Switch3 {
  public static void main(String[] args) {
    int grade = 2;

    int coupon;
    switch (grade) {
      case 1:
        coupon = 1000;
        break;
      case 2:
      case 3:
        coupon = 3000; // grade 가 2 인 경우. 3인 경우 모두 실행
        break;
      default:
        coupon = 500;
    }
    System.out.println("발급받은 쿠폰 " + coupon);
  }
}

// switch 문 값이 같은지만 확인 (문자도 가능)