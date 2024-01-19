
package ensyuu11;

import java.util.Scanner;

/*外部クラス */
class Circle {
  // 円周率を定数として宣言
  public static final double PI = 3.1415;
  // 半径をインスタンス変数として宣言
  private double radius;

  // コンストラクタ
  public Circle(double radius) {
    // 半径を初期化
    this.radius = radius;
  }

  // 半径を取得するメソッド
  public double getRadius() {
    return radius;
  }

  // 半径を設定するメソッド
  public void setRadius(double radius) {
    this.radius = radius;
  }

  // 円周の長さを求めるメソッド
  public double getCircumference() {
    // 円周の長さ = 2 * 円周率 * 半径
    return 2 * PI * radius;
  }

  // 面積を求めるメソッド
  public double getArea() {
    // 面積 = 円周率 * 半径 * 半径
    return PI * radius * radius;
  }
}

class oobbleeee {

  // メインメソッド
  public class Main {
    public static void main(String[] args) {
      // 半径を入力
      System.out.print("半径を整数値で入力: ");
      Scanner scanner = new Scanner(System.in);
      double radius = scanner.nextDouble();
      scanner.close();
  
      // Circleクラスのインスタンスを作成
      Circle circle = new Circle(radius);
  
      // 円周の長さと面積を出力
      System.out.println("円周の長さは" + (double)circle.getCircumference() + "です。");
      System.out.println("円の面積は " +(double) circle.getArea() + "です。");
    }
  }
  
}