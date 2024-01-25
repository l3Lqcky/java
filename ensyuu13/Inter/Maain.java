package ensyuu13.Inter;

public class Maain {
    public static void main(String[] args) {
        // Teacherクラスのインスタンス生成と情報表示
        Teacher teacher = new Teacher("竹井一馬", "教員", "情報処理");
        teacher.introduce();
        System.out.println();

        // Cookクラスのインスタンス生成と情報表示
        Cook cook = new Cook("大原太郎", "シェフ", "オムライス");
        cook.introduce();
    }
}

