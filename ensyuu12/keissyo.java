package ensyuu12;

import java.util.Scanner;

class Calculator {
    public int calcSum(int a, int b) {
        return a + b;
    }

    public double calcAve(int a, int b) {
        return (a + b) / 2.0;
    }
}

class MoreCalc extends Calculator {
    public double calcPow(int base, int exponent) {
        return Math.pow(base, exponent);
    }
}

public class keissyo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザーに2つの整数を入力してもらう
        System.out.print("整数を入力してください: ");
        int num1 = scanner.nextInt();

        System.out.print("整数を入力してください: ");
        int num2 = scanner.nextInt();

        // MoreCalcクラスのインスタンスを生成
        MoreCalc moreCalc = new MoreCalc();

        // 合計値、平均値、累乗を計算して表示
        int sum = moreCalc.calcSum(num1, num2);
        double ave = moreCalc.calcAve(num1, num2);
        double pow = moreCalc.calcPow(num1, num2);

        System.out.println("Sum " + num1 + " and " + num2 + " = " + sum);
        System.out.println("Average " + num1 + " and " + num2 + " = " + (int)ave);
        System.out.println("Power " + num1 + " of " + num2 + " = " + (int)pow);

        scanner.close();
    }
}
