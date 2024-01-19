package operator;

public class Assign1 {
    public static void main(String[] args) {
        // 축약 대입연산자
        // 산술 연산자 + 대입연산자
        int a = 5;
        a += 3; // 8 (a = a + 3)
        a -= 2; // 6 (a = a - 2)
        a *= 4; // 24 (a = a * 4);
        a /= 3; // 8 (a = a / 3);
        a %= 5; // 3 (a = a % 5);
        System.out.println(a);
    }
}
