package ensyuu6;

public class kuku {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++){
        System.out.println(i + "の段");
            for (int x = 1; x <= 9; x++){
            int y =i * x;
            System.out.println(i + "×" + x + "=" + y);
            }
        }
    }
}
