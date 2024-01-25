package ensyuu13;

abstract class Person {
    protected String name;
    protected String job;

    public Person(String name, String job) {
        this.name = name;
        this.job = job;
    }

    public abstract void introduce();
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, String job, String subject) {
        super(name, job);
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("担当科目：" + subject);
    }
}

class Cook extends Person {
    private String specialties;

    public Cook(String name, String job, String specialties) {
        super(name, job);
        this.specialties = specialties;
    }

    @Override
    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialties);
    }
}

public class Ouyou {
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
