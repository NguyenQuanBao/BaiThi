public class Teacher extends people{
    private String level;
    private String experience;
    private String subject;

    public Teacher(String name, int age, boolean sex, double height, int weight, String level, String experience, String subject) {
        super(name, age, sex, height, weight);
        this.level = level;
        this.experience = experience;
        this.subject = subject;
    }
    public Teacher(){
        super();
        this.level= "Tiến sĩ";
        this.experience = "4 năm";
        this.subject= "OOP";
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "level='" + level + '\'' +
                ", experience='" + experience + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}

