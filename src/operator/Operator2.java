package operator;

public class Operator2 {
    public static void main(String[] args) {
        // 문자열과 문자열 더하기
        String result1 = "hello " + "world";
        System.out.println(result1);

        // 문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1 + s2;
        System.out.println(result2);

        // 문자열과 숫자 더하기1
        String result3 = "a + b = " + 10; // "a + b = 10"
        System.out.println(result3);

        // 문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b = ";
        String result4 = str + num;  // "a + b = 20"
        System.out.println(result4);

        // 문자열에 더하는 것은 다 문자열이 된다.
    }
}
