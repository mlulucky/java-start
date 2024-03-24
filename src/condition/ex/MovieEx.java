package condition.ex;

public class MovieEx {
  public static void main(String[] args) {
    double rating = 9;
    if(rating <= 9) {
      System.out.println("'어바웃타임'을 추천합니다.");
    }
    if (rating <= 8) {
      System.out.println("'토이 스토리'을 추천합니다.");
    }
    if (rating <= 7) {
      System.out.println("'고질라'을 추천합니다.");
    }
  }
}
