package operator;

public class Operator1 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;

        int sum = a + b;
        System.out.println("a + b = " + sum);

        // 뺄셈
        int diff = a - b;
        System.out.println("a - b = " + diff);

        // 곱셈
        int multi = a * b;
        System.out.println("a * b = " + multi);

        // 나눗셈
        int div = a / b; // 5/2 -> 2 // int 는 정수라서 소수점 표현이 안됨
        System.out.println("a / b = " + div);

        // 나머지
        int mod = a % b;
        System.out.println("a % b = " + mod);

//        int z = 10 / 0; // 숫자 0 으로 나누기 허용x -> 에러 발생
    }
}
