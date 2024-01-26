package ensyuu14;

import java.util.Scanner;

public class mosizuuszi {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("文字列を入力: ");
        String inputString = stdIn.nextLine();
        System.out.println("入力された文字列は" + inputString.length() + "です。"); 
    }
}
