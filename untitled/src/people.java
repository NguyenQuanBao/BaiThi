public class people {
    private String name ;
    private int age ;
    private boolean sex ;
    private double height ;
    private int weight  ;

    public people(String name, int age, boolean sex, double height, int weight) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
    }
    public people() {
        this.name = "An";
        this.age = 18;
        this.sex = true;
        this.height = 1.8;
        this.weight = 60;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "people{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
