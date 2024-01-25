package ensyuu13.Inter;

public class Cook implements Person {
    private String specialties;
    private String name;
    private String job;

    public Cook(String name, String job, String specialties) {
        this.name = name;
        this.job = job;
        this.specialties = specialties;
        
    }

    @Override
    public void introduce() {
        System.out.println("氏名：" + name);
        System.out.println("職種：" + job);
        System.out.println("得意料理：" + specialties);
    }
}
