package Generics.taskGAME;

public abstract class Participat {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Participat(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
