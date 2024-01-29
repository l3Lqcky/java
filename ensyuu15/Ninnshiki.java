package ensyuu15;

import java.util.Scanner;

public class Ninnshiki {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("整数を入力 = ");

            if (scanner.hasNextInt()) {
                int inputNumber = scanner.nextInt();

                if (inputNumber % 2 == 0) {
                    System.out.println(inputNumber + " は偶数");
                } else {
                    System.out.println(inputNumber + " は奇数");
                }
            } else {
                throw new ArithmeticException("整数と認識できません！！");
            }
        } catch (ArithmeticException e) { 
            System.err.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
