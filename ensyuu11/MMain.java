package ensyuu11;

class Student {
    String name;
    String studentNumber;
    int japaneseScore;
    int mathScore;
    int englishScore;

    public Student(String name, String studentNumber, int japaneseScore, int mathScore, int englishScore) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.japaneseScore = japaneseScore;
        this.mathScore = mathScore;
        this.englishScore = englishScore;
    }

    public double cuAverage() {
        double average = (japaneseScore + mathScore + englishScore) / 3.0;
        return Math.floor(average * 1000) / 1000 - 0.01;
    }

    public int TotalScore() {
        return japaneseScore + mathScore + englishScore;
    }
}
public class MMain {
    public static void main(String[] args) {
        Student[] students = {
            new Student("A さん", "001", 89, 65, 88),
            new Student("B さん", "002", 80, 95, 64),
            new Student("C さん", "003", 70, 80, 98)
        };

        for (Student student : students) {
            System.out.printf("%s 番  %s  平均点 %.2f\n", student.studentNumber, student.name, student.cuAverage());
        }
    }
}

