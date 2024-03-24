package condition;

public class Switch2 {
  public static void main(String[] args) {
    int grade = 10;

    int coupon;
    switch (grade) {
      case 1:
        coupon = 1000;
        break;
      case 2:
        coupon = 2000;
        break;
      case 3:
        coupon = 3000;
        break;
      default:
        coupon = 500;
    }
    System.out.println("발급받은 쿠폰 " + coupon);
  }
}

// switch 는 단순히 값이 같은지만 비교할 수 있다.
// if, if-else, else 문과 동일하다.
// if 문 보다 좀더 직관적이다.

// break 를 만나면 switch 문을 빠져나온다.
