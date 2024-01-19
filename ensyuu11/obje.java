package ensyuu11;

import java.util.Scanner;

public class obje {
    class Circle {
        double PI;

        PI = new PI(3.1415);
    }
    public static void main(String[] args) {
        Scanner seisuu = new Scanner(System.in);
        System.out.print("半径を整数値で入力：");
        Integer hankei = seisuu.nextInt();
        System.out.println("円周の長さは" + ((hankei + hankei) * PI) + "です。");
        System.out.println("円の面積は" + (hankei * hankei * PI) + "です。");
    }
}

