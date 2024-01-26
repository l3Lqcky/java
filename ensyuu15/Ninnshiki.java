package ensyuu15;

import java.util.Scanner;

public class Ninnshiki {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        try {
            System.out.print("整数を入力 = ");

            // 整数が入力されるまでループ
            while (!stdIn.hasNextInt()) {
                System.out.println("整数と認識できません！！");
                stdIn.next(); // 不正な入力を読み捨てる
            }

            int inputInteger1 = stdIn.nextInt(); //値を代入

            if (inputInteger1 % 2 == 0) {
                System.out.println(inputInteger1 + "は偶数");
            } else {
                System.out.println(inputInteger1 + "は奇数");
            }

        }finally {
            stdIn.close(); //Scannerを終了
        }
    }
}
