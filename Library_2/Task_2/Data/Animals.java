package Library_2.Task_2.Data;

public abstract class Animals {

    private String name;
    private int age;

    public Animals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract String TypeAnimals();

    public abstract String diet();

    public abstract int speedMovement();

    @Override
    public String toString() {
        return String.format("Type: %s\n - Name: %s\n - Age: %d years\n - Diet: %s\n - Speed: %d m/sec\n",
                TypeAnimals(), name, age, diet(), speedMovement());
    }

}
