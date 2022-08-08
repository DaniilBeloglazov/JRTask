package StreamAPI_java_ed._26;

public class Human {
    String name;
    Character sex;
    int age;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                '}';
    }

    public Human(String name, Character sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Integer getAge() {
        return age;
    }

    public Character getSex() {
        return sex;
    }

    public String getName() {
        return name;
    }
}
