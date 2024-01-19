package ensyuu9;

import java.util.Scanner;

public class list {

    static void display(String school, String name) {
        System.out.println("学校名:"+school);
        System.out.println("名前:"+name);
    }
    public static void main(String[] args) {


        Scanner stdIn = new Scanner(System.in);
        String school = stdIn.nextLine();
        String name = stdIn.nextLine();
        display(school, name);
        
    }
}
