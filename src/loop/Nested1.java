package loop;

public class Nested1 {
  public static void main(String[] args) {
    // 중첩 반복문
    for (int i = 0; i < 2; i++) { // 0, 1
      System.out.println("외부 for 시작 i:" + i);
      for (int j = 0; j < 3; j++) { // 0, 1, 2
        System.out.println("-> 내부 for " + i + "-" + j);
      }
      System.out.println("외부 for 시작 i:" + i);
      System.out.println();
    }
  }
}
