package ensyuu12;

class Person {
    private String name;
    private String occupation;

    public Person(String name, String occupation) {
        this.name = name;
        this.occupation = occupation;
    }

    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職業：" + occupation);
    }
}

class Teacher extends Person {
    private String subject;

    public Teacher(String name, String subject) {
        super(name, "教員");
        this.subject = subject;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("担当科目：" + subject);
    }
}

class Cook extends Person {
    private String speciality;

    public Cook(String name, String speciality) {
        super(name, "シェフ");
        this.speciality = speciality;
    }

    @Override
    public void introduce() {
        super.introduce();
        System.out.println("得意料理：" + speciality);
    }
}

public class Mmmain {
    public static void main(String[] args) {
        // Teacherクラスのインスタンス生成と情報表示
        Teacher teacher = new Teacher("近藤勇", "Go 言語");
        teacher.introduce();
        System.out.println();

        // Cookクラスのインスタンス生成と情報表示
        Cook cook = new Cook("沖田総司", "オムライス");
        cook.introduce();
    }
}
